package calc

import abst.AbstractOperation
import kotlin.math.roundToInt

class AddOperation() : AbstractOperation() {

    override fun operating(num1: Double, num2: Double) {
        val resultAdd : Double = (num1+num2)
        // 조건1 : num1과 num2의 input값이 예를 들면 3.0 , 4.0인 경우(num1과 num2가 정수인 경우)
        if (num1 * 10 % 10 == 0.toDouble() && num2 * 10 % 10 == 0.toDouble()) {
            println("${num1.roundToInt()} + ${num2.roundToInt()} = ${resultAdd.roundToInt()}")
        }
        // 조건2 : num1의 input값이 예를 들면 3.0인경우(num1만 정수인 경우)
        else if (num1 * 10 % 10 == 0.toDouble()) {
            println("${num1.roundToInt()} + ${num2} = ${resultAdd}")
        }
        // 조건3 : num2의 input값이 예를 들면 3.0인경우(num2만 정수인 경우)
        else if (num2 * 10 % 10 == 0.toDouble()) {
            println("${num1} + ${num2.roundToInt()} = ${resultAdd}")
        }
        // 조건4 : num1과 num2가 모두 실수인 경우
        else {
            // 내부조건1 : 덧셈의 결과가 정수인 경우
            if (resultAdd * 10 % 10 == 0.toDouble()) {
                println("${num1} + ${num2} = ${resultAdd.roundToInt()}")
            }
            // 내부조건2 : 덧셈의 결과가 실수인 경우
            else {
                println("${num1} + ${num2} = ${resultAdd}")
            }

        }
    }

}



