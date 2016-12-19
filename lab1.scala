object Lab1 {

  def main(argv: Array[String]) {

    def akkerman(m: Int, n:Int): Int = {
      if (m == 0) {
        println(n + 1)
        n + 1
      } else if (n == 0) {
        akkerman(m - 1, 1)
      } else {
		akkerman(m - 1, akkerman(m, n - 1))
      }
    }
  
    
    akkerman(2, 2)
  }
}