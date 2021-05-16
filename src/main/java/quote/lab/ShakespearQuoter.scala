package quote.lab

class ShakespearQuoter(message : String = "to be or not to be") extends Quoter {

  override def printMessage(): Unit = {
    println(message)
  }
}
