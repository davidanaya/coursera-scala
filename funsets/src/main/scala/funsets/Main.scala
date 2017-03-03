package funsets

object Main extends App {
  import FunSets._

  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  val s = union(union(s1, s2), s3)
  val t = union(s1, s3)

  println(contains(singletonSet(1), 1))
  println(forall(s, (x: Int) => x % 2 != 0))
  println(forall(s1, (x: Int) => x % 2 != 0))
}
