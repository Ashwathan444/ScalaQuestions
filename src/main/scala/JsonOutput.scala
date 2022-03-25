import scala.io.StdIn._
import java.time.LocalDate

object JsonOutput{

  def main(args: Array[String]): Unit ={

    println("Enter name : ")
    val name = readLine()
    println("Enter day : ")
    val day = readInt()
    println("Enter month : ")
    val month = readInt()
    println("Enter year : ")
    val year = readInt()
    println("Enter marks : ")
    val marks = readInt()
    val totalMarks = List(80,50,45,75,66,20,85,90)

    val student1 = new Student(name,day,month,year,marks,totalMarks)
    student1.display
  }

}
