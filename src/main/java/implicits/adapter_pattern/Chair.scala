package implicits.adapter_pattern

case class Chair() extends Costable {
  override def cost(): Int = 10
}
