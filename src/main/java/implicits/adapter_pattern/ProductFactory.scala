package implicits.adapter_pattern

import scala.util.Random

object ProductFactory {

  def createProduct():Costable = {
    val random = new Random()
    (random.nextBoolean()) match {
      case true => new Chair
      case false => new Table
    }
  }

}
