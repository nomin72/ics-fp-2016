/**
  * Created by Reedman on 18.12.2016.
  */
object LabRab2 extends App{

  def flatMap[I, J](Num: List[I])(Fn: I => List[J]): List[J] = {
    @annotation.tailrec
    def Helper(Res: List[J], Num: List[I]): List[J] = {
      Num match {
        case Nil => Res
        case x :: tail => Helper(Res ::: Fn(x), tail)
      }
    }
    Helper(Nil, Num)
  }

  val Ch = List('1', '2', '3')

  val Sol = flatMap(Ch) { i => flatMap(Ch) { j =>
    if (i != j) List("%c%c".format(i, j))
    else List()
    }
  }

  println(Sol)

  println(' ')

  val List1 = List(2, 6, 13, 14)
  val List2 = List(21, 40)
  val ResList = List(List1, List2)

  println(ResList.flatMap(j=> j.map(_ + 2)))
}

