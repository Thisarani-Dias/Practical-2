package Ques1

object expressions {
  def A(k:Int, m:Int) = k+12*m
  def B(m:Int, j:Int) = m/j
  def C(n:Int, j:Int) = n%j
  def D(m:Int, j:Int) = m/j*j
  def E(f:Float, g: Float) = f+10*5+g

  def main(args:Array[String]): Unit = {
    var (k,i,j,m,n,f,g,c) = (2,2,2,5,5,12.0f,4.0f,'X')

    var qa = A(k,m)
    var qb = B(k,m)
    var qc = C(k,m)
    var qd = D(k,m)
    var qe = E(k,m)

    println("The value of k+12*m is " + qa)
    println("The value of m/j is " + qb)
    println("The value of n%j is " + qc)
    println("The value of m/j*j is " + qd)
    println("The value of f+10*5+g is " + qe)
    i+=1
    println("The value of ++i*n is " + i*n)
  }
}
