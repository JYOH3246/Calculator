import kotlin.math.roundToInt

class DivideOperation (override var num1:Double, override var num2:Double) : AbstractOperation() {
    var resultDiv : Double = num1/num2
    init {
        this.resultDiv = resultDiv
    }
    override fun operatingCalc (num1:Double,num2: Double) {
        if (num1*10%10== 0.toDouble()&&num2*10%10== 0.toDouble()){
            if (resultDiv*10%10==0.toDouble()) {
                println("${num1.roundToInt()} / ${num2.roundToInt()} = ${resultDiv.roundToInt()}")
            }
            else {
                println("${num1.roundToInt()} / ${num2.roundToInt()} = ${resultDiv}")
            }

        }
        else if (num1*10%10== 0.toDouble()){
            if (resultDiv*10%10==0.toDouble()) {
                println("${num1.roundToInt()} / ${num2} = ${resultDiv.roundToInt()}")
            }
            else {
                println("${num1.roundToInt()} / ${num2} = ${resultDiv}")
            }
        }
        else if (num2*10%10== 0.toDouble()){
            if (resultDiv*10%10==0.toDouble()) {
                println("${num1} / ${num2.roundToInt()} = ${resultDiv.roundToInt()}")
            }
            else {
                println("${num1} / ${num2.roundToInt()} = ${resultDiv}")
            }
        }
        else {
            if (resultDiv*10%10==0.toDouble()) {
                println("${num1} / ${num2} = ${resultDiv.roundToInt()}")
            }
            else {
                println("${num1} / ${num2} = ${resultDiv}")
            }

        }

    }
}