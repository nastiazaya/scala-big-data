package implicits.adapter_pattern

class Addapter(product: Costable)  extends Pricable {
  override def price(): Int = product.cost()
}
