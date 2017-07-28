package 集合和函数操作符
//生产操作符

fun main(args: Array<String>){
    val list = listOf(1,2,3,4,5,6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    print(" list is " +  list + "\n")
    print(" listRepeated is " +  listRepeated + "\n")

//    print(" list.merge(listRepeated) { it1, it2 -> it1 + it2 } is " +  list.merge(listRepeated) { it1, it2 -> it1 + it2 } + "\n")
    print(" list.partition { it % 2 == 0 } is " +  list.partition { it % 2 == 0 } + "\n")
    print(" list + listOf(7, 8) is " +  list + listOf(7, 8) + "\n")
    print(" list.zip(listOf(7, 8)) is " +  list.zip(listOf(7, 8)) + "\n")
    print(" listOf(Pair(5, 7), Pair(6, 8)).unzip() is " +  listOf(Pair(5, 7), Pair(6, 8)).unzip() + "\n")




}