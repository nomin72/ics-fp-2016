package labs

object Printer {
      def printNumbers(k: Int) {
        if (k>0)
          printNumbers(k-1)
        else if (k<0)
          printNumbers(k+1)
        print(k + " ")
  }

  def main(args: Array[String]) {
    println("Lab1: print numbers from 0 to n")

    printNumbers(0)
    printNumbers(1)
    printNumbers(5)
    printNumbers(10)
    printNumbers(-1)
    printNumbers(-5)
    printNumbers(-15)
  }
}