

//Вариант 3
  // Задание 3. Функция, проверяющая является ли заданное число степенью двойки (без использования math.pow)
  object Task1 extends App 
  {
  def isPowerOfTwo(n: Int):Boolean = 
  {
    if(n != 2 && n%2 == 0)
    {
      isPowerOfTwo(n/2)
    }
    else 
    {
      if(n==2)
      {
        true
      }
      else 
      {
        false
      }
    }
  }
  println(isPowerOfTwo(2))
}
