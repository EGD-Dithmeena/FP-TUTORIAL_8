object LabSession8_Q3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Ni")(toUpper) + formatNames("roshan")(toLower))
    println(formatNames("Saman")(toLower))
    println(formatNames("K")(toUpper) + formatNames("umar")(toLower) + formatNames("a")(toUpper))
  }

  private val toUpper: String => String = str => str.toUpperCase

  private val toLower: String => String = str => str.toLowerCase

  private def formatNames(name: String)(func: String => String): String = {
    func(name)
  }
}
