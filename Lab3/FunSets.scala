
/**
* 2. Purely Functional Sets.
*/
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
  def singletonSet(elem: Int): Set =
    (x: Int) => (x == elem)

  /**
  * Returns the union of the two given sets,
  * the sets of all elements that are in either `s` or `t`.
  */
  def union(s: Set, t: Set): Set =
    (x : Int) => s(x) || t(x)

  /**
  * Returns the intersection of the two given sets,
  * the set of all elements that are both in `s` and `t`.
  */
  def intersect(s: Set, t: Set): Set =
    (x : Int) => s(x) && t(x)

  /**
  * Returns the difference of the two given sets,
  * the set of all elements of `s` that are not in `t`.
  */
  def diff(s: Set, t: Set): Set =
    (x : Int) => s(x) && !t(x)

  /**
  * Returns the subset of `s` for which `p` holds.
  */
  def filter(s: Set, p: Int => Boolean): Set =
    (x : Int) => p(x) && s(x)

  /**
  * The bounds for `forall` and `exists` are +/- 1000.
  */
  val bound = 1000

  /**
  * Returns whether all bounded integers within `s` satisfy `p`.
  */
  def forall(s: Set, p: Int => Boolean): Boolean =
    (for (x <- -bound to bound) yield if (s(x)) p(x) else true)
      .reduceLeft((z, x) => z && x)

  /**
  * Returns whether there exists a bounded integer within `s`
  * that satisfies `p`.
  */
  def exists(s: Set, p: Int => Boolean): Boolean =
    (for (x <- -bound to bound) yield if (s(x)) p(x) else false).
      reduceLeft((z, x) => z || x)

  /**
  * Returns a set transformed by applying `f` to each element of `s`.
  */
  def map(s: Set, f: Int => Int): Set =
    (for (x <- -bound to bound if (s(x))) yield FunSets.singletonSet(f(x)))
      .reduceLeft((x, y) => FunSets.union(x, y))

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