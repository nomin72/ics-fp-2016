import scala.collection.mutable.ListBuffer

object lab2_v2 extends App {
  def flatMap(list: List[List[Int]], f: Int => Int): List[Int] = {
    val res = new ListBuffer[Int]()

    for (i <- list.indices)
      for (j <- list(i).indices)
        res += f(list(i)(j))

    res.toList
  }

  println(flatMap(List(List(1,2), List(3,4)), n => n * 2))
}