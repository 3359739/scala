package scala_lxh.fun_go

//相当python中定义函数 多了一个指定返回类型和一些特性要是不指定责为最后一个为返回值
/*
* def 变量名(参数){
      逻辑
     返回值
 }
 * */
//传值是 变量名：类型
//指定传值和默认值   调用函数(a=15)指点传给a 而不是按顺序  def weixing(name:String="235")这是设置name不传时为235字符串
object fun_on {
  def weixing() = {
      156
  }
  def main(args: Array[String]): Unit = {
    println(weixing())
  }
}
