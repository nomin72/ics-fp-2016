
object SecondTask extends App{
  def flatMap(list: List[List[String]], fun: String => String): List[String] =
    for (k <- list.flatten)  yield fun(k)
  println(flatMap(List(List("Программист", "Разработчик"), List("Бог", "Повелитель")), s => s.concat(" Scala")))
}

