package Task3

fun  main (){
val matrix = arrayOf(
    arrayOf(0,0,0,0,0),
    arrayOf(1,1,1,1,1),
    arrayOf(2,2,2,2,2),
    arrayOf(3,3,3,3)
)
    elementK(matrix,3)
}

fun elementK (matrix : Array<Array<Int>> , k : Int){
    for (i in matrix.indices){
        for (j in matrix[i].indices){
            if (i == k) {
                print("${matrix[i][j]} ")
            }
        }
    }
}