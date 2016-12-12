import scala.annotation.tailrec

object TaskTwo extends App {
  def flatMap[A, B](list: List[A])(f: A => List[B]): List[B] = {
    @tailrec
    def helper(res: List[B], list: List[A]): List[B] = {
      list match {
        case Nil => res
        case x :: tail => helper(res ::: f(x), tail)
      }
    }

    helper(Nil, list)
  }


  println(flatMap(List(List(1, 2), List(3, 4))) { x => x.map(_ * 2) })
}
