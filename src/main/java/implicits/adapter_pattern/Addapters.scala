package implicits.adapter_pattern

object Addapters {

  implicit def costableToPricable(product: Costable):Pricable = {
    new Addapter(product)
  }
}
