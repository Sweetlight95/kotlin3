//Find largest element in an array
fun main(){
    val numArray: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 20, 30, 39, 17)
    var largest = numArray[0]

    for (element in numArray) {
        if(largest < element){
            largest = element
}
    }
     println("$largest")
}

