package version1

import scala.language.higherKinds

object Runner extends App {

  val 柴1 = 没有铁的锅.value.加铁(new 热透的铁(1).初始化.初始化.初始化).加铁(new 热透的铁(2).初始化.初始化).加铁(new 热透的铁(3).初始化.初始化).加铁(new 热透的铁(4).初始化)

  val 柴2                                                            = 柴1.武火
  val a2: 没有铁的锅#加铁[热透的铁#初始化#初始化]#加铁[热透的铁#初始化]#加铁[热透的铁#初始化]#加铁[热透的铁] = 柴2: 柴1.武火
  println("==============================")
  val 柴3                                                = 柴2.武火
  val a3: 没有铁的锅#加铁[热透的铁#初始化]#加铁[热透的铁]#加铁[热透的铁]#加铁[热透的铁] = 柴3: 柴2.武火
  println("==============================")

  val 柴4                                            = 柴3.武火
  val a4: 没有铁的锅#加铁[热透的铁]#加铁[热透的铁]#加铁[热透的铁]#加铁[热透的铁] = 柴4: 柴3.武火
  println("==============================")

  val 柴5                                            = 柴4.武火
  val a5: 没有铁的锅#加铁[热透的铁]#加铁[热透的铁]#加铁[热透的铁]#加铁[热透的铁] = 柴5: 柴4.武火

  println("==============================")
  val 柴6                                            = 柴5.武火
  val a6: 没有铁的锅#加铁[热透的铁]#加铁[热透的铁]#加铁[热透的铁]#加铁[热透的铁] = 柴6: 柴5.武火

}
