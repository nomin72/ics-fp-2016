package lab1

/**
  * Created by Maxim on 27.11.2016.
  */
object PrinterNumbers {
      def printNumbers(n: Int) {
        if (n>0)
          printNumbers(n-1)
        else if (n<0)
          printNumbers(n+1)
        print(n + " ")
  }

  def main(args: Array[String]) {
    println("Lab1: print numbers from 0 to n")
    printNumbers(0)
    println()
    printNumbers(1)
    println()
    printNumbers(5)
    println()
    printNumbers(10)
    println()
    printNumbers(-1)
    println()
    printNumbers(-5)
    println()
    printNumbers(-10)
  }
}
