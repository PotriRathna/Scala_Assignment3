/*
2.	The library function util.Random.nextInt returns a random integer.
Use it to invoke the “max” function with two random integers plus a function that returns the larger of two given
integers. Do the same with a function that returns the smaller of two given integers,
 and then a function that returns the second integer every time.
 Test Case :
 value(Random Integer) = 56,38
 a) find(value,maxi) = 56
 b)find(value,small) = 38
 c) second_element(value) = 38
 */
package org.example

object Random_Integer extends App{

  def maxi =(x:Int, y:Int) => if (x > y) x else y
  def small =(x:Int, y:Int) => if (x > y) y else x

  def find(seq:(Int,Int,Int), func:(Int,Int)=>Int):Int={
     func(seq._1,func(seq._2, seq._3))
  }
  def second_element =(x:Int, y:Int) => y
  def  number= util.Random.nextInt

  val value= (number, number,number)
  println(value)
  println(s"maximum : " +find( value, maxi ))
  println(s" smaller:  ${find( value, small )}")
  println(s"Second : ${find(value,second_element)}")
}
