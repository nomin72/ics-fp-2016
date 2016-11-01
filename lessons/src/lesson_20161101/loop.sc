package lesson_20161101

object loop {
  
  var test = 5                                    //> test  : Int = 5
  
  while(test<10){
  	test = test +1;
  	println(test)
  }                                               //> 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
  
  val list = List(1,2,3)                          //> list  : List[Int] = List(1, 2, 3)
  list.foreach { x => println(x) }                //> 1
                                                  //| 2
                                                  //| 3
  
  val range = 1 to 10                             //> range  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6
                                                  //| , 7, 8, 9, 10)
  val rangeExc = 1 until 10                       //> rangeExc  : scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8,
                                                  //|  9)
  
  for(i <- 1 until 10; if (i%2==0)) {println(i)}  //> 2
                                                  //| 4
                                                  //| 6
                                                  //| 8
  for(i <-1 until 5; y <-1 until 3) {println("%s - %s".format(i,y))}
                                                  //> 1 - 1
                                                  //| 1 - 2
                                                  //| 2 - 1
                                                  //| 2 - 2
                                                  //| 3 - 1
                                                  //| 3 - 2
                                                  //| 4 - 1
                                                  //| 4 - 2
  val result = for(i <-1 until 5; y <-1 until 3) yield (i,y)
                                                  //> result  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), 
                                                  //| (1,2), (2,1), (2,2), (3,1), (3,2), (4,1), (4,2))
  result.toList.toSeq                             //> res0: scala.collection.immutable.Seq[(Int, Int)] = List((1,1), (1,2), (2,1),
                                                  //|  (2,2), (3,1), (3,2), (4,1), (4,2))
                                                 
}