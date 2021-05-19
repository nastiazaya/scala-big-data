package implicits.adapter_pattern

object Calculator {

  def total(list : List[Pricable]): Int = {
    list.map(_.price()).sum
  }

}
