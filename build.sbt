UbwSettings.scalaVersionSettings

addCommandAlias("fmt", "all scalafmtSbt")

val rootDir = file(".")

val file_a01 = rootDir / "a01-整数加法"
val a01_1    = project in (file_a01 / "错误代码1")
val a01_2    = project in (file_a01 / "正确代码1")
val a01_3    = project in (file_a01 / "改进代码1")
val a02      = project in (rootDir / "a02-二进制后继")

val file_a03   = rootDir / "a03-十进制后继"
val a03Codegen = project in (file_a03 / "a03-codegen")
val a03        = project in (file_a03 / "a03-core")

val file_a04   = rootDir / "a04-进制后续"
val a04Codegen = project in (file_a04 / "a04-codegen")
val a04Core01  = project in (file_a04 / "a04-core-01")

val a05 = project in (rootDir / "a05-后悔药")

val file_a06 = rootDir / "a06-倾诉"
val a06_1    = project in (file_a06 / "错误代码1")
val a06_2    = project in (file_a06 / "正确代码1")
val a06_3    = project in (file_a06 / "更正代码1")

val file_a07 = rootDir / "a07-消融"
val a07_1    = project in (file_a07 / "错误代码1")
val a07_2    = project in (file_a07 / "修正代码1")

val a08 = project in (rootDir / "a08-整数加法")
val a09 = project in (rootDir / "a09-改变")
val a10 = project in (rootDir / "a10-自然数乘法")
val a11 = project in (rootDir / "a11-自然数提取")
val a12 = project in (rootDir / "a12-进制提取")
val a13 = project in (rootDir / "a13-加减乘除")
val a14 = project in (rootDir / "a14-魔王勇者")
val a15 = project in (rootDir / "a15-小测试")
val a16 = project in (rootDir / "a16-口")
val a17 = project in (rootDir / "a17-432")
val a18 = project in (rootDir / "a18-万事开头难")
val a19 = project in (rootDir / "a19-一二三")
val a20 = project in (rootDir / "a20-月盈月亏")
val a21 = project in (rootDir / "a21-叹茶")
val a23 = project in (rootDir / "a23-突破")
val a24 = project in (rootDir / "a24-五法")
val a25 = project in (rootDir / "a25-两种乘法")
val a26 = project in (rootDir / "a26-两种指数")
val a27 = project in (rootDir / "a27-减法运行时")
val a28 = project in (rootDir / "a28-练习")
val a29 = project in (rootDir / "a29-特质线性化")
val a30 = project in (rootDir / "a30-除法")
val a31 = project in (rootDir / "a31-整数")
val a32 = project in (rootDir / "a32-减法")
val a33 = project in (rootDir / "a33-对数")
val a34 = project in (rootDir / "a34-咪")
val a35 = project in (rootDir / "a35-碧波千秋")
val a36 = project in (rootDir / "a36-快乐智多星")
val a37 = project in (rootDir / "a37-双子座")
val a38 = project in (rootDir / "a38-Number1")
val a39 = project in (rootDir / "a39-双头龙")
val a40 = project in (rootDir / "a40-感应天地")
val a41 = project in (rootDir / "a41-进制")
val a42 = project in (rootDir / "a42-stream")
