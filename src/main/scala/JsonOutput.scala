import scala.io.StdIn._
import java.time.LocalDate

object JsonOutput  extends App{

  println("Enter name : ")
  val name = readLine()
  println("Enter dob year : ")
  val dobInYear = readInt()
  println("Enter marks : ")
  val marks = readInt()
  println("Enter total marks : ")
  val totalMarks = readInt()

  def calculate(name:String,dob:Int,marks:Int,tmarks:Int): Unit ={

    val age = LocalDate.now.getYear - dob
    val percentile = (marks/tmarks)*10
    print(
      s"""{
         |"name": "$name"
         |"age": $age
         |"percentile" : $percentile
         |}""".stripMargin)
  }

  calculate(name,dobInYear,marks,totalMarks)


}
