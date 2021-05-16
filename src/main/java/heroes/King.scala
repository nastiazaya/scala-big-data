package heroes

class King extends Hero {
  override var power: Int = RandomUtil.between(5,15)
  override var hp: Int = RandomUtil.between(5,15)

  var weaponStrategy : WeaponStrategy = new Sword
  override def kick(hero: Hero): Unit = weaponStrategy.kick(this,hero)

  override def getType: String = "King"
}
