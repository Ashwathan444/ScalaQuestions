object CommonItems {

  def main(args: Array[String]): Unit ={

    val one = List("Cake","Milk","Cheese","ToiletPaper")
    val two = List("Bread","Water","Juice","Milk","Cheese")

    val result = for (item <- one if two.contains(item)) yield item

    display(one)
    display(two)
    print("Common items are : \n" +result)
  }

  def display(basket : List[String]): Unit ={
    print("Shopping basket values = ")
    println(basket.foreach(a => print(a + " - ")))
  }
}