package 集合和函数操作符
//元素操作符

fun main(args: Array<String>){
    val list = listOf(1,2,3,4,5,6)
    print(" list is " +  list + "\n")

    print(" list.contains(2) is " +  list.contains(2) + "\n")
    print(" list.elementAt(1) is " +  list.elementAt(1) + "\n")
    print(" list.elementAtOrElse(10, { 2 * it }) is " +  list.elementAtOrElse(10, { 2 * it }) + "\n")
    print(" list.elementAtOrNull(10) is " +  list.elementAtOrNull(10) + "\n")
    print(" list.first { it % 2 == 0 } is " +  list.first { it % 2 == 0 } + "\n")
    print(" list.firstOrNull { it % 7 == 0 } is " +  list.firstOrNull { it % 7 == 0 } + "\n")
    print(" list.indexOf(4) is " +  list.indexOf(4) + "\n")
    print(" list.indexOfLast { it % 2 == 0 } is " +  list.indexOfLast { it % 2 == 0 } + "\n")
    print(" list.last { it % 2 == 0 } is " +  list.last { it % 2 == 0 } + "\n")
    print(" list.lastIndexOf(6) is " +  list.lastIndexOf(6) + "\n")
    print(" list.lastOrNull { it % 7 == 0 } is " +  list.lastOrNull { it % 7 == 0 } + "\n")
    print(" list.single { it % 5 == 0 } is " +  list.single { it % 5 == 0 } + "\n")
//    print(" list.single { it % 2 == 0 } is " +  list.single { it % 2 == 0 } + "\n")
    print(" list.singleOrNull { it % 7 == 0 } is " +  list.singleOrNull { it % 7 == 0 } + "\n")





}