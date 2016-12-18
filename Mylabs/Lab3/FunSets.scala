// Anisimov Andrey 13544/1
// Task3
// Date 18.12.2016

/**
* 2. Purely Functional Sets.
*/
object FunSets
{
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
def singletonSet(elem: Int): Set = { return x => (if (x==elem) {true} else {false}); }

/**
* Returns the union of the two given sets,
* the sets of all elements that are in either `s` or `t`.
*/
def union(s: Set, t: Set): Set = { return x => (contains(s, x) || contains(t, x)); }

/**
* Returns the intersection of the two given sets,
* the set of all elements that are both in `s` and `t`.
*/
def intersect(s: Set, t: Set): Set = { return x => (contains(s, x) && contains(t, x)); }

/**
* Returns the difference of the two given sets,
* the set of all elements of `s` that are not in `t`.
*/
def diff(s: Set, t: Set): Set = { return x => (contains(s, x) && !contains(t, x)); }

/**
* Returns the subset of `s` for which `p` holds.
*/
def filter(s: Set, p: Int => Boolean): Set = { return x => (contains(s, x) && p(x)); }

/**
* The bounds for `forall` and `exists` are +/- 1000.
*/
val bound = 1000
/**
* Returns whether all bounded integers within `s` satisfy `p`.
*/
def forall(s: Set, p: Int => Boolean): Boolean =
{
  def auxf(x: Int, s: Set, p: Int => Boolean): Boolean =
  {
    if (x == bound) { return !contains(s, x) || p(x); }
    else if (contains(s, x) && !p(x)) { return false; }
    else { return auxf(x+1, s, p); } 
  }
  
  return auxf(-bound, s, p);
}

/**
* Returns whether there exists a bounded integer within `s`
* that satisfies `p`.
*/
def exists(s: Set, p: Int => Boolean): Boolean = { return !forall(s, y => !p(y)); }

/**
* Returns a set transformed by applying `f` to each element of `s`.
*/
def map(s: Set, f: Int => Int): Set = { return x => exists(s, y => (f(y) == x)); }

/**
* Displays the contents of a set
*/
def toString(s: Set): String =
{
  val xs = for (i <- -bound to bound if contains(s, i)) yield i;
  xs.mkString("{", ",", "}");
}

/**
* Prints the contents of a set on the console.
*/
def printSet(s: Set) { println(toString(s)); }

def fact(x: Int): Int = { if (x == 0 || x == 1) { return 1; } else { return x*fact(x-1); } }

def main(args: Array[String]): Unit =
{
  def S1(x: Int): Boolean = { x == 0 || x == 3 || x == 5 || x == 8; };
  def S2(x: Int): Boolean = { (x >= 1 && x <= 4) || x == 6; };
  def S3(x: Int): Boolean = { x == 0 || x == 2; };
  def S4 = singletonSet(0);

  println("Task3:");
  print("S1: "); printSet(S1);
  print("S2: "); printSet(S2);
  print("S3: "); printSet(S3);
  print("S4: "); printSet(S4);
  
  println();
  print("contains(S1, 3): "); println(contains(S1, 3));
  print("contains(S1, 2): "); println(contains(S1, 2));
  print("contains(S2, 2): "); println(contains(S2, 2));
  print("contains(S3, 0): "); println(contains(S3, 0));
  print("contains(S3, 2): "); println(contains(S3, 2));
  
  println();
  print("union(S1, S2): "); printSet(union(S1, S2));
  print("union(union(S2, S3), union(S1, S3)): "); printSet(union(union(S2, S3), union(S1, S3)));
  
  println();
  print("intersect(S1, S2): "); printSet(intersect(S1, S2));
  print("intersect(S2, S4): "); printSet(intersect(S2, S4));
  print("intersect(intersect(S1, S2), S4): "); printSet(intersect(intersect(S1, S2), S4));
  
  println();
  print("diff(S3, S4): "); printSet(diff(S3, S4));
  print("diff(S4, S3): "); printSet(diff(S4, S3));
  print("diff(S1, S2): "); printSet(diff(S1, S2));
  print("diff(S3, diff(S2, S1)): "); printSet(diff(S3, diff(S2, S1)));
  
  println();
  print("filter(S1, S1): "); printSet(filter(S1, S1));
  print("filter(S1, x => !contains(S1, x)): "); printSet(filter(S1, x => !contains(S1, x)));
  print("filter(S2, x => x<3): "); printSet(filter(S2, x => x<3));
  
  println();
  print("forall(S3, S4): "); println(forall(S3, S4));
  print("forall(S4, S3): "); println(forall(S4, S3));
  print("forall(S1, x => (x%2 == 0)): "); println(forall(S1, x => (x%2 == 0)));
  
  println();
  print("exists(S3, x => (x%2 != 0)): "); println(exists(S3, x => (x%2 != 0)));
  print("exists(S2, x => (x%3 != 0)): "); println(exists(S2, x => (x%3 != 0)));
  print("exists(S2, x => (x*x == 4)): "); println(exists(S2, x => (x*x == 4)));
  
  println();
  print("map(S2, x => x*x): "); printSet(map(S2, x => x*x));
  print("map(S1, x => 11): "); printSet(map(S1, x => 11));
  print("map(S2, x => fact(x)): "); printSet(map(S2, x => fact(x)));  
}
}