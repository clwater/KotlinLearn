
//过滤操作符

fun main(args: Array<String>){
    val list = listOf(1,2,3,4,5,6)

//    print(list)
    print(" list.drop(4) is " +  list.drop(4) + "\n")
    print(" list.dropWhile { it < 3 } is " +  list.dropWhile { it < 3 } + "\n")
    print(" list.dropLastWhile { it > 4 } is " +  list.dropLastWhile { it > 4 } + "\n")
    print(" list.ilter { it % 2 == 0 } is " +  list.filter { it % 2 == 0 } + "\n")


}