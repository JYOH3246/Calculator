import kotlin.math.roundToInt

class MultiplyOperation (override var num1:Double, override var num2:Double) : AbstractOperation(){
    var resultMulti : Double = num1*num2
    init {
        this.resultMulti = resultMulti
    }
    override fun operatingCalc (num1:Double,num2: Double) {
        if (num1*10%10== 0.toDouble()&&num2*10%10== 0.toDouble()){
            println("${num1.roundToInt()} * ${num2.roundToInt()} = ${resultMulti.roundToInt()}")
        }
        else if (num1*10%10== 0.toDouble()){
            println("${num1.roundToInt()} * ${num2} = ${resultMulti}")
        }
        else if (num2*10%10== 0.toDouble()){
            println("${num1} * ${num2.roundToInt()} = ${resultMulti}")
        }
        else if (resultMulti*10%10==0.toDouble()) {
            println("${num1} * ${num2} = ${resultMulti.roundToInt()}")
        }
        else {
            println("${num1} * ${num2} = ${resultMulti}")
        }

    }
}