package labs

object Length {
  def length[T](list: List[T]): Int = list.foldRight(0)((data: T, length: Int) => length + 1)

  def main(args: Array[String]): Unit = {
    println("Lab2: length with foldRight")
    println(length(List()))
    println(length(List(1)))
    println(length(List(1,2,3,4,5)))
    println(length(List(1,2,3,4,5,6,7,8,9,10)))
  }
}
