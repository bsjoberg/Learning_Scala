package fun.bdd

/**
 * @author ${user.name}
 */
object App {
  def combination(x: Int, y: Int, function: (Int, Int) => Int): Int = function(x, y)

  def max(firstNumber: Int, secondNumber: Int): Int = if (firstNumber > secondNumber) firstNumber else secondNumber

  /**
   * Double the the number that was passed in
   *
   * @param value the number to double
   * @return the doubled number
   */
  def double(value: Int): Int = value * 2

  /**
   * Ensure a null string isn't passed to the function
   *
   * @param s string to execute some function on
   * @param f function to pass in
   * @return the String that was executed
   */
  def safeStringOp(s: String, f: String => String): String = {
    if (s != null) f(s) else s
  }

  def reverser(s: String): String = s.reverse

  def areaOfCircle(radius: Int): Double = 3.14 * Math.pow(radius, 2)

  def areaOfCircle(radius: String): Double = if (radius.isEmpty)
    0.0
  else
    areaOfCircle(radius.toDouble)

  def areaOfCircle(radius: Double): Double = {
    Math.pow(radius.toDouble, 2) * Math.PI
  }

  def sum(items: Int*): Int = {
    var total: Int = 0
    for (i <- items) total += i
    total
  }

  def multiplier(multicand: Int, multiplier: Int): Int = multicand * multiplier

  def printFivePerLine(number: Int): String = {
    var numbersByFive: String = ""
    for (i <- 1 to number) {
      numbersByFive += s"$i, "
      if (i % 5 == 0 && i < number) numbersByFive += "\n"
    }
    numbersByFive
  }

  def hexValueOfColor(color: String): String = {
    color match {
      case "cyan" => "#00FFFF"
      case "yellow" => "#FFFF00"
      case other => "Unexpected Value"
    }
  }

  def isDoubleGreater(number: Double): String = {
    if (number > 0.0) "greater"
    else if (number == 0.0) "same"
    else "less"
  }

  def isEmpty(name: String): String = {
    if (name.isEmpty) "n/a"
    else name
  }

  def powerOf2(): IndexedSeq[Int] = for (i <- 0 to 8; pow = 1 << i) yield pow

  def mod3(): IndexedSeq[Int] = for (i <- 1 to 20 if i % 3 == 0) yield i

  def main(args: Array[String]) {
    println("Hello World!")
    println("concat arguments = " + foo(args))
  }

  def foo(x: Array[String]): String = x.foldLeft("")((a, b) => a + b)
}