import scala.util.Random
case class Plane(company: String, modelNo: Int, capacity: Int){

  def availabilty(bookedSeats: Int): Boolean ={

    if(bookedSeats<capacity) {
      println("Available seats : " + (capacity-bookedSeats))
      true
    }
    else
      false
  }

  def printDetalis(): Unit ={
    println(s"Model : $company $modelNo \nCapacity : $capacity")
  }
}

object AirPlane{

  def main(args: Array[String]): Unit ={

    val plane1 = Plane("Boeing",747,1000)
    println(plane1.printDetalis())
    val r = scala.util.Random
    val reservations = r.nextInt(1200)
    println("Availability : " + plane1.availabilty(reservations))
  }
}
