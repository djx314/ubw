package a10

trait 自然数标记 {
  type Next <: 自然数标记
  type 自然数消去[T <: 自然数, I] <: 自然数对
  def next: Next
  def 自然数消去[T <: 自然数, I](item: T, i: I): 自然数消去[T, I]
}

class 自然数标记零 extends 自然数标记 {
  self =>
  override type Next               = 正整数标记[自然数标记零]
  override type 自然数消去[T <: 自然数, I] = 正整数自然数对[T, I]
  override def next: Next                                       = new 正整数标记(self)
  override def 自然数消去[T <: 自然数, I](item: T, i: I): 正整数自然数对[T, I] = new 正整数自然数对(self, new 正整数(tail = item, head = i))

  override def toString: String = "元素对自然数零"
}

object 自然数标记零 {
  val value: 自然数标记零 = new 自然数标记零
}

class 正整数标记[Tail <: 自然数标记](val tail: Tail) extends 自然数标记 {
  self =>
  override type Next               = 正整数标记[正整数标记[Tail]]
  override type 自然数消去[T <: 自然数, I] = T#消去标记[Tail]
  override def next: 正整数标记[正整数标记[Tail]]                        = new 正整数标记(tail = self)
  override def 自然数消去[T <: 自然数, I](item: T, i: I): T#消去标记[Tail] = item.消去标记(tail)

  override def toString: String = s"$tail :: 标记"
}
