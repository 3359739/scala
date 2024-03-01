package scala_lxh.yishizhuanhuan
case class yang(var name:String,var age:Int)
//样式类会自动帮我们重写一些常见的方法
object yangshilei {
  def main(args: Array[String]): Unit = {
   var w=yang("weixing",26)
   var q=yang("weixing",21)
    println(w.equals(q))
    println(w.toString)
    println(q.name)
  }
}
