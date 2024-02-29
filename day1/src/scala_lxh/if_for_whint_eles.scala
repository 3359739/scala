package scala_lxh

object if_for_whint_eles {
  def if_lxh(): Unit = {
    if (11 > 15)
      print(123) //这里省略{}只有一行代码时可以省略
    else if (17 > 15)
      print(123456789)
    else
      print(456)
  }

  def for_andwhon_lxh(): Unit = {
    for (i <- 1 to 10; if i > 8; if i == 9) //_to_ 表示 _表示区间(包头包尾) 可以直接在后面跟上if判断
      print(i)
    while (true){
      print(123)
    }
  }
  def main(args: Array[String]): Unit = {
//    if_lxh()//if else if else
//    for_andwhon_lxh() //循环
  }
}

