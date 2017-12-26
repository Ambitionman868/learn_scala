object test {
  def main (args: Array[String]): Unit ={
    val myCounter = new Counter
    myCounter.increment(myCounter.value) //或者也可以不用圆括号，写成myCounter.increment
    println(myCounter.current)
    myCounter.value = 3
    myCounter.increment(1)
    println(myCounter.value)
  }
}

class Counter {
  var value = 0
  def increment(step:Int): Unit = value += step //去掉了大括号
  def current(): Int = {value}  //作为对比，这里依然保留大括号
}

