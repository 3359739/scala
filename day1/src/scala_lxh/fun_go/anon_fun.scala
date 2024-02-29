package scala_lxh.fun_go

//里面函数
object anon_fun {
  def main(args: Array[String]): Unit = {
    var weixing = (name: String) => {
      print(name)
     " weixing"
    }//创建匿名函数
    val pp=weixing("nmae")
    println(pp)
  }
}
