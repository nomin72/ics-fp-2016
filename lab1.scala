object Fibonacci {
    def fib(n: Int): Int = 
        if (n < 3) 1 
              else fib(n - 1) + fib(n - 2)
    def main(args: Array[String]) {
        for {i <- List.range(1, 17)} 
            yield { print(fib(i) + ", ") }
    }
}