package quote.lab
import com.github.javafaker._

object RandomQuoter extends Quoter {

  private val faker = new Faker

  override def printMessage(): Unit = {
    val quote = faker.gameOfThrones.quote()
    println(quote)
  }
}
