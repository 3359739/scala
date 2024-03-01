package scala_lxh.jicheng

object macth {
  def weixing(x:Int): Unit = {
    x match {
      case 1=>println(123)
      case 45=>println("we")
      case  _=>println(123654)
     }
  }
  def main(args: Array[String]): Unit = {
   weixing(45)
  }
}
