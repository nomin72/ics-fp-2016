package zadania1

/**
  * Created by slobodanka on 4.11.16.
  */
object zadacha4 extends App{
  println("Hello world")

  def sum(n:Int): Int = {
    var num=n
    if (n > 0)
      num = n % 10 + sum((n / 10).toInt)
      println(num)
    return num
  }
  sum(2506)
}


