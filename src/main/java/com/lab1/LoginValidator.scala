package com.lab1

object LoginValidator {

  def validate(login:NewLogin): Unit ={

    login match {
      case NewLogin("admin", _, _) => "admin can't be user name"
      case NewLogin(_, pass, _) if pass.startsWith("z") => "password can't start from 'z'"
      case NewLogin(userName, pass, _) if pass == userName => "username can't = password"
      case NewLogin(_, pass, _) if pass.forall(_.isDigit) => "password can't start from digit"
      case NewLogin(_, pass, conf) if pass != conf => "pass not like confirmation"
      //case "asd" => "OK"
      case _ => "OK"
    }
  }

}
