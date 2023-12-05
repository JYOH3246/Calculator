class DivideOperation (num1:Float,num2:Float) : Calculator(num1,num2) {
    var resultDiv : Float = num1/num2
    init {
        this.resultDiv = resultDiv
    }
    override fun operatingCalc () {
        println("${num1} / ${num2} = ${resultDiv}")
    }
}