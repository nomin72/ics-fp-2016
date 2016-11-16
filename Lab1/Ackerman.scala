import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter

/**
  * Created by Sergey on 17.11.16.
  */
object Ackerman {
    def Ack(m: Int, n: Int): Int = {
      if (m<0 || n<0) throw new IllegalArgumentException("Your argument is wrong");
      if (m==0) n+1
      else if (n==0) Ack(m-1, 1)
      else Ack(m-1, Ack(m, n-1));
    }

    def main(args: Array[String]): Unit = {
      println("Returned value of Ackerman function = " + Ack(3,12).toString);
    }
}
