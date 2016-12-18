// Anisimov Andrey 13544/1
// Task1 - 'def printNumbers (n: Int)'
// Date 18.12.2016

object Main
{
  def printNumbers(n: Int): Unit =
  {
    if (n<0)
      return (); // A range from 0 to negative number is empty (if not, see 'printNumbersAlt')
    if (n>0)
      printNumbers(n-1);
    print(n + " ");
  }
  
  def printNumbersAlt(n: Int): Unit =
  {
    if (n<0)
      printNumbersAlt(n+1); 
    else if (n>0)
      printNumbersAlt(n-1);
    print(n + " ");
  }
  
  def main(args: Array[String]): Unit =
  {
    println("printNumbers(17):");    printNumbers(17);    println();
    println("printNumbers(5):");     printNumbers(5);     println();
    println("printNumbers(0):");     printNumbers(0);     println();
    println("printNumbers(-2):");    printNumbers(-2);    println();
    println("printNumbers(-18):");   printNumbers(-18);   println();
    println("printNumbersAlt(6):");  printNumbersAlt(6);  println();
    println("printNumbersAlt(-7):"); printNumbersAlt(-7); println();
    println("printNumbersAlt(0):");  printNumbersAlt(0);  println();
    
  }
}