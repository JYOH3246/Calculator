class MultiplyOperation (num1:Float,num2:Float) : Calculator(num1,num2) {
    var resultMulti : Float = num1*num2
    init {
        this.resultMulti = resultMulti
    }
    override fun operatingCalc () {
        println("${num1} * ${num2} = ${resultMulti}")
    }
}