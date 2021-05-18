package heroes

import heroes.infra.HeroFactory
import heroes.services.GameManager

object Main {
  def main(args: Array[String]): Unit = {
    val hero1 = HeroFactory.getRandomHero
    val hero2 = HeroFactory.getRandomHero
    println(hero1)
    println(hero2)
    GameManager.fight(hero1,hero2)

  }
}
