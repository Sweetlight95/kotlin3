//calculate the average using Array
fun main() {
   val numArray = arrayOf(2, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15)
    var sum = 0

   for(element in numArray) {
     sum += element //addition of the values to total
   }
   
   val average = sum / numArray.size //the average of the value
   println("The average is: $average")
}