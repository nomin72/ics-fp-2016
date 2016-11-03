object main {
   def main(argv : Array[String]) {
    def pascal(row:Int, columnt:Int): Int = {
      if (columnt == 0 || columnt==row) 1
      else
        pascal(row - 1, columnt - 1) + pascal(row - 1, columnt)
    }
  println ("pascal(1,1) = " + pascal(1,1));
  println ("pascal(2,1) = " + pascal(2,1));
  }
}