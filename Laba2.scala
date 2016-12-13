package Laba2
import scala.collection.immutable.List

/**
  * Created by Ilasha on 07.11.2016.
  */

object Laba2 {
  def flatMap(x: List[List[Double]], f: Double => Double): List[Double] = for (a <- x; s <- a) yield f(s)
  }

object Test extends App {
  var num = List(List(1.0,2.0), List(3.0,4.0))
  var flat = Laba2.flatMap(num, _ * 2)
  println(flat)
}