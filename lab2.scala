object Lab2 {

 def main(argv: Array[String]) {
 
	def flatmap(lis: List[List[Double]], q: Double => Double): List[Double] = {
	for (a <- lis; s <- a) yield q(s)
	}
 
 var test = List(List(2.0,3.0), List(4.0,5.0))
 var test2 = flatmap(test, _ / 1.5)
 println(test2)
 
 }
}