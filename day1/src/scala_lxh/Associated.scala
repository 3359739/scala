package scala_lxh
class  Associated(){
    private  var wei=156
  private  def weoxomg(): String = {
    return "dsahshkd"
  }
}
//伴生类 object和class 名字一样 伴生类可以直接访问私有变量(是自己的半生类)
object Associated {
  def main(args: Array[String]): Unit = {
    val associated = new Associated()
    println(associated.weoxomg())
    println(associated.wei)
    //     we.wei //私有变量不是半生类不可访问

  }
}
