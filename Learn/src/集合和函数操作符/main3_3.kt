package 集合和函数操作符
//映射操作符

fun main(args: Array<String>){
    val list = listOf(1,2,3,4,5,6)
    print(" list is " +  list + "\n")


    print(" list.flatMap { listOf(it, it + 1) } is " +  list.flatMap { listOf(it, it + 1) } + "\n")
    print(" list.groupBy { if (it % 2 == 0) \"even\" else \"odd\" } is  " +  list.groupBy { if (it % 2 == 0) "even" else "odd" } + "\n")
    print(" list.map { it * 2 } is  " +  list.map { it * 2 } + "\n")
    print(" list.mapIndexed { index, it -> index * it } is  " +  list.mapIndexed { index, it -> index * it } + "\n")
    print(" list.mapNotNull { it * 2 } is  " +  list.mapNotNull { it * 2 } + "\n")



}