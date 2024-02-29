package scala_lxh.string

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Set

object all {
  def str(): Unit = {
    var weixing = "weixingweixng"
    println(weixing == "weiXingweixng")
    println(weixing.equals("weixingweixng")) //比较字符串
    println(weixing.equalsIgnoreCase("weiXingweixng")) //忽略大小写比较

    println(weixing.indexOf("w")) //根据索引找到第一个出现的字符下标

    var str = new StringBuilder()
    str.append("dasddad")
    str + 'e'
    println(str)
  }

  def listgo(): Unit = {
    var ls = List(1, 2, 3, 5, 4, 6, 5, 4, 1)
    var ls1 = List(1, 2, 3, 4, 6, 5, 4, 1)
    ls.foreach(println)
    println(ls.equals(ls1))
    var weixng = ls.filter(x => x > 10) //过滤
    var con = ls.count(x => x > 3) //统计
    println(weixng)
    println(con)
    var w = ls.map(x => {
      x * 2
    }) //map和fialmap差不多只是fialmap有压平的作用
    println(w)

    //可变长度
    var we = ListBuffer(1, 2, 3)
    we.append(1, 2, 3)
    we += (10)
    we.+=:(10)
    println(we)
  }

  def setgo(): Unit = {
    //自动去重
    var set = Set(1, 2, 3, 5, 4, 4, 4, 4, 4)
    set.foreach(println)
    println(set.toList) //可以转换成多种类型
    println(set.mkString("/")) //在每个数字前插入/
    //可变长度
    set.add(123)
    set.+=(4567)
    println(set)
  }

  def mapgo(): Unit = {
    val map = Map("NAME" -> 12, "AGE" -> 123456)
    val map1 = Map("NAM" -> "LXH", "AG" -> 123456)
    map.foreach(x => println(x._1))
    map.foreach(x => println(x._2))
    println(map.keys) //获得全部key
    println(map.values) //获得全部值
    println(map.get("NAME").getOrElse())
    println(map.getOrElse("NAME", "123456789")) //按key获得值没有就返回默认值
    println(map ++ map1) //合并

    //判断是否有存在的key
    println(map.contains("NAME"))
    map.filter(x => {
      //过滤
      if (x._2 > 20)
        true
      else
        false
    })
  }

  def main(args: Array[String]): Unit = {
    //    str()
    //    listgo()
    //    setgo()
    //    mapgo()
    //    gotuple
  }

}
