object test {
  def main (args: Array[String]): Unit ={
    val myCounter = new Counter
    myCounter.increment() //或者也可以不用圆括号，写成myCounter.increment
    println(myCounter.current)
  }
}

class Counter {
  private var value = 0
  def increment(): Unit = value += 1 //去掉了大括号
  def current(): Int = {value}  //作为对比，这里依然保留大括号
}

