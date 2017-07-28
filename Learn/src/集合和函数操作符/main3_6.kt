package 集合和函数操作符
//顺序操作符

fun main(args: Array<String>){
    val unsortedList = listOf(3, 2, 7, 5)
    print(" unsortedList is " +  unsortedList + "\n")
    print(" unsortedList.reverse() is " +  unsortedList.reversed() + "\n")
    print(" unsortedList.sort() is " +  unsortedList.sorted() + "\n")
    print(" unsortedList.sortBy { it % 3 } is " +  unsortedList.sortedBy { it % 3 } + "\n")
    print(" unsortedList.sortedDescending is " +  unsortedList.sortedDescending() + "\n")
    print(" unsortedList.sortDescendingBy { it % 3 } is " +  unsortedList.sortedByDescending { it % 3 } + "\n")



}