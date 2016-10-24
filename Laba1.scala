/**
  * Created by Ilasha on 24.10.2016.
  */
 // Задание 1. Функция, печатающая все целые числа от 0 до n (n может быть отрицательным!)
  object  Task1 extends App {
  def printNumbers(n:Int):Int = {
    if( n == 0)
      {
        println(n)
        n
      }
    else {
      if (n > 0) {
        val a = printNumbers(n - 1) + 1
        println(a)
        a
      } else {
        val a = printNumbers(n + 1) - 1
        println(a)
        a
      }
    }
  }
  printNumbers(-14)
  }
// Задание 2. Функция Аккермана
object Task2 extends  App {
  def akkerman(m:Int, n:Int):Int = {
    if (m==0){n+1} else {
      if (m>0 && n==0) {akkerman(m-1,1)}
      else { akkerman(m-1,akkerman(m,n-1))

      }
    }
  }
  println (akkerman(3,6))
}
// Задание 3. Функция, проверяющая является ли заданное число степенью двойки (без использования math.pow)
object Task3 extends App {
  def isPowerOfTwo(n: Int):Boolean = {
    if(n != 2 && n%2 == 0){
      isPowerOfTwo(n/2)
    }
    else{
      if(n==2){
        true
      }
      else {
        false
      }
    }
  }
  println(isPowerOfTwo(2))
}
// Задание 4. Функция,вычисляющая сумму цифр десятиричного числа (без использования строк)
object Task4 extends App {
  def sum(n:Int):Int= {
    if (n/10 > 0) {
      n%10 + sum(n/10)
    }
    else {
      n
    }
  }
  println(sum(20))
  }

// Задание 5. Функция, вычисляющая факториал
object Task5 extends App{
  def factorial (n:Int):Int = {
    if (n<=1) 1
    else
      n*factorial(n-1)
  }
  println(factorial(4))
}


// Задание 6. Функция, вычисляющая элемент треугольника паскаля
object Task6 extends App {
  def pascal(row: Int, column: Int): Int = {
    if (column == 0 || column==row) 1
    else
      pascal(row - 1, column - 1) + pascal(row - 1, column)
  }
  println (pascal(6,2))//да,детка
}
// Just for fun
object Task6ForFun extends App {
  def C(n:Int)={
    for (i <- 0 to n){
      for (j <- 0 to i){
        print(Task6.pascal(i,j) + " ")
      }
      println
    }
  }
  C(7)
}