package scala_lxh

//在scala中变量是var 和 val
//class是可以传参数 object是不可以传参的
//object相当于java中的static 静态类直接方法.
object chang_bian {
  def main(args: Array[String]): Unit = {
    var weixing = "weixing"
    weixing = "weuuuu"
    print(weixing)
    val weixingday = "wedd"
//    weixingday = "wae" 报错常量不可更改
  }
}
