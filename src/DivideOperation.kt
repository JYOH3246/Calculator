import kotlin.math.roundToInt

//추상 클래스 AbstractOperation 상속 , Abstract 내 변수 오버라이딩
class DivideOperation(override var num1: Double, override var num2: Double) : AbstractOperation() {
    private var resultDiv: Double = num1 / num2

    // 가능한 패턴이 하나밖에 없으므로 주 생성자 사용
    init {
        this.resultDiv = resultDiv
    }

    // AbstractOperation 내 operatingCalculation() 메소드 오버라이딩
    override fun operatingCalculation(num1: Double, num2: Double) {
        //조건1 : num1과 num2의 input값이 예를 들면 3.0 , 4.0인 경우(num1과 num2가 정수인 경우)
        if (num1 * 10 % 10 == 0.toDouble() && num2 * 10 % 10 == 0.toDouble()) {
            // 내부조건1 : 나눗셈의 결과가 정수인 경우
            if (resultDiv * 10 % 10 == 0.toDouble()) {
                println("${num1.roundToInt()} / ${num2.roundToInt()} = ${resultDiv.roundToInt()}")
            } else {// 내부조건2 : 나눗셈의 결과가 실수인 경우
                println("${num1.roundToInt()} / ${num2.roundToInt()} = ${resultDiv}")
            }
        }
        // 조건2 : num1의 input값이 예를 들면 3.0인경우(num1만 정수인 경우)
        else if (num1 * 10 % 10 == 0.toDouble()) {
            // 내부조건1 : 나눗셈의 결과가 정수인 경우
            if (resultDiv * 10 % 10 == 0.toDouble()) {
                println("${num1.roundToInt()} / ${num2} = ${resultDiv.roundToInt()}")
            }
            // 내부조건2 : 나눗셈의 결과가 실수인 경우
            else {
                println("${num1.roundToInt()} / ${num2} = ${resultDiv}")
            }
        }
        // 조건3 : num2의 input값이 예를 들면 3.0인경우(num2만 정수인 경우)
        else if (num2 * 10 % 10 == 0.toDouble()) {
            // 내부조건1 : 나눗셈의 결과가 정수인 경우
            if (resultDiv * 10 % 10 == 0.toDouble()) {
                println("${num1} / ${num2.roundToInt()} = ${resultDiv.roundToInt()}")
            }
            // 내부조건2 : 나눗셈의 결과가 실수인 경우
            else {
                println("${num1} / ${num2.roundToInt()} = ${resultDiv}")
            }
        }
        // 조건4 : num1과 num2가 모두 실수인 경우
        else {
            // 내부조건1 : 나눗셈의 결과가 정수인 경우
            if (resultDiv * 10 % 10 == 0.toDouble()) {
                println("${num1} / ${num2} = ${resultDiv.roundToInt()}")
            }
            // 내부조건2 : 나눗셈의 결과가 실수인 경우
            else {
                println("${num1} / ${num2} = ${resultDiv}")
            }

        }

    }
}