object LabSession8_Q1 {
  def main(args: Array[String]): Unit = {
    val depositAmount1 = 15000.0
    val depositAmount2 = 100000.0
    val depositAmount3 = 500000.0
    val depositAmount4 = 2500000.0

    val calculateInterest: Double => Double = depositAmount => {
      val interestRate = depositAmount match {
        case amount if amount <= 20000 => 0.02
        case amount if amount <= 200000 => 0.04
        case amount if amount <= 2000000 => 0.035
        case amount if amount > 2000000 => 0.065
      }

      depositAmount * interestRate
    }

    println(s"Deposit Amount: Rs. $depositAmount1 & Interest earned: Rs. ${calculateInterest(depositAmount1)}")
    println(s"Deposit Amount: Rs. $depositAmount2 & Interest earned: Rs. ${calculateInterest(depositAmount2)}")
    println(s"Deposit Amount: Rs. $depositAmount3 & Interest earned: Rs. ${calculateInterest(depositAmount3)}")
    println(s"Deposit Amount: Rs. $depositAmount4 & Interest earned: Rs. ${calculateInterest(depositAmount4)}")
  }
}