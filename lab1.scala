object HelloWorld {
    
   def isPowerOfTwo(n:Int):Boolean = {
       var div:Int = n/2;
       var mod:Int = n%2;
       
       if (div == 0) {
            return (mod == 1);
       } else {
           if(mod == 0) {
               return isPowerOfTwo(div);
           } else {
               return false;
           }
       }
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

