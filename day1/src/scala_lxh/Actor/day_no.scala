package scala_lxh.Actor
import scala.actors.Actor
case class  zhojain(var name:Actor,string: String)
class scm extends Actor{
  override def act(): Unit = {

    while (true){
      receive({
        case x:zhojain=> {
          println(x.string)
          x.name ! "wwww"
        }
      })
    }
  }
}
class lxh(scm:scm) extends Actor{
  override def act(): Unit ={
    while (true){
      receive({
        case "wwww"=>scm ! zhojain(name =this,string = "wewqe")
        case _=>scm ! zhojain(name =this,string = "weeqwewqe")
      })
    }
  }
}
//这里通过在lxh中实现样式类 在传到scm 类里面 传值时里面包含this lxh本身 在通过在scm里面接受在往回传
object day_no {
  def main(args: Array[String]): Unit = {
    val scm = new scm
    val lxh = new lxh(scm)
    scm.start()  //启动
    lxh.start()
    lxh ! "sddddd"  //这里通过传上面一个scm实现联通  这里指是单向从lxh传到scm
  }
}
