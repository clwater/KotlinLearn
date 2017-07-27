import kotlin.test.assertEquals
import kotlin.test.assertTrue

//总数操作符

fun main(args: Array<String>){
    val list = listOf(1,2,3,4,5,6)
    print("list.any { it % 2 == 0 } is " + list.any { it % 2 == 0 } + "\n")
    print("list.any { it > 10 } is " + list.any { it > 10 } + "\n")
    print("list.all { it < 10 } is " + list.all { it < 10 } + "\n")
    print("list.all { it % 2 == 0 } is " + list.all { it % 2 == 0 } + "\n")

    print("list.count { it % 2 == 0 } is " +  list.count { it % 2 == 0 }  + "\n")
    print("list.fold(4) { total, next -> total + next } is " + list.fold(0) { total, next -> total + next }  + "\n")
    print("list.foldRight(4) { total, next -> total + next } is " + list.foldRight(0) { total, next -> total + next }  + "\n")

    print("list.forEach { println(it) } strat \n======================= \n" )
    list.forEach { println(it) }
    print("=======================  \n list.forEach { println(it) } end  \n" )

    print("list.forEachIndexed strat \n======================= \n" )
    list.forEachIndexed { index, value -> println("position $index contains a $value") }
    print("=======================  \n list.forEachIndexed  \n" )

    print("list.max() is " + list.max() + "\n")
    print("list.maxBy() is " + list.maxBy{ -it} + "\n")
    print("list.min() is " + list.min() + "\n")
    print("list.minBy() is " + list.minBy{ -it} + "\n")

    print("list.none { it % 7 == 0 } is " + list.none { it % 7 == 0 } + "\n")

    print("list.reduce { total, next -> total + next } is " + list.reduce { total, next -> total + next } + "\n")
    print("list.reduceRight { total, next -> total + next } is " + list.reduceRight { total, next -> total + next } + "\n")

    print("list.sumBy { it % 2 } is " + list.sumBy { it % 2 } + "\n")
}
