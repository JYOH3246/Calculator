class DivideOperation (num1:Double,num2:Double) : Calculator(num1,num2) {
    var resultDiv : Double = num1/num2
    init {
        this.resultDiv = resultDiv
    }
    override fun operatingCalc () {
        println("${num1} / ${num2} = ${resultDiv}")
    }
}