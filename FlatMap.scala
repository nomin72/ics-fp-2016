import scala.collection.immutable.List
object FlatMap {
  def flatMap(x: List[List[Double]]): List[Double] = for (a <- x; b <- a) yield b
  var ll = List(List(1.2,3.4), List(5.6,7.8))
  var flatlist = flatMap(ll)
  def main (args: Array[String]){
      println("Before flatMap:  " + ll)
      println("After flatMap:   " + flatlist)
  }
}
