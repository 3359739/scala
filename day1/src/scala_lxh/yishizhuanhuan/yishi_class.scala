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
    var ww= println("您好！我是XXX宿舍的一名学生，我写这封检讨书是因为近期在宿舍打麻将的行为上给您及宿舍其他成员带来了不安与烦恼。我对我的行为深感后悔，我为自己的错误付出高昂的代价，并且愿意为此承担责任和接受相应的处罚。\n\n我深刻认识到打麻将不仅是一种违反宿舍规定的行为，更是一种对自己与他人的不尊重。我应该意识到麻将游戏可能会导致噪音扰民、造成不良的风气、浪费时间和金钱资源等问题。而且，宿舍是学习的地方，我们应该相互尊重和配合，共同创造一个良好的学习环境。对于我个人而言，麻将游戏只是一时的娱乐，但却给宿舍其他成员的学习和休息带来了不利影响，我对此深感抱歉。\n\n为了弥补自己的错误，我决定采取以下行动：\n\n停止在宿舍打麻将：作为一名宿舍成员，我将严守宿舍规定，不再参与任何破坏性的活动。我将全力以赴地专注于学习和个人发展，为宿舍创造一个更好的学习环境。\n\n积极参与宿舍公共事务：我将积极参与宿舍的公共事务，为宿舍的卫生、安全和秩序做出贡献。我将主动参与宿舍的活动和会议，与宿舍其他成员进行沟通和合作，加深宿舍成员间的友谊和团结。\n\n参与宿舍规章制度宣传：我将主动参与宿舍规章制度的宣传工作，鼓励宿舍成员对规章制度的遵守和尊重。我将承担起向其他同学解释宿舍规定的责任，让大家认识到规章制度的重要性和它对我们共同利益的意义。\n\n我要向宿舍管理处和宿舍其他成员表达我的真诚歉意，并对我违反规定带来的不便表示最深的道歉。我深知，通过这次错误和反思，我将更加坚定自己遵守规章制度的决心，养成良好的行为习惯，并以这次经历为教训，引以为戒。\n\n再次表示我对我的错误感到非常后悔，并愿意承担相应的处罚。我保证以后不会再出现类似的情况，并将努力改正自己的不良行为。\n\n最后，再次向您和宿舍管理处表示最深的歉意！".length)
  }
}
