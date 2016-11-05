object task2_v4 extends App {
  def LengthByFoldRight(numbers: List[Int]): Int =
  {
    numbers.foldRight(0) { (m: Int, n: Int) =>  println("m: " + m + " n: " + (m + n) + " counter: " + (n + 1)); n + 1 }
  }

  val testList1 = List(0, 13, 24, 1, 15, 100, 7)
  val testList2 = List(4)
  println(LengthByFoldRight(testList1))
  println()
  println(LengthByFoldRight(testList2))
}