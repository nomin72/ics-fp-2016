/**
  * Created by Reedman on 19.12.2016.
  */
object LabRab1 extends App{
  def Treangle(i:Int, j:Int): Int = {
    if (j == 0 || j == i) 1
    else Treangle(i - 1, j - 1) + Treangle(i - 1, j)

  }
  println (Treangle(1,1))
  println (Treangle(4,2))
}

