object CommonItems extends App{

  val basketOne = List("Cake","Milk","Cheese","ToiletPaper")
  val basketTwo = List("Bread","Water","Juice","Milk","Cheese")

  val result = for (item <- basketOne if basketTwo.contains(item)) yield item

  print("Shopping basket one = " )
  println(basketOne.foreach(a => print(a + " - ")))
  print("Shopping basket one = " )
  println(basketTwo.foreach(a => print(a + " - ")))
  print("Common items are : \n" +result)
}
