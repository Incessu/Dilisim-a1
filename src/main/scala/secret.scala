object secret extends App {

  println("enter your text")
  val sentence = readLine()

  implicit def Splitter(s: String) = s.length
  val words = (sentence.split(" +"))

  if (words.contains("secret"))
    println("There is 'Secret' word in text")
  else
    println("There no 'Secret' word in text")

  val Secret = words.filter(_.contains("secret"))
  println(s"'Secret' substring is ${Secret.size} in text text.")

}
