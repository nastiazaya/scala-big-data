package heroes.model

class Hobbit extends Hero {
  override var power: Int = 0
  override var hp: Int = 3

  def cry(): Unit = println("I am crying")

  override def kick(hero: Hero): Unit = {
    println("hobbit")
    cry()
  }

  override def getType: String = "Hobbit"
}
