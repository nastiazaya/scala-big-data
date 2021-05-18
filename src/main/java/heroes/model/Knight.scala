package heroes.model

import heroes.util.RandomUtil

class Knight extends Hero {
  override var power: Int = RandomUtil.between(2,12)
  override var hp: Int = RandomUtil.between(2,12)

  var weaponStrategy : WeaponStrategy = new Sword
  override def kick(hero: Hero): Unit = weaponStrategy.kick(this, hero)

  override def getType: String = "Knight"
}
