package lesson_20161025

object lists {

	val list = List(1, 2, 3, 4, 5)            //> list  : List[Int] = List(1, 2, 3, 4, 5)
	
	val newList = Nil                         //> newList  : scala.collection.immutable.Nil.type = List()
	
	5 :: Nil                                  //> res0: List[Int] = List(5)
	
	def last(xs :List[Int]):Int = xs match {
		case List() => -1 // throw exception
		case List(x) => x
		case firstElement :: tail => last(tail)
	}                                         //> last: (xs: List[Int])Int
	
	last(list)                                //> res1: Int = 5
	
	def concat(xs: List[Int], ys: List[Int]): List[Int] = xs match {
		case List() => ys
		case firstElement :: tail => firstElement :: concat(tail, ys)
	}                                         //> concat: (xs: List[Int], ys: List[Int])List[Int]
	
	concat (list, list)                       //> res2: List[Int] = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)


}