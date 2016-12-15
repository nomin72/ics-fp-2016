package labs

object FunSets {

  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)

  def singletonSet(elem: Int): Set = (x: Int) => x == elem

  def union(s: Set, t: Set): Set = (elem: Int) => s(elem) || t(elem)

  def intersect(s: Set, t: Set): Set = (elem: Int) => s(elem) && t(elem)

  def diff(s: Set, t: Set): Set = (elem: Int) => s(elem) && !t(elem)

  def filter(s: Set, p: Int => Boolean): Set = (elem: Int) => s(elem) && p(elem)

  val bound = 1000

  def forall(s: Set, p: Int => Boolean): Boolean =
    (for (i <- -bound to bound) yield if (contains(s, i)) p(i) else true)
      .reduceLeft((a, b) => a && b)

  def exists(s: Set, p: Int => Boolean): Boolean =
    !forall(s, i => !p(i))

  def map(s: Set, f: Int => Int): Set = i => exists(s, (elem: Int) => f(elem) == i)

  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }

  def printSet(s: Set) {
    println(toString(s))
  }
}