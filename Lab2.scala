object lab2 extends App {
def flatMap[T](data: List[List[T]], mapper : T => T): List[Any] = {
  val map= new scala.collection.mutable.ListBuffer[T]
  for (i <- data.indices)
    for (j <- data(i).indices)
        map +=mapper(data(i)(j))
   
  val result = map.toList
  if (!result.isEmpty && result(1).isInstanceOf[List[Any]])
    flatMap(result.asInstanceOf[List[List[Any]]], (x : Any) => x)
  else
    result      
}

  println(flatMap(List(List("a","b"), List("c","d")), (x: String) => x.toUpperCase()))
  println(flatMap(List(List(1,2), List(2,3), List(3,4)), (x : Int) => x+1))
  println(flatMap(List(List(0.5,0.5), List(2.3,3.1), List(3.0,0.4)), (x : Double) => 2*x))  
  println(flatMap(List(List(List(1,2), List(3,4)), List(List(5,6), List(7,8))), (x : List[Int]) => x))
  println(flatMap(List(List(List(List("H","e"), List("l","l")), List(List("o",","), List(" ", " "))), 
      List(List(List("W","o"),List("r","l")), List(List("d","!"),List("!","!")))), (x : List[List[String]]) => x))
}