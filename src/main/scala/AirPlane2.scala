
abstract class Vehicle()
{
  def availabilty(bookedSeats: Int):Boolean

  def printDetalis()
}

class Plane2(company: String, modelNo: Int, capacity: Int) extends Vehicle()
{
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

object AirPlane2 {

  def main(args: Array[String])
  {

    val plane2 = new Plane2("Air India",200,750 )
    println(plane2.printDetalis)
    val r = scala.util.Random
    val reservations = r.nextInt(1000)
    println("Availability : " + plane2.availabilty(reservations))
  }
}
