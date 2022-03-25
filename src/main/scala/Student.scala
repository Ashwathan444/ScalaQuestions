import java.time.{LocalDate, Period}

class Student(name:String, bDay:Int, bMonth:Int, bYear:Int, marks:Int, totalMarks: Seq[Int]) {

  def display(): Unit ={
    val age:Int = calculateAge(bDay:Int,bMonth:Int, bYear:Int)
    val percentile:Double = calculatePercentile(marks:Int,totalMarks:Seq[Int])
    print(
      s"""{
         |"name": "$name"
         |"age": $age
         |"percentile" : $percentile
         |}""".stripMargin)
  }

  def calculateAge(bDay:Int,bMonth:Int, bYear:Int): Int ={
    val today = LocalDate.now()
    val birthday = LocalDate.of(bYear,bMonth,bDay)
    val age = Period.between(birthday, today)
    age.getYears
  }

  def calculatePercentile(marks: Int, totalMarks: Seq[Int]): Double ={
    val sorted = totalMarks.sorted
    val count:Double =  sorted.filter(_ < marks).length
    val percentile = (count/sorted.length)*100
    percentile
  }

}
