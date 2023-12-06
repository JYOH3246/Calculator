fun main() {
    // 무한루프 : 종료를 선택해야 프로그램이 끝남
    while (true) {
        // UI 출력
        println("========================================================================================")
        println("원하는 항목을 선택해 주세요")
        println("[1] 더하기")
        println("[2] 빼기")
        println("[3] 곱하기")
        println("[4] 나누기")
        println("[5] 종료")
        println("========================================================================================")
        println("입력 시에는 숫자만 입력해 주시기 바랍니다.")
        // 원하는 항목을 입력받는 Input
        val selectCalculation: Int // 선언부 : 선언만 먼저 하고 값은 다른 지점에서 주는 것도 가능
        // try : try문 안에는 예외가 발생하는 지점이 들어가야 한다. 그 지점이 들어가지 않으면 예외가 계속 발생함
        try {
            selectCalculation= readLine()!!.toInt()  // 여기서 세팅을
        }
        // catch : java.lang.NumberFormatException 예외를 처리. 예외처리 후에 UI 출력 지점으로 이동
        catch (e:java.lang.NumberFormatException){
            println("숫자를 입력해 주시기 바랍니다.")
            continue
        }

        // 조건 : input에 값을 입력했을 때
        when (selectCalculation) {
            // selectCalculation에 1이 들어왔을 때
            1 -> {
                println("덧셈입니다..")
                println("첫번째 숫자를 입력해 주세요.")
                var num1: Double = readLine()!!.toDouble()
                println("두번째 숫자를 입력해 주세요.")
                var num2: Double = readLine()!!.toDouble()
                // AddOperation 클래스를 참조
                var selectAdd = AddOperation(num1, num2)
                // 변수를 추상화했기 때문에, 추상화 전과 다르게 변수를 명시
                selectAdd.operatingCalculation(num1, num2)

            }
            // selectCalculation에 2가 들어왔을 때
            2 -> {
                println("뺄셈입니다..")
                println("첫번째 숫자를 입력해 주세요.")
                val num1: Double = readLine()!!.toDouble()
                println("두번째 숫자를 입력해 주세요.")
                val num2: Double = readLine()!!.toDouble()
                // SubstractOperation 클래스를 참조
                var selectSub = SubstractOperation(num1, num2)
                // 변수를 추상화했기 때문에, 추상화 전과 다르게 변수를 명시
                selectSub.operatingCalculation(num1, num2)

            }
            // selectCalculation에 3이 들어왔을 때
            3 -> {
                println("곱셈입니다..")
                println("첫번째 숫자를 입력해 주세요.")
                var num1: Double = readLine()!!.toDouble()
                println("두번째 숫자를 입력해 주세요.")
                var num2: Double = readLine()!!.toDouble()
                // MultiplyOperation 클래스를 참조
                var selectMulti = MultiplyOperation(num1, num2)
                // 변수를 추상화했기 때문에, 추상화 전과 다르게 변수를 명시
                selectMulti.operatingCalculation(num1, num2)
            }
            // selectCalculation에 4가 들어왔을 때
            4 -> {
                println("나눗셈입니다..")
                println("첫번째 숫자를 입력해 주세요.")
                var num1: Double = readLine()!!.toDouble()
                println("두번째 숫자를 입력해 주세요.")
                var num2: Double = readLine()!!.toDouble()
                // DivideOperation 클래스를 참조
                var selectDiv = DivideOperation(num1, num2)
                // 변수를 추상화했기 때문에, 추상화 전과 다르게 변수를 명시
                selectDiv.operatingCalculation(num1, num2)
            }
            // selectCalculation에 5가 들어왔을 때
            5 -> {
                println("계산기를 종료합니다.")
                break
            }
            // selectCalculation에 다른 값이 들어왔을 때
            // 예외처리를 해서 selectCalculation에 Int가 아닌 다른 자료형이 들어왔을 때
            // "숫자만 입력해 주세요." 를 출력해주고 싶다.
            else -> {
                println("1~5 사이의 숫자를 입력해 주세요.")

            }

        }
    }
}
