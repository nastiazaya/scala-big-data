package quote.lab

object QuoterAggregator {

  var quoterList: List[Quoter] = Nil

  def addQuoter(quoter: Quoter): Unit = {
    quoterList = quoter ::quoterList
  }

  def printAllQuoters(): Unit = {
    quoterList.foreach(_.printMessage())
  }

}
