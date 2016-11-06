object Main extends App
{
  object FunSets
  {
    /*Purely Functional Sets*/
    type Set = Int => Boolean

    /*We represent a set by its characteristic function, i.e. its `contains` predicate.*/
    def contains(s: Set, elem: Int): Boolean = s(elem) /*Indicates whether a set contains a given element*/

    /*Returns the set of the one given element*/
    def singletonSet(elem: Int): Set = Set(elem)

    /*Returns the union of the two given sets, the sets of all elements that are in either `s` or `t`*/
    def union(s: Set, t: Set): Set = (x: Int) => s(x) || t(x)

    /*Returns the intersection of the two given sets, the set of all elements that are both in `s` and `t`*/
    def intersect(s: Set, t: Set): Set = (x: Int) => s(x) && t(x)

    /*Returns the difference of the two given sets, the set of all elements of `s` that are not in `t`*/
    def diff(s: Set, t: Set): Set = (x: Int) => s(x) && t(x)

    /*Returns the subset of `s` for which `p` holds*/
    def filter(s: Set, p: Int => Boolean): Set = intersect(s, p)

    val bound = 1000 /*The bounds for `forall` and `exists` are +/- 1000*/

    def forall(s: Set, p: Int => Boolean): Boolean = /*Returns whether all bounded integers within `s` satisfy `p`*/
    {
      val filteredSet = filter(s, p)
      def iter(a: Int): Boolean = {
        if (contains(s, a) && !contains(filteredSet, a)) false
        else if (a > bound) true
        else iter(a + 1)
      }
      iter(-bound)
    }

    /*Returns whether there exists a bounded integer within `s` that satisfies `p`*/
    def exists(s: Set, p: Int => Boolean): Boolean = forall(s, union(s, p))

    /* Returns a set transformed by applying `f` to each element of `s`*/
    def map(s: Set, f: Int => Int): Set =
    {
      def iter(a: Int, buildingSet: Set): Set =
      {
        if (a > bound) buildingSet
        else if (contains(s, a))
          iter(a + 1, union(buildingSet, singletonSet(f(a))))
        else iter(a + 1, buildingSet)
      }

      iter(-bound, diff(s, s))
    }

    def toString(s: Set): String = /*Displays the contents of a set*/
    {
      val xs = for (i <- -bound to bound if contains(s, i)) yield i
      xs.mkString("{", ",", "}")
    }

    def printSet(s: Set) /*Prints the contents of a set on the console*/
    {
      println(toString(s))
    }
  }


  val R = FunSets
  val t1 = Set(1,2,3,4)
  val t2 = Set(9,8,3,6,4)
  R.printSet(R.union(R.singletonSet(1), R.singletonSet(3)))
  R.printSet(R.diff(t2, t1))
}