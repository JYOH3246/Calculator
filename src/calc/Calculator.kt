package calc

import abst.AbstractOperation

class Calculator(private val operation: AbstractOperation) {
    fun operate(num1:Double, num2:Double) {
        return operation.operating(num1, num2)
    }
}

