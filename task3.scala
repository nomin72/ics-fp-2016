object task3 {
  /**
* 2. Purely Functional Sets.
*/

/**
* We represent a set by its characteristic function, i.e.
* its `contains` predicate.
*/
type Set = Int => Boolean

/* на входе int на выходе bool */

/**
* Indicates whether a set contains a given element.
*/
def contains(s: Set, elem: Int): Boolean = s(elem)

/**
* Returns the set of the one given element.
*/
def singletonSet(elem: Int): Set = s => s == elem

/**
* Returns the union of the two given sets,
* the sets of all elements that are in either `s` or `t`.
*/
def union(s: Set, t: Set): Set = u => s(u) || t(u)

/**
* Returns the intersection of the two given sets,
* the set of all elements that are both in `s` and `t`.
*/
def intersect(s: Set, t: Set): Set = i => s(i) && t(i)

/**
* Returns the difference of the two given sets,
* the set of all elements of `s` that are not in `t`.
*/
def diff(s: Set, t: Set): Set = d => s(d) && !t(d)

/**
* Returns the subset of `s` for which `p` holds.
*/
def filter(s: Set, p: Int => Boolean): Set = intersect(s, p)

/**
* The bounds for `forall` and `exists` are +/- 1000.
*/
val bound = 1000

/**
* Returns whether all bounded integers within `s` satisfy `p`.
*/
def forall(s: Set, p: Int => Boolean): Boolean = { countOfSet(s) == countOfSet(filter(s,p)) }


/**
* Returns whether there exists a bounded integer within `s`
* that satisfies `p`.
*/
def exists(s: Set, p: Int => Boolean): Boolean = { return countOfSet(filter(s,p)) > 0 } 

def countOfSet(s: Set): Int = { val r = for (i <- -bound to bound if contains(s, i)) yield i; return r.count { x => true } }

/**
* Returns a set transformed by applying `f` to each element of `s`.
*/
def map(s: Set, f: Int => Int): Set = {  
  var temp : Set = (x: Int) => false ;
  printSet(temp)
      val r = for (i <- -bound to bound if contains(s, i)) yield i; 
        for (ar <- r) {
         temp = union(temp, singletonSet(f(ar)));
        }
      return temp 
  }

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
def printSet(s: Set) { println(toString(s)) }
  
def main(args: Array[String]): Unit = {
      
      val vari : Set = (x: Int) => x > 5
      def p (x: Int): Boolean = x > 0           
       
       printSet(filter(vari,p)) 
      
       //val i : Int = 1
      //printSet(singletonSet(i))
      
      println("forall: " + forall(vari, p))
      
      println("ex: " + exists(vari, p))
      
      println("vari count " + countOfSet(vari))
      println("p count " + countOfSet(p))
      println("countOfSet(filter(s,p)) " + countOfSet(filter(vari,p)))
      
      printSet(map(vari, (x: Int) => x / 2)) 
  }
}
