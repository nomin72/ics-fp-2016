package lesson_20161101

object reduce {
  val list = List(1,2,3,4,5)                      //> list  : List[Int] = List(1, 2, 3, 4, 5)
  
  list.reduceLeft(_+_)                            //> res0: Int = 15
	list.reduceRight(_+_)                     //> res1: Int = 15
	
	val list2 = List(1.0, 2.0, 3.0)           //> list2  : List[Double] = List(1.0, 2.0, 3.0)
	list2.reduceLeft((o1,o2)=>o1 / o2)        //> res2: Double = 0.16666666666666666
	list2.reduceRight((o1,o2)=>o1 / o2)       //> res3: Double = 1.5

  list.foldLeft(100)(_+_)                         //> res4: Int = 115

}