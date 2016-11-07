object lab1_v8 extends App {
  def nod(m: Int, n: Int): Int = {
    if (m == 0)
      n
    else
      nod(n % m, m)
  }

  println(nod(7, 15))
  println(nod(10, 8))
  println(nod(6, 9))
  println(nod(4, 8))
}