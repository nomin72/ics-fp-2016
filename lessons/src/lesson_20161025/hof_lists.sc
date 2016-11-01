package lesson_20161025

object hof_lists {

	val list = List (1,2,3,4,5)               //> list  : List[Int] = List(1, 2, 3, 4, 5)
	
	5 + 5                                     //> res0: Int(10) = 10
	5.+(5)                                    //> res1: Int(10) = 10
	
	list map { x => s"${x}" +"1" }            //> res2: List[String] = List(11, 21, 31, 41, 51)
	
	list.map( x => x+1)                       //> res3: List[Int] = List(2, 3, 4, 5, 6)
	
	val list2 = List((1, "one"), (2, "two"))  //> list2  : List[(Int, String)] = List((1,one), (2,two))
	
	list2.map( x => x._2)                     //> res4: List[String] = List(one, two)
	
	list2 map {case (num, str) => num}        //> res5: List[Int] = List(1, 2)
	
	def my_map(xs:List[Int], f:(Int => Double)):List[Double] = xs match {
		case List() => List()
		case first :: tail => f(first) :: my_map(tail, f)
	}                                         //> my_map: (xs: List[Int], f: Int => Double)List[Double]
	
	my_map(list, {x => x * 0.1})              //> res6: List[Double] = List(0.1, 0.2, 0.30000000000000004, 0.4, 0.5)
	
	val listlist = List(List(1,2,3), List(4,5,6))
                                                  //> listlist  : List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6))
	listlist.flatten                          //> res7: List[Int] = List(1, 2, 3, 4, 5, 6)
	
	list.filter (x => x > 3)                  //> res8: List[Int] = List(4, 5)
	
	
	list.find { x => x==10 }                  //> res9: Option[Int] = None
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}