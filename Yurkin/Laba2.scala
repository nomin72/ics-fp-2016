//Laba 2. Вариант 6 
//6) flatMap с помощью patternMatching с хвостовой рекурсией

object Laba2 {

  def flatMap[A, A1](ls: List[A])(f: A => List[A1]): List[A1] = 
  {
    @annotation.tailrec

    def helper(r: List[A1], ls: List[A]): List[A1] = 
    {
      ls match 
      {
        case Nil => r
        case x :: tail => helper(r ::: f(x), tail)
      }
    }
    helper(Nil, ls)
  }

  def main(args: Array[String]): Unit = 
  {
    val l1 = List(1, 2, 4, 8, 16, 32, 64)
    val l2 = List(100, 1000, 10000, 100000)
    val listF = List(l1, l2)

    println(listF.flatMap(x => x.map(_ * 2)))
    println(flatMap(listF) 
    { x => x.map(_ * 2) })

    val charSet = List('q', 'w', 'e', 'r', 't')
    println(charSet)
    val rec = charSet flatMap 
    { a =>
      charSet flatMap 
      { b =>
        if (a != b) List("%c%c".format(a, b))
        else List()
      }
    }
    println(rec)

    val Nrec = flatMap(charSet) 
    { a =>
      flatMap(charSet) 
      { b =>
        if (a != b) List("%c%c".format(a, b))
        else List()
      }
    }
    println(Nrec)
  }
}
