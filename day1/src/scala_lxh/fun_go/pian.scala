package scala_lxh.fun_go

trait wei{
  var we="dasd"

}
class eo extends wei {
   println(we)
}
object pian {
  //偏函数是没有形参数 函数名后加上:PartialFunction[表明什么类型进,什么类型出]
  def weixing:PartialFunction[String,String] = {
    case "WEIXING" => "123"
    case "ppo" => "wwwww"
    case _ => "WWWWWWW"
  }
  def main(args: Array[String]): Unit = {
    println(weixing("12"))
  }
}
