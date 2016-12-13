object HelloWorld {
    
   def isPowerOfTwo(n:Int):Boolean = {
       
       return if (n/2 == 0) n%2 == 1 else if (n%2 == 0) isPowerOfTwo(n/2) else false
       
   }
   
   def main(args: Array[String]) {
      println(isPowerOfTwo(0));
      println(isPowerOfTwo(1));
      println(isPowerOfTwo(2));
      println(isPowerOfTwo(3));
      println(isPowerOfTwo(4));
      println(isPowerOfTwo(5));
      println(isPowerOfTwo(6));
      println(isPowerOfTwo(7));
      println(isPowerOfTwo(8));
      println(isPowerOfTwo(1024));
   }
   
}

