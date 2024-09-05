package Task2
fun main (){
    val array = arrayOf(1,-3,-2,4,-1)
    plusOne(array)
}

fun plusOne (array: Array<Int>)  {
    for (i in array.indices){
        if (array[i] < 0){
            array[i] += 1

        }

    }
    print(array.contentToString())
}
