object palindrome extends App{
  def palindrome(s : String) : Boolean = {
    val sLetters = s.toLowerCase.filter(c => c.isLetter)
    (sLetters == sLetters.reverse)
  }


  println("enter a line of text")
  val input = readLine()

  if (palindrome(input))
    println("is a palindrome")
  else
    println("is not a palindrome")

}
