class AddOperation(num1:Double,num2:Double) : Calculator(num1,num2) {
    var resultAdd : Double = num1+num2

    init {
        this.resultAdd = resultAdd
    }
    override fun operatingCalc () {
        println("${num1} - ${num2} = ${resultAdd}")
    }

}