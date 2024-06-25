package Ques3

object takehomesalary {
  def takehomesalary(workhrs:Int, othrs:Int) = {
    val normalpay = 250
    val otpay = 85
    val taxrate = 0.12

    var salary = (normalpay * workhrs) + (otpay*othrs)
    var tax = salary * taxrate
    var takehomeslry = salary-tax
    println("The takehome salary is " + takehomeslry)
  }

  def main (args:Array[String]):Unit ={
    var workhrs = 40
    var othrs = 30
    var thsalary = takehomesalary(workhrs, othrs)
  }

}
