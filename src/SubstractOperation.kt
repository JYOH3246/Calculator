class SubstractOperation(num1:Double,num2:Double) : Calculator(num1,num2) {
    var resultSub : Double = num1-num2
    init {
        this.resultSub = resultSub
    }
    override fun operatingCalc () {
        println("${num1} - ${num2} = ${resultSub}")
    }
}