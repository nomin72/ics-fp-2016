// FlatMap via foldLeft
object Lab2 extends App{
  def flatMap[A, B](list: List[A])(f: A => List[B]): List[B] =
  list.foldLeft(List[B]())(_ ++ f(_))

  val list1 = List(0, 1, 2, 3, 4, 5)
  val list2 = List(6, 7, 8, 9, 10)
  val list = List(list1, list2)

  println(list.flatMap(x => x))
  println(list.flatMap(x => x.map(2 * _)))
}