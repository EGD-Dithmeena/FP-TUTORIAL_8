import scala.io.StdIn

object LabSession8_Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter an integer number: ")
    val value = StdIn.readInt()
    println("The input is: " + patternMatching(value))

  }

  private val patternMatching: Int => String = {
    case x if x < 0 => "Negative"
    case 0 => "Zero"
    case x if x % 2 == 0 => "Even"
    case x if x % 2 != 0 => "Odd"
  }
}
