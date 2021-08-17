/*
1.	Write a function literal that takes two integers and returns the higher number.
Then write a higher-order function that takes a 3-sized tuple of integers plus this function literal
and uses it to return the maximum value in the tuple.
Test Cases:
a) maxi(11,5) = 11
b)find((11,5,7),maxi) = 11
 */
package org.example

object function_literal extends App{

  println("Enter two Integers  : ")
  val number= scala.io.StdIn.readInt()
  val number2 = scala.io.StdIn.readInt()
  def maxi =(x:Int, y:Int) => if (x > y) x else y
  println("The maximum Element : " +maxi(number,number2))
  println("Enter third Integer  : ")
  val number3= scala.io.StdIn.readInt()

  def find(seq: (Int, Int, Int), maximum: (Int, Int) => Int): Int = {
      maximum(seq._1, maximum(seq._2, seq._3))
     }

  println("The maximum Element : " +find( (number, number2, number3), maxi ))
}

