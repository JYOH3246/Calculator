class SubstractOperation(override var num1:Double,override var num2:Double) : AbstractOperation() {
    var resultSub : Double = num1-num2
    init {
        this.resultSub = resultSub
    }
    override fun operatingCalc (num1:Double,num2: Double) {
        println("${num1} - ${num2} = ${resultSub}")
    }
}