object Lab2 {

 def main(argv: Array[String]) {
 
	def FM(arr: List[List[Double]], x: Double => Double): List[Double] = {
	for (y <- arr; s <- y) yield x(s)
	}
 
 }
}