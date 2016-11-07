package Laba2

/**
  * Created by Ilasha on 07.11.2016.
  */

object Laba2 {
  def flatMap(x: List[List[Double]], operation: String, m:Double): List[Double] = {
    var list = List[Double]()
    for(a <- x) {
      for(s <- a) {
        var f = s
        operation match {
          case "*" => f = s * m
          case "/" => f = s / m
          case "-" => f = s - m
          case "+" => f = s + m
        }
        list ::= f
      }
    }
    list = list.reverse
    list
  }
}



object Test extends App {
  var num = List(List(1.0,2.0), List(3.0,4.0))
  println(num)
  var flat = Laba2.flatMap(num, "+", 6)
  println(flat)
}