// Anisimov Andrey 13544/1
// Task2 - 'make for using flatMap'
// Date 18.12.2016

object Main
{
  // for(x <- xs; y <- ys) yield f(x, y);
  def ffm(l1: List[Double], l2: List[Double], f: (Double, Double) => Double): List[Double] = { l1 flatMap {x => l2 map {f(x,_)}}; }
  
  def main(args: Array[String]): Unit =
  {
    val xs = List[Double](1,2,5);
    val ys = List[Double](1,2);
    val lr = ffm(xs, ys, (x, y) => x-y);
    
    println("Task2:");
    println(lr);
  }  
}