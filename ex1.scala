/**
  * Created by Витя on 22.11.2016.
  */
object ex1 {
  def ispow2(n: Int) : Boolean =
  {
    var i: Int = n;
    var f: Boolean = true;
    var d: Int = 0;
    do
    {
      d = i%2;
      if (d == 1) { f=false;}
      i= i / 2;
    }
    while(i>2)
    return f;
  }
  }
