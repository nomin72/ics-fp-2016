object Lab2 {

  def flatMap[A, B](ls: List[A])(f: A => List[B]): List[B] = {
    @annotation.tailrec
    def helper(r: List[B], ls: List[A]): List[B] = {
      ls match {
        case Nil => r
        case x :: tail => helper(r ::: f(x), tail)
      }
    }
    helper(Nil, ls)
  }


  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5)
    val list2 = List(6, 7, 8)
    val listlist = List(list1, list2)

    println(listlist.flatMap(x => x.map(_ * 2)))
    println(flatMap(listlist) { x => x.map(_ * 2) })

    println("---------------------------------")
    val chars = List('a', 'b', 'c')
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
