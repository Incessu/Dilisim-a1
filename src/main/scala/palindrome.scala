object palindrome extends App{
  def palindrome(s : String) : Boolean = {
    val words = s.toLowerCase.filter(x => x.isLetter)
    (words == words.reverse)
  }

  println("enter your text")
  val input = readLine()

  if (palindrome(input))
    println("is a palindrome")
  else
    println("is not a palindrome")

}
