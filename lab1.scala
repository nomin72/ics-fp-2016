Лаб 1 13544/1:nomin
/**
 * Write a recursive function to get the nth Fibonacci number
   def fib(n: Int): Int
*/
def fib(n: Int): Int = {
    def go(n: Int, first: Int, second: Int): Int =
      if(n == 1) first
      else if (n == 2) second
      else go(n-1, second, first + second)
    go(n, 0, 1)
  }
