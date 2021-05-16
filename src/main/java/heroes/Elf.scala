package heroes

class Elf extends Hero {
  override var power: Int = 10
  override var hp: Int = 10

  override def kick(hero: Hero): Unit = {
    println("elf")
    if(hero.power < power)
      hero.hp = 0
    else
      hero.power -= 1
  }

  override def getType: String = "Elf"
}
