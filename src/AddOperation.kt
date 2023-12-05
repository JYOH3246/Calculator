class AddOperation {
    val num1 :Int = readLine()!!.toInt()
    val num2 :Int = readLine()!!.toInt()
    val resultAdd :Int = num1 + num2

    constructor(_num1 :Int,_num2 :Int,_resultAdd :Int) {
        println("${num1}+${num2} 는 ${resultAdd}입니다.")
    }

}