/*
    реализовать функцию, вычисляющую число сочетания из N по K
    def combine(n:Int, k:Int)
 */


object Main {

  def getCombineNumber(n : Int, k : Int) =
    if (n < 0 || k < 0 || n < k)
      println("Arguments error")
    else
      combine(n, k)

  def combine(n: Int, k : Int) : Int =
    if (k == 0 || n == k)
      1
    else
      combine(n - 1, k) + combine(n - 1, k - 1)

  def main(argv: Array[String]) {
    println(getCombineNumber(5, 3))
  }
}
