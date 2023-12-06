class MultiplyOperation (override var num1:Double,override var num2:Double) : AbstractOperation(){
    var resultMulti : Double = num1*num2
    init {
        this.resultMulti = resultMulti
    }
    override fun operatingCalc (num1:Double,num2: Double) {
        println("${num1} * ${num2} = ${resultMulti}")
    }
}