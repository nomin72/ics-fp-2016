import scala.collection.mutable.ListBuffer
/**
  * Created by Sergey on 15.12.16.
  */
object Flat_For {
  //def MyFlatMap (MyList: List[List[Int]], )
  def MyFlatMap(list: List[List[List[Double]]], operation: Double => Double): List[Double] = {
    val res = new ListBuffer[Double]();

    for (i <- 0 to list.length-1)
      for (j <- 0 to list(i).length-1)
        for (q <- 0 to list(i)(j).length-1)
        res += operation(list(i)(j)(q));

    res.toList;
  }

  def main(args: Array[String]): Unit = {

    println(MyFlatMap(List(List(List(1.0,2,3), List(4,5.0), List(6,7))), n => n / 0.5));

  }

}



