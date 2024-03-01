package scala_lxh.yishizhuanhuan

class weixing(str: String) {
  def fly(): Unit = {
    println(s"飞$str")
  }
}

class wei(str: String) {
 var str1=str
}

object yishi_hanshu {
  implicit def weifuly(wei:wei):weixing = {new weixing(wei.str1)}
  //下面描述是隐式函数    就是在那个类中没有这方法时会自动调用隐式函数
  def main(args: Array[String]): Unit = {
    val weixing = new weixing("小明")
    val wei = new wei("小男")
    weixing.fly()
    wei.fly()
  }
}
