package scala_lxh.zhuhe_var

import scala.collection.mutable.ListBuffer

object arrny_next {
  def arryn_go(): Unit = {
    var arr = Array(15, 65, 123, 54, 65, 15) //创建数组可以在arryn后指明类型
    var arr1 = Array(456, 78, 98, 56, 212, 33)
    //    arr.foreach(println(_)) //相当 x=> print(x)
    val array = Array.concat(arr1, arr) //拼接数组
    val array1 = Array.fill(2)("dasddsdads") //生成两
    array1.foreach(print)
    //    array.foreach(println)
    val i = array.count(x => {
      if (x == 15)
        true
      else
        false
    })
    println(i)
  }

  def main(args: Array[String]) = {
    arryn_go()
  }
}

object list_next {
  def main(args: Array[String]): Unit = {
    var wei = List(156, 65, 45, 65, 12, 3)
    //    wei.foreach(println)
    val ints = wei.map(x => x * 2) //和flimap区别在于会压平 也是我们对其进行超做出现多个可以d代 时候flimap就进行压平只有一个可d代的
    println(ints)
    //过滤
    var weixing = List(15, 65, 12, 35, 15, 32)
    val ints1 = weixing.filter(x => if (x > 35) true else false)
    println(ints1)
    //计数
    val i = weixing.count(x => if (x > 32) true else false)
    println(i)
    //可变长度
    var listi = ListBuffer[String]("789")
    listi.append("15", "ewqe")
    listi+=("123")//结尾加
    listi.+=:("dadsda")//开头加
    println(listi)
  }
}

object set_next{
  def main(args: Array[String]): Unit = {

  }
}