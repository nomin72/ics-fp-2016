/**
  * Created by Romashkin on 08.11.2016.
  */
object Fibonacci {

  def fibonacci(n: Int): Int =
    if (n < 3) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  def main(args: Array[String]) {
    println(fibonacci(10))
  }

}
