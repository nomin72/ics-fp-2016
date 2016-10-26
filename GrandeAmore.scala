object GrandeAmore {
  var nod = 0
  def nod(m:Int, n:Int):Int= {
    nod = if ( n == 0) m else nod(n, m % n)
    nod
  }
 }

