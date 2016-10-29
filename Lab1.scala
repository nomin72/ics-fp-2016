object Lab1 {

  def main(argv: Array[String]) {

    def printN(n: Int): Int = {
      if (n > 0) {
        printN(n - 1)
        println(n)
        n
      } else if (n < 0) {
        printN(n + 1)
        println(n)
        n
      } else {
        println(0)
        0
      }
    }
  
    
    printN(-5)
  }
}
