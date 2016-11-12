

object Main {
  def main(argv : Array[String]) {
    testContains()
    testUnion()
    testIntersect()
    testDiff()
    testFilter()
    testForall()
    testExists()
    testMap()
  }

  def testMap() {
    println("Test #map")
    val union = FunSets.union(FunSets.union(set(3), set(5)), set(7));
    val mapped1 = FunSets.map(union, (x : Int) => 2 * x)
    assertEquals(mapped1, FunSets.union(FunSets.union(set(6), set(10)), set(14)));
    assertEquals(FunSets.map(mapped1, (x : Int) => x / 2 - 1), FunSets.union(FunSets.union(set(2), set(4)), set(6)))
    println("+passed")
  }

  def set(x : Int) = FunSets.singletonSet(x)
  def union(x : FunSets.Set, y : FunSets.Set) = FunSets.union(x, y)

  def assertEquals(x : FunSets.Set, y : FunSets.Set) {
    assert(FunSets.forall(x, (z : Int) => FunSets.contains(y, z)))
    assert(FunSets.forall(y, (z : Int) => FunSets.contains(x, z)))
  }

  def testExists() {
    println("Test #exists")
    val set1 = FunSets.singletonSet(3)
    val set2 = FunSets.singletonSet(5)
    val set3 = FunSets.singletonSet(7)
    val union = FunSets.union(FunSets.union(set1, set2), set3);
    assert(FunSets.exists(union, (x : Int) => x == 3))
    assert(FunSets.exists(union, (x : Int) => x == 5))
    assert(FunSets.exists(union, (x : Int) => x == 7))
    assert(FunSets.exists(union, (x : Int) => x > 0 && x < 10))
    assert(!FunSets.exists(union, (x : Int) => x > 100))
    assert(!FunSets.exists(union, (x : Int) => x < -100))
    assert(!FunSets.exists(union, (x : Int) => x == 4))
    println("+passed")
  }

  def testForall() {
    println("Test #forall")
    val set1 = FunSets.singletonSet(3)
    val set2 = FunSets.singletonSet(5)
    val set3 = FunSets.singletonSet(7)
    val union = FunSets.union(FunSets.union(set1, set2), set3);
    assert(FunSets.forall(union, (x : Int) => x % 2 == 1))
    assert(FunSets.forall(union, (x : Int) => x > 0 && x < 10))
    assert(!FunSets.forall(union, (x : Int) => x > 4))
    println("+passed")
  }

  def testFilter() {
    println("Test #filter")
    val set1 = FunSets.singletonSet(3)
    val set2 = FunSets.singletonSet(5)
    val set3 = FunSets.singletonSet(7)
    val union = FunSets.union(FunSets.union(set1, set2), set3);
    val filter = FunSets.filter(union, (x : Int) => x > 3)
    assert(FunSets.contains(filter, 5) && FunSets.contains(filter, 7) && !FunSets.contains(filter, 3))
    println("+passed")
  }

  def testDiff() {
    println("Test #diff")
    val set1 = FunSets.singletonSet(3)
    val set2 = FunSets.singletonSet(5)
    val set3 = FunSets.singletonSet(7)
    val union1 = FunSets.union(FunSets.union(set1, set2), set3);
    val union2 = FunSets.union(set2, set3);
    val diff = FunSets.diff(union1, union2)
    assert(FunSets.contains(diff, 3) && !FunSets.contains(diff, 5) && !FunSets.contains(diff, 7))
    println("+passed")
  }

  def testIntersect() {
    println("Test #intersect")
    val set1 = FunSets.singletonSet(3)
    val set2 = FunSets.singletonSet(5)
    val set3 = FunSets.singletonSet(7)
    val union1 = FunSets.union(set1, set2);
    val union2 = FunSets.union(set2, set3);
    val intersect = FunSets.intersect(union1, union2)
    assert(FunSets.contains(intersect, 5) && !FunSets.contains(intersect, 3) && !FunSets.contains(intersect, 7))
    println("+passed")
  }

  def testUnion() {
    println("Test #union")
    val set1 = FunSets.singletonSet(3)
    val set2 = FunSets.singletonSet(5)
    val set3 = FunSets.singletonSet(7)
    val union1 = FunSets.union(set1, set2);
    val union2 = FunSets.union(union1, set3);
    assert(FunSets.contains(union1, 3) && FunSets.contains(union1, 5))
    assert(FunSets.contains(union2, 3) && FunSets.contains(union2, 5) && FunSets.contains(union2, 7))
    println("+passed")
  }

  def testContains() {
    println("Test #contains")
    val singleSet = FunSets.singletonSet(3)
    assert(FunSets.contains(singleSet, 3))
    assert(!FunSets.contains(singleSet, 4))
    assert(!FunSets.contains(singleSet, 5))
    println("+passed")
  }
}
