trait Vehicle4
{
  def availabilty(bookedSeats: Int):Boolean

  def printDetalis()
}

abstract class AirborneVehicle(company: String, modelNo: Int, capacity: Int)
{
  def availabilty(bookedSeats: Int):Boolean

  def printDetalis(): Unit ={
    println(s"Model : $company $modelNo \nCapacity : $capacity")
  }
}

case class Plane4(company: String, modelNo: Int, capacity: Int) extends AirborneVehicle(company, modelNo, capacity) with Vehicle4
{
  def availabilty(bookedSeats: Int): Boolean ={

    if(bookedSeats<capacity) {
      println("Available seats : " + (capacity-bookedSeats))
      true
    }
    else
      false
  }

}

object AirPlane4
{

  def main(args: Array[String])
  {

    val plane4 = new Plane4("Indigo",300,750 )
    println(plane4.printDetalis())
    val r = scala.util.Random
    val reservations = r.nextInt(1000)
    println("Availability : " + plane4.availabilty(reservations))
  }
}