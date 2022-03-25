trait Vehicle3
{
  def availabilty(bookedSeats: Int):Boolean

  def printDetalis()
}

class Plane3(company: String, modelNo: Int, capacity: Int) extends Vehicle3
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

object AirPlane3 {

  def main(args: Array[String]) {

    val plane3 = new Plane2("Indigo",300,750 )
    println(plane3.printDetalis())
    val r = scala.util.Random
    val reservations = r.nextInt(1000)
    println("Availability : " + plane3.availabilty(reservations))
  }
}