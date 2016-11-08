

object lab1 {
    def main (args: Array[String]) {
        //println("Hello, world!")
      def isPower(a:Int)
      {
        if (a ==2)
        {
          println ("THIS NUMBER POSESSES THE POWER OF TWO"); //ну шутка про то что power это возведение в степень :)
          return;
        }
        if (a==0)
        {
          println ("NUMBER IS ZERO I HAVE DOUBTS");
          return;
        }
      if (a%2 == 1)
      {
        println ("THIS NUMBER DOES NOT POSESS THE POWER OF TWO");
        return;
      }
      else 
       isPower(a/2); 
    }
      isPower(0);
      isPower(1);
      isPower(2);
      isPower(5);
      isPower(32);
      isPower(112);
      
      }
}