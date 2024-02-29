package scala_lxh.fun_go

import java.util.Date
import java.util.jar.Attributes.Name
import javax.xml.crypto.Data


//函数传值
object gao_fun_day1 {
  //以函数为参数传值
  //这里是定义一个为weixing传入一个date的时间函数然后传入一个自定义函数
  def weixing(data: Date, f: (Int, Int) => Int) = {
    println(data)
    f(15, 789)
  }

  def f(n: Int, g: Int) = {
    println(n + g)
    156
  }

  def main(args: Array[String]): Unit = {
    val data = new Date()
    weixing(data, f)
  }
}


//函数返回值
object weixing {
  def fanhui(): (Int, Int) => Int ={
    var lei=(age:Int,age1:Int)=>{age+age1}
    return lei
  }

  def main(args: Array[String]) = {
     var we=fanhui()
    println(we(15, 65))
  }
}

object limi{
  def weixing(F:(Int,Int)=>Int,name: String): Int = {
    println(name)
    return F(15,65)
  }
  def main(args: Array[String]): Unit = {
    var weixin=(AGE:Int,WEI:Int)=>{AGE+WEI}
    println(weixing(weixin, "153"))
  }
}


