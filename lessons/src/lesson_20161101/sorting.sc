package lesson_20161101

object sorting {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val listToSort = List("watermellon","apple", "orange", "pineapple" )
                                                  //> listToSort  : List[String] = List(watermellon, apple, orange, pineapple)

	listToSort.sorted                         //> res0: List[String] = List(apple, orange, pineapple, watermellon)

	listToSort.sortWith(_.length > _.length)  //> res1: List[String] = List(watermellon, pineapple, orange, apple)

	listToSort.find { _.length()==5 }         //> res2: Option[String] = Some(apple)
}