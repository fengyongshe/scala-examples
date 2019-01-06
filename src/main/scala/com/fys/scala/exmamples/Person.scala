package com.fys.scala.exmamples

class Person(var firstName: String, var lastName: String) {

  println("The constructor begins")

  private val HOME = System.getProperty("user.home")
  var age = 0

  override def toString = s"$firstName, $lastName is $age years old"

  def printHome: Unit = {
    println(s"HOME=$HOME")
  }

  def printFullHome(): Unit = {
    println(this)
  }

  printHome
  printFullHome
  println("Still in the consutructor")
}
