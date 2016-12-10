package lab1

object Printernumbers {
      def printnumbers(k: Int) {
        if (k>0)
          printnumbers(k-1)
        else if (k<0)
          printnumbers(k+1)
        print(k + " ")
  }

  def main(args: Array[String]) {
    println("Lab1: print numbers from 0 to n")
    printnumbers(0)
    printnumbers(1)
    printnumbers(5)
    printnumbers(10)
    printnumbers(-1)
    printnumbers(-5)
    printnumbers(-10)
  }
}