object IntegerToString {

  def convert( nums:Int* ) = {

    val str = for(num <- nums) yield num.toString
    str

  }

  def main(args: Array[String]){

    val result1 = convert(10)
    val result2 = convert(10,11,12)

    println(result1(0) + " as String literal = " + result1(0))
    print(" as String literals = " + result2.foreach(a => print(a + ",")))
    println(result2.foreach(a => print(a + " :: ")))

  }

}
