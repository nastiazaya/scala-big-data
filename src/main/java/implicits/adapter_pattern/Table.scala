package implicits.adapter_pattern

case class Table() extends Costable {
  override def cost(): Int = 20
}
