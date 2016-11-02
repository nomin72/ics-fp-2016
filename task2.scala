object Task2 {
  def ListLenght (list: List[Int]): Int = {
    return list.foldRight(0)((i: Int, j: Int) => j + 1 )
  }
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    println("длина: " + ListLenght(list))
  }
}