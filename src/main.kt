fun main() {
    while (true) {
        println("원하는 항목을 선택해 주세요")
        println("[1] 더하기")
        println("[2] 빼기")
        println("[3] 곱하기")
        println("[4] 몫 구하기")
        println("[5] 종료")

        val selectCalc :Int = readLine()!!.toInt()
        when (selectCalc) {
            1 -> {
                println("첫번째 숫자를 입력해 주세요.")
                val num1 :Int = readLine()!!.toInt()
                println("두번째 숫자를 입력해 주세요.")
                val num2 :Int = readLine()!!.toInt()
                val resultAdd :Int = num1 + num2
                println("${num1}+${num2} 는 ${resultAdd}입니다.")

            }

            2 -> {
                println("첫번째 숫자를 입력해 주세요.")
                val num1 :Int = readLine()!!.toInt()
                println("두번째 숫자를 입력해 주세요.")
                val num2 :Int = readLine()!!.toInt()
                val resultSub :Int = num1 - num2
                println("${num1}-${num2} 는 ${resultSub}입니다.")

            }

            3 -> {
                println("첫번째 숫자를 입력해 주세요.")
                val num1 :Int = readLine()!!.toInt()
                println("두번째 숫자를 입력해 주세요.")
                val num2 :Int = readLine()!!.toInt()
                val resulMulti :Int = num1 * num2
                println("${num1}*${num2} 는 ${resulMulti}입니다.")
            }

            4 -> {
                println("첫번째 숫자를 입력해 주세요.")
                val num1 :Int = readLine()!!.toInt()
                println("두번째 숫자를 입력해 주세요.")
                val num2 :Int = readLine()!!.toInt()
                val resultDiv :Int = num1 / num2
                println("${num1}/${num2} 의 몫은 ${resultDiv}입니다.")
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