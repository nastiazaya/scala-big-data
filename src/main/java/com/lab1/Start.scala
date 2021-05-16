package com.lab1

object Start {

  def main(args: Array[String]): Unit = {
    val login = NewLogin("admin1","a123","a123")
    val msg = LoginValidator.validate(login)
    println(msg)
  }

}
