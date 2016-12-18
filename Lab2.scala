package lab24


object Lab2 {

  def flatMap[A, B](list: List[A])(f: A => List[B]): List[B] = {
    list.foldLeft(List.empty[B]) { (acc, x) => acc ++ f(x) }
  }


  def main(args: Array[String]): Unit = {
    println("Lab2: flatMap with foldLeft")
    val list1 = List(1, 1, 2, 3, 5)
    val list2 = List(8, 13, 21)
    val listlist = List(list1, list2)

    println(listlist.flatMap(x => x.map(_ * 3)))
    println(flatMap(listlist) { x => x.map(_ * 3) })  


    println("---------------------------------")
    val chars = List('x', 'y', 'z')
    println(chars)
    val perms = chars flatMap { a =>
      chars flatMap { b =>
        if (a != b) List("%c%c".format(a, b))
        else List()
      }
    }

    println(perms)

    val myperms = flatMap(chars) { a =>
      flatMap(chars) { b =>
        if (a != b) List("%c%c".format(a, b))
        else List()
      }
    }
    println(myperms)
  }
}
