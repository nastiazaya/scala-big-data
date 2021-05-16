package heroes

trait Hero {

  var power: Int
  var hp: Int

  def isAlive: Boolean = hp > 0

  def kick(hero: Hero)

  def getType: String

}
