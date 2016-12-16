//Laba3

object FunSets {
    /**
    * We represent a set by its characteristic function, i.e.
    * its `contains` predicate.
    */
    type Set = Int => Boolean

    /**
    * Indicates whether a set contains a given element.
    */
    def contains(s: Set, elem: Int): Boolean = s(elem)

    /**
    * Returns the set of the one given element.
    */
    def singletonSet(elem: Int): Set = ((e:Int) => elem == e)

    /**
    * Returns the union of the two given sets,
    * the sets of all elements that are in either `s` or `t`.
    */
    def union(s: Set, t: Set): Set = (e => contains(s,e) || contains(t,e)) 

    /**
    * Returns the intersection of the two given sets,
    * the set of all elements that are both in `s` and `t`.
    */
    def intersect(s: Set, t: Set): Set = (e => contains(s,e) && contains(t,e)) 

    /**
    * Returns the difference of the two given sets,
    * the set of all elements of `s` that are not in `t`.
    */
    def diff(s: Set, t: Set): Set = (e => contains(s,e) && !contains(t,e)) 

    /**
    * Returns the subset of `s` for which `p` holds.
    */
    def filter(s: Set, p: Int => Boolean): Set = (e => contains(s,e) && p(e))

    /**
    * The bounds for `forall` and `exists` are +/- 1000.
    */
    val bound = 1000

    /**
    * Returns whether all bounded integers within `s` satisfy `p`.
    */
    def forall(s: Set, p: Int => Boolean): Boolean = {
        
        def check(e: Int): Boolean = 
        {
            
            if(e > bound) 
            {
                return true
            } 
            else if (contains(s,e) && !p(e)) 
            {
                return false
            } 
            else check(e + 1)
            
        }
        
        return check(-bound)
    }

    /**
    * Returns whether there exists a bounded integer within `s`
    * that satisfies `p`.
    */
    def exists(s: Set, p: Int => Boolean): Boolean = !forall(s,{e:Int => !p(e)})

    /**
    * Returns a set transformed by applying `f` to each element of `s`.
    */
    def map(s: Set, f: Int => Int): Set = (x => exists(s, e => x == f(e)))

    /**
    * Displays the contents of a set
    */
    def toString(s: Set): String = {
        val xs = for (i <- -bound to bound if contains(s, i)) yield i
        xs.mkString("{", ",", "}")
    }

    /**
    * Prints the contents of a set on the console.
    */
    def printSet(s: Set) {
        println(toString(s))
    }
    
}