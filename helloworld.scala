object helloworld extends App {
  def helloarr(index: Int, arr: Array[String],doer: String => String ): Unit = {
    println(doer(arr(index)))
    if ( index < arr.length-1 ) helloarr(index+1, arr, doer)
  }
  def hello(s: String): String = {
    s
  }
  helloarr(0, Array("hello", "world"), hello)
}
