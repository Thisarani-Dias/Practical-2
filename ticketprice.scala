package Ques4

object ticketprice {
  def attendees(tp:Int) = 120+(15-tp)/5*20
  def revenue(tp:Int) = attendees(tp)*tp
  def cost(tp:Int) = 500+3*attendees(tp)
  def profit(tp:Int) = revenue(tp)-cost(tp)

  def main(args:Array[String]): Unit = {
    var tp1 = 10
    var res1 = profit(tp1)
    var tp2 = 15
    var res2 = profit(tp2)
    var tp3 = 20
    var res3 = profit(tp3)
    var tp4 = 25
    var res4 = profit(tp4)
    var tp5 = 30
    var res5 = profit(tp5)
    var tp6 = 35
    var res6 = profit(tp6)

    println("The profit when ticket price = 10 is " + res1)
    println("The profit when ticket price = 15 is " + res2)
    println("The profit when ticket price = 20 is " + res3)
    println("The profit when ticket price = 25 is " + res4)
    println("The profit when ticket price = 30 is " + res5)
    println("The profit when ticket price = 35 is " + res6)

  }
}
