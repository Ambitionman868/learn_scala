

class Counter {
  //value变成私有字段以后，Scala又没有提供getter和setter方法，怎么可以访问value字段呢？
  // 解决方案是，在Scala中，可以通过定义类似getter和setter的方法，分别叫做value和value_=

  private var privateValue = 0

  def value = privateValue;

  def value_=(newValue: Int) {
    if (newValue > 0) privateValue = newValue
  }

  def increment(step: Int): Unit = value += step //去掉了大括号
  def current(): Int = {
    value
  } //作为对比，这里依然保留大括号
}


object test {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    println(myCounter.value)
    myCounter.value = 3
    println(myCounter.value)
    myCounter.increment(1)
    println(myCounter.current)
  }
}

