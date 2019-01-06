package com.fys.scala.exmamples

import scala.collection.immutable.{HashMap, HashSet}


object HelloScala {

  def main(args: Array[String]): Unit = {

    //可变的数据结构
    var args = new Array[String](4)
    args(0) = "hello"
    args(1) = "world"
    args(2) = "!"

    var i = 0
    while (i < args.length) {
      print(args(i))
      i += 1
    }

    args.foreach(arg => print(arg + ""))

    //不可变数据结构
    var list1 = List("aaa","bbb","ccc")
    var list2 = List("ddd")
    var list3 = list1 ::: list2

    list3.foreach(lis => println(lis + " "))

    var set = HashSet("b",3,"c","c")
    set += "very"
    set.foreach(value => print(value + ""))
    println()

    var map = HashMap(1 -> "a", 2 -> "b", 3 -> "c")
    map += (4 -> "d")
    map.foreach(values => print(values + ""))

  }
}
