class SubstractOperation(num1:Float,num2:Float) : Calculator(num1,num2) {
    var resultSub : Float = num1-num2
    init {
        this.resultSub = resultSub
    }
    override fun operatingCalc () {
        println("${num1} - ${num2} = ${resultSub}")
    }
}