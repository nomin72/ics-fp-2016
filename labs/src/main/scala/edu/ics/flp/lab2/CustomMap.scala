package edu.ics.flp.lab2

/**
  * Created on 13.11.2016.
  */

// map с помощью foldRight
object CustomMap{

  def _map[A](list : List[A], transorm : A => A) : List[A] =
    list.foldRight(List[A]())((tmp : A, result : List[A]) => List(transorm(tmp)) ++ result)

  def main(argv : Array[String]) {
    val list = List(1, 2, 3, 4, 5)
    _map(list, (value: Int) => 2 * value).foreach(println)
  }
}

