package com.lannstark_kotlin.lec01


fun main() {

    // 가변 변수 선언할때 var
    var number1 : Long = 10L

    // 불변 변수 선언할때 val
    val number2 : Long = 20L

    // :Long은 쓰지 않아도 됨

    // ? : nullable
    var number3 : Long? = 1_000L
    number3 = null

    // Kotlin에서 객체 인스턴스화를 할 때에는 new를 붙이지 않아야 한다
    var person = Person("김강태")
}
