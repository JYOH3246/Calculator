class AddOperation(num1:Float,num2:Float) : Calculator(num1,num2) {
    var resultAdd : Float = num1+num2

    init {
        this.resultAdd = resultAdd
    }
    override fun operatingCalc () {
        println("${num1} - ${num2} = ${resultAdd}")
    }

}