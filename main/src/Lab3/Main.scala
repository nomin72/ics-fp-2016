

object Main {
  def main(argv : Array[String]) {
    println("Test #map")
    val union = FunSets.union(FunSets.union(set(3), set(5)), set(7));
    val mapped1 = FunSets.map(union, (x : Int) => 2 * x)
    assertEquals(mapped1, FunSets.union(FunSets.union(set(6), set(10)), set(14)));
    assertEquals(FunSets.map(mapped1, (x : Int) => x / 2 - 1), FunSets.union(FunSets.union(set(2), set(4)), set(6)))
    println("+passed")
    println("Test #exists")
    val set1 = FunSets.singletonSet(3)
    val set2 = FunSets.singletonSet(5)
    val set3 = FunSets.singletonSet(7)
    assert(FunSets.exists(union, (x : Int) => x == 3))
    assert(FunSets.exists(union, (x : Int) => x == 5))
    assert(FunSets.exists(union, (x : Int) => x == 7))
    assert(FunSets.exists(union, (x : Int) => x > 0 && x < 10))
    assert(!FunSets.exists(union, (x : Int) => x > 100))
    assert(!FunSets.exists(union, (x : Int) => x < -100))
    assert(!FunSets.exists(union, (x : Int) => x == 4))
    println("+passed")
    println("Test #forall")
    assert(FunSets.forall(union, (x : Int) => x % 2 == 1))
    assert(FunSets.forall(union, (x : Int) => x > 0 && x < 10))
    assert(!FunSets.forall(union, (x : Int) => x > 4))
    println("+passed")
    println("Test #filter")
    val filter = FunSets.filter(union, (x : Int) => x > 3)
    assert(FunSets.contains(filter, 5) && FunSets.contains(filter, 7) && !FunSets.contains(filter, 3))
    println("+passed")
    println("Test #diff")
    val union1 = FunSets.union(FunSets.union(set1, set2), set3);
    val union2 = FunSets.union(set2, set3);
    val diff = FunSets.diff(union1, union2)
    assert(FunSets.contains(diff, 3) && !FunSets.contains(diff, 5) && !FunSets.contains(diff, 7))
    println("+passed")
    println("Test #intersect")
    val union3 = FunSets.union(set1, set2);
   
    val intersect = FunSets.intersect(union3, union2)
    assert(FunSets.contains(intersect, 5) && !FunSets.contains(intersect, 3) && !FunSets.contains(intersect, 7))
    println("+passed")
    println("Test #union")
    val union4 = FunSets.union(set1, set2);
    val union5 = FunSets.union(union4, set3);
    assert(FunSets.contains(union4, 3) && FunSets.contains(union4, 5))
    assert(FunSets.contains(union5, 3) && FunSets.contains(union5, 5) && FunSets.contains(union5, 7))
    println("+passed")
    println("Test #contains")
    val singleSet = FunSets.singletonSet(3)
    assert(FunSets.contains(singleSet, 3))
    assert(!FunSets.contains(singleSet, 4))
    assert(!FunSets.contains(singleSet, 5))
    println("+passed")
  }
  def set(x : Int) = FunSets.singletonSet(x)
  def union(x : FunSets.Set, y : FunSets.Set) = FunSets.union(x, y)
  def assertEquals(x : FunSets.Set, y : FunSets.Set) {
    assert(FunSets.forall(x, (z : Int) => FunSets.contains(y, z)))
    assert(FunSets.forall(y, (z : Int) => FunSets.contains(x, z)))
  }
}
