class DivideOperation (override var num1:Double,override var num2:Double) : AbstractOperation() {
    var resultDiv : Double = num1/num2
    init {
        this.resultDiv = resultDiv
    }
    override fun operatingCalc (num1:Double,num2: Double) {
        println("${num1} / ${num2} = ${resultDiv}")
    }
}