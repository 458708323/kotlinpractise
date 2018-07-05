/**
 * Description:
 *
 * @author zhaohui
 * @create 2018/7/5 下午7:45
 */

fun main(args: Array<String>) {
    println("hello word")
    var name = "grail"
    println("my name is ${name}")
    val v = "123"
    var sum = getSum("3",3);
    println(sum)
}

fun getSum(a: String = "123", b: Int): String = a + b