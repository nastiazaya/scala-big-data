package quote.lab

object Main {

  def main(args: Array[String]): Unit = {
    QuoterAggregator.addQuoter(new ShakespearQuoter())
    QuoterAggregator.addQuoter(MessageQuoter("some message"))
    QuoterAggregator.addQuoter(RandomQuoter)
    QuoterAggregator.printAllQuoters()
  }

}
