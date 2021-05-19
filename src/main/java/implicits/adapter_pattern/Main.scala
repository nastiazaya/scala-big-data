package implicits.adapter_pattern
import Addapters._
object Main {
  def main(args: Array[String]): Unit = {
    val productList: List[Pricable] = List(ProductFactory.createProduct(),ProductFactory.createProduct())
    println(Calculator.total(productList))
  }

}
