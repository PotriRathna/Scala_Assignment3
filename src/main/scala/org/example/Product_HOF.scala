/*
3.	Write a higher-order function that takes an integer and returns a function.
The returned function should take a single integer argument (say, “x”)
and return the product of x and the integer passed to the higher-order function.
Test Case :
Integer: 4
 product=hof(5) => 5*4 = 20
 */
package org.example

object Product_HOF extends App{
  println("Enter the integers to high order function  : ")
  val value= scala.io.StdIn.readInt()
  println("Enter the integer  : ")
  def hof(number:Int) = (number1:Int)=>  println( number * number1)

  val product = hof(value)
  println(s"The product of the number is : ${product(scala.io.StdIn.readInt())}")

}
