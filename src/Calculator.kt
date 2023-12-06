open class Calculationulator(_num1:Double, _num2:Double) {
    var num1 :Double
    var num2 :Double


    init {
        num1 = _num1
        num2 = _num2

    }
    open fun operatingCalculationulaton () {
        println("${num1}과 ${num2}를")
    }


}

