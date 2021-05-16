package heroes

object GameLogger {
  def logHobbitsBattle:Unit = {
    println("Hobbits are crying\nGame Over")
  }

  def logElfsBattle:Unit = {
    println("Elfs can not fight each other\nGame Over")
  }


  def gameOver(hero1:Hero, hero2: Hero):Unit ={
    (hero1.hp,hero2.hp) match {
      case (hp1, hp2) if hp1 > 0 && hp2 <= 0 => println(hero1.getType + "is win and" + hero2.getType + "is lose")
      case (hp1, hp2) if hp1 <= 0 && hp2 > 0 => println(hero2.getType + "is win and" + hero1.getType + "is lose")
    }
  }

  def logAtack(hero1:Hero, hero2: Hero):Unit = println(hero1.getType + " is hit the " + hero2.getType)

  def logDamage(hitHero:Hero, attackedHero: Hero, hpBefore: Int):Unit = {
    if (attackedHero.hp <= 0)
      println(hitHero.getType + " was kill the " + attackedHero.getType)
    else if(hitHero.getType.equals("Elf"))
      println(attackedHero.getType + "lost 1 from his power")
    else{
      val lostHp = hpBefore - attackedHero.hp
      println(attackedHero.getType + " lost " + lostHp + " from his hp")
    }
  }

}
