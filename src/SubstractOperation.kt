import kotlin.math.roundToInt

class SubstractOperation(override var num1:Double, override var num2:Double) : AbstractOperation() {
    var resultSub : Double = num1-num2
    init {
        this.resultSub = resultSub
    }
    override fun operatingCalc (num1:Double,num2: Double) {
        if (num1*10%10== 0.toDouble()&&num2*10%10== 0.toDouble()){
            println("${num1.roundToInt()} - ${num2.roundToInt()} = ${resultSub.roundToInt()}")
        }
        else if (num1*10%10== 0.toDouble()){
            println("${num1.roundToInt()} - ${num2} = ${resultSub}")
        }
        else if (num2*10%10== 0.toDouble()){
            println("${num1} - ${num2.roundToInt()} = ${resultSub}")
        }
        else if (resultSub*10%10==0.toDouble()) {
            println("${num1} - ${num2} = ${resultSub.roundToInt()}")
        }
        else {
            println("${num1} - ${num2} = ${resultSub}")
        }

    }
}