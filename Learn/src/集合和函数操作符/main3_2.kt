package 集合和函数操作符
//过滤操作符

fun main(args: Array<String>){
    val list = listOf(1,2,3,4,5,6)
    print(" list is " +  list + "\n")

//    print(list)
    print(" list.drop(4) is " +  list.drop(4) + "\n")
    print(" list.dropWhile { it < 3 } is " +  list.dropWhile { it < 3 } + "\n")
    print(" list.dropLastWhile { it > 4 } is " +  list.dropLastWhile { it > 4 } + "\n")
    print(" list.filter { it % 2 == 0 } is " +  list.filter { it % 2 == 0 } + "\n")
    print(" list.filterNot { it % 2 == 0 } is " +  list.filterNot { it % 2 == 0 } + "\n")
    print(" list.slice(listOf(1, 3, 4)) is " +  list.slice(listOf(1, 3, 4)) + "\n")
    print(" list.take(2) is " +  list.take(2) + "\n")
    print(" list.takeLast(2) is " +  list.takeLast(2) + "\n")
    print(" list.takeWhile { it < 3 } is " +  list.takeWhile { it < 3 } + "\n")


}