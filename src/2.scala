object Length {
  def length[T](list: List[T]): Int = list.foldRight(0)((data: T, length: Int) => length + 1)

  def main(args: Array[String]): Unit = {
    println(length(List(1,2,3))) //3
  }
}
