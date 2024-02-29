package scala_lxh

object ll {
  def main(args: Array[String]): Unit = {
     var wi=Array("ddd 大数据1班","大数据1班","大数据2班","大数据1班")
    //进行切分
    println(wi.count(x => {
       if (x.substring(x.length-5).equals("大数据1班"))
         true
       else
         false
    }))
  }
}
