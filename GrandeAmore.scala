object GrandeAmore extends App{
   def nod(m:Int, n:Int): Int = if ( n == 0) m else nod(n, m % n)
}

