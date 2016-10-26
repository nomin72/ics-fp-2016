object  task1_v1 extends App {
  def printNumbers(n:Int):Int = {
      if (n > 0)
      {
        val a = printNumbers(n - 1) + 1
        println(a)
        a
      }
      else if (n < 0)
      {
        val a = printNumbers(n + 1) - 1
        println(a)
        a
      }
      else
      {
        println(n)
        n
      }
  }
  printNumbers(-2)
  printNumbers(3)
  printNumbers(0)
}