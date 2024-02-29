package scala_lxh.yishizhuanhuan
class wweixing(name:String){
    var namesc=name
}
object yishi_class {
  implicit class wei(wweixing:wweixing){
    def fly(): Unit = {
      println("我是中文=》",wweixing.namesc)
    }
  }
  def main(args: Array[String]): Unit = {
    val lxh = new wweixing("lxh")
    lxh.fly()
  }
}
