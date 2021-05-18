package heroes.infra

import heroes.model.Hero
import heroes.util.RandomUtil
import org.reflections.Reflections

import scala.jdk.CollectionConverters.CollectionHasAsScala

object HeroFactory {

  val scanner = new Reflections("heroes")
  val heroesClasses = getAllTypes

  private def getAllTypes = {
    val set = scanner.getSubTypesOf(classOf[Hero])
    set.asScala.toList
  }

  def getRandomHero: Hero = {
    val randomNum = RandomUtil.between(0, heroesClasses.size)
    heroesClasses(randomNum).getDeclaredConstructor().newInstance()
  }

}
