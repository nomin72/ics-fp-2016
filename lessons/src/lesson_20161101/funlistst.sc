package lesson_20161101

object funlistst {
 	val list = List(1,2,3,4)                  //> list  : List[Int] = List(1, 2, 3, 4)
 	
 	val set = Set(1,2,2,2,3)                  //> set  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
 	
 	val map: Map[Int, String] = Map(1->"one", 2->"two")
                                                  //> map  : Map[Int,String] = Map(1 -> one, 2 -> two)
 list.splitAt(2)                                  //> res0: (List[Int], List[Int]) = (List(1, 2),List(3, 4))
 val newList = list.zipWithIndex.filter {case(el, index)=> index % 2 == 0}
                                                  //> newList  : List[(Int, Int)] = List((1,0), (3,2))
 
 map.toList.find {case (key, value) => key == 1}  //> res1: Option[(Int, String)] = Some((1,one))
 
 map(1)                                           //> res2: String = one
 val optString = map.get(3)                       //> optString  : Option[String] = None
 map.getOrElse(3, "three")                        //> res3: String = three
 optString match {
 	case Some(s) => println (s)
 	case None => println ("nothing")
 }                                                //> nothing
 
 val list3 = List(1,1,2,3,3,3,3)                  //> list3  : List[Int] = List(1, 1, 2, 3, 3, 3, 3)
 
 list3.groupBy { x => x }                         //> res4: scala.collection.immutable.Map[Int,List[Int]] = Map(2 -> List(2), 1 ->
                                                  //|  List(1, 1), 3 -> List(3, 3, 3, 3))
 
}