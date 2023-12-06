
fun main() {
    while (true) {
        println("원하는 항목을 선택해 주세요")
        println("[1] 더하기")
        println("[2] 빼기")
        println("[3] 곱하기")
        println("[4] 나누기")
        println("[5] 종료")

        val selectCalc :Int = readLine()!!.toInt()
        when (selectCalc) {
            1 -> {
                println("첫번째 숫자를 입력해 주세요.")
                var num1 :Double = readLine()!!.toDouble()
                println("두번째 숫자를 입력해 주세요.")
                var num2 :Double = readLine()!!.toDouble()
                var selectAdd = AddOperation(num1,num2)
                selectAdd.operatingCalc(num1,num2)

            }

            2 -> {
                println("첫번째 숫자를 입력해 주세요.")
                val num1 :Double = readLine()!!.toDouble()
                println("두번째 숫자를 입력해 주세요.")
                val num2 :Double = readLine()!!.toDouble()
                var selectSub = SubstractOperation(num1,num2)
                selectSub.operatingCalc(num1,num2)

            }

            3 -> {
                println("첫번째 숫자를 입력해 주세요.")
                var num1 :Double = readLine()!!.toDouble()
                println("두번째 숫자를 입력해 주세요.")
                var num2 :Double = readLine()!!.toDouble()
                var selectMulti = MultiplyOperation(num1,num2)
                selectMulti.operatingCalc(num1,num2)
            }

            4 -> {
                println("첫번째 숫자를 입력해 주세요.")
                var num1 :Double = readLine()!!.toDouble()
                println("두번째 숫자를 입력해 주세요.")
                var num2 :Double = readLine()!!.toDouble()
                var selectDiv  = DivideOperation(num1, num2)
                selectDiv.operatingCalc(num1,num2)
            }

            5 -> {
                println("계산기를 종료합니다.")
                break
            }

            else -> {
                println("항목을 다시 선택해 주시기 바랍니다.")
                continue
            }

        }
    }
}
