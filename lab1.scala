// Факториал
object Lab1 extends App{
  def factorial (n:Int):Int = {
    if (n<=1)
    	1
    else
      n*factorial(n-1)
  }
  println(factorial(10))
}