object Akkerman {
  def akkerman(m:Int, n:Int):Int = {
    if (m==0){n+1} else {
      if (m>0 && n==0) {akkerman(m-1,1)}
      else { akkerman(m-1,akkerman(m,n-1))

      }
    }
  }
  def main(args: Array[String]) = println (akkerman(1,3))
}
