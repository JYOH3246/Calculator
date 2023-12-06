class AddOperation(override var num1:Double,override var num2:Double) : AbstractOperation() {
    var resultAdd : Double = num1+num2

    init {
        this.resultAdd = resultAdd
    }
    override fun operatingCalc (num1:Double,num2: Double) {
        println("${num1} + ${num2} = ${resultAdd}")
    }

}