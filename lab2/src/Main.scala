/*
    map с помощью foldRight, вариант 3
 */


object Lab2 {
  def modifier(a: Int) = a * 100

  def map[A](list : List[A], modifier: A => A) =
    list.foldRight(List[A]()){
      (data, y) => modifier(data) +:y
    }

  def main(args: Array[String]) {

    val list = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list)
    println(map(list, modifier))

  }
}



