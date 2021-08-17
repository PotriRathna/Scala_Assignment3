package org.example
/*
5.	Write a function called “conditional” that takes a value x and two functions, p and f, and returns a value
of the same type as x. The p function is a predicate, taking the value x and returning a Boolean b.
The f function also takes the value x and returns a new value of the same type. Your “conditional” function
should only invoke the function f(x) if p(x) is true, and otherwise return x.
How many type parameters will the “conditional” function require?
 */
object Function_Conditional extends App {

  def conditional[A](x: A, p: A => Boolean, f: A => A): A =
       if (p(x)) f(x) else x

  println(s" String Reverse: ${conditional[String]("Conditional", _.length > 3, _.toUpperCase)}")
  println(s" Product of 2 : ${conditional[Int](343, _ > 0, _.*(2))}")

}

