package heroes


object GameManager {

  def fight(hero1: Hero, hero2: Hero): Unit = {
    (hero1.getType, hero2.getType, hero1.hp, hero2.hp) match {
      case ("Hobbit", "Hobbit", _, _) => GameLogger.logHobbitsBattle
      case ("Elf", "Elf", _, _) => GameLogger.logElfsBattle
      case (_, _, hp1, hp2) if hp1 > 0 && hp2 > 0 =>
        GameLogger.logAtack(hero1, hero2)
        val hpBefore = hero2.hp
        hero1.kick(hero2)
        GameLogger.logDamage(hero1, hero2, hpBefore)
        fight(hero2, hero1)
      case (_, _, hp1, hp2) if hp1 <= 0 && hp2 > 0 => GameLogger.gameOver(hero1, hero2)
      case (_, _, hp1, hp2) if hp1 > 0 && hp2 <= 0 => GameLogger.gameOver(hero1, hero2)
    }
  }
}
