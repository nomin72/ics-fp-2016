
object TaskOne extends App {
  def pascal(row: Int, columnt: Int): Int = {
    if (columnt < 0 || row < 0) 0
    else {
      if (columnt == 0 || columnt == row) 1
      else
        pascal(row - 1, columnt - 1) + pascal(row - 1, columnt)
    }
  }

  println(pascal(1, 2))
  println(pascal(4, 2))
  println(pascal(0, 0))
  println(pascal(2, 1))
}
