package heroes.model

import heroes.util.RandomUtil

class Sword extends WeaponStrategy {
  override def kick(attacker: Hero, defender: Hero): Unit = {
    val damage = RandomUtil.between(0 , attacker.power)
    defender.hp -= damage;
  }
}
