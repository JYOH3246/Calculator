open class Calculator(_num1:Float, _num2:Float) {
    var num1 :Float
    var num2 :Float


    init {
        num1 = _num1
        num2 = _num2

    }
    open fun operatingCalc () {
        println("${num1}과 ${num2}를")
    }


}

