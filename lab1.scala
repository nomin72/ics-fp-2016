object Fibonacci {
	def main(args: Array[String]) {
		println(fib(13))
	}

	def fib(n: Int): Int = {
		if (n <= 2) 1
		else fib(n-1) + fib(n-2)
	}
}