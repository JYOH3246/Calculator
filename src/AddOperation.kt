import kotlin.math.roundToInt

class AddOperation(override var num1:Double, override var num2:Double) : AbstractOperation() {
    var resultAdd : Double = num1+num2

    init {
        this.resultAdd = resultAdd
    }
    override fun operatingCalc (num1:Double,num2: Double) {
        if (num1*10%10== 0.toDouble()&&num2*10%10== 0.toDouble()){
            println("${num1.roundToInt()} + ${num2.roundToInt()} = ${resultAdd.roundToInt()}")
        }
        else if (num1*10%10== 0.toDouble()){
            println("${num1.roundToInt()} + ${num2} = ${resultAdd}")
        }
        else if (num2*10%10== 0.toDouble()){
            println("${num1} + ${num2.roundToInt()} = ${resultAdd}")
        }
        else if (resultAdd*10%10==0.toDouble()) {
            println("${num1} + ${num2} = ${resultAdd.roundToInt()}")
        }
        else {
            println("${num1} + ${num2} = ${resultAdd}")
        }

    }

}