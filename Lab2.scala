object Lab2 {
  
  def main(argv: Array[String]) {
    
    def length(numbers: List[Int]): Int = {
      numbers.foldRight(0) { (m: Int, n: Int) =>  n+1 }
    }
    
    val numbers = List(1, 2, 3, 4, 5)
    
    println(length(numbers))
  }
}
