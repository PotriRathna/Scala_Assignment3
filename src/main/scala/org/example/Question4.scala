package org.example
/*
4.	Let’s say that you happened to run across this function while reviewing another developer’s code:
def fzero[A] (x: A) (f: A => Unit): A = {f(x); x}
What does this function accomplish? Can you give an example of how you might invoke it?
 */
object Question4 extends App{

  println("Enter the a double value  : ")
  val value= scala.io.StdIn.readDouble()
  def fzero(x:Double, f: Double => Unit):Double = { f(x); x }
  fzero(value, s => println(s"The round value : ${Math.round(s)}"))
}
