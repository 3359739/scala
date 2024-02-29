//柯理化相当于执行一个函数在继续执行一个函数这相当与一个接一个函数执行
object kelihua_fun {
  def weixing(name: String)(name1:String) = {
    name+name1
  }
  def main(args: Array[String]): Unit = {
    val str = weixing("dsadsad")("Dsdasweeeeeeeeeeeeee")
    println(str)
  }
}
