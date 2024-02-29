package scala_lxh.jicheng
//tiars 是不能传参数的可以定义实现方法也可以定义接口 ->可以实现多继承
trait day1{
  def weixing(int: Int,int1: Int):(Int)
  def weixing(): Unit = {
    println("我是被继承的")
  }
}
trait duoday1 {
   def duojicheng(): Unit = {
     println("我是第2个被继承的")
   }
}
class lxh extends day1 with duoday1 {
  def weixing(int: Int, int1: Int): Int = {
    println("我是接口")
    15+65
  }
}
object taires {
  def main(args: Array[String]): Unit = {
    val lxh = new lxh
    println(lxh.weixing(15, 65))
    lxh.duojicheng()
  }
}
