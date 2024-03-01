package scala_lxh.yishizhuanhuan

object day1 {
  implicit var wei="ddd"
  def weixiung(implicit weixing:String): Unit = {//传参是隐式值时要是调用时没有加括号 会自动寻找代码中的隐式进行代替
    println(weixing)
  }
  def wei(int: Int)(implicit string: String)={
      println(s"传的是整数=>$int")
      println(s"隐式值$string")
  }
  def main(args: Array[String]): Unit = {
       weixiung("weeeee")
       //要是传入的值有实参和隐式值时函数写成可里化
       wei(15)("WEEe")
  }
}



