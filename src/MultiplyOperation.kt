class MultiplyOperation (num1:Double,num2:Double) : Calculator(num1,num2) {
    var resultMulti : Double = num1*num2
    init {
        this.resultMulti = resultMulti
    }
    override fun operatingCalc () {
        println("${num1} * ${num2} = ${resultMulti}")
    }
}