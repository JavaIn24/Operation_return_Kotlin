package Task1
fun main () {
    val array = arrayOf(2,1,5,3,8,2,5,1,7,3,6)
    localMin(array)
}

fun localMin (array: Array<Int>) : Int {
    var j = 0
    for (i in array.indices) {
        if (i == 0) {
            if (array[0] < array[1] && array[0] < array[array.size - 1]) {
                j += 1
            }
        }
        if (i > 0) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                j += 1

            }
        }

    }
    if (j == 0){
        println("В массиве отсутствуют локальные миннимумы")
    } else {
        println("В массиве присутствуют локаьные миннимумы и их количество равно $j")
    }
   return  j
}

