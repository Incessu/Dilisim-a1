object longest extends App{
  println("enter your text")
  val sentence = readLine()

  implicit def string2ordering(s: String) = s.length
  val words = (sentence.split(" +"))
  println(
    words.maxBy(_.length)
  )
}
