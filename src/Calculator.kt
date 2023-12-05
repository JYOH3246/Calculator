open class Calculator {
    var num1 :Float
    var num2 :Float


    constructor(_num1:Float, _num2:Float) {
        num1 = _num1
        num2 = _num2

    }
    open fun operatingCalc () {
        println("${num1}과 ${num2}를")
    }


}

