package com.lannstark_kotlin.lec04

import com.lannstark.lec04.JavaMoney

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    if (money1 > money2){
        println("Money1이 Money2 보다 큼")
    }
    // Java에서는 동일성에 ==을 사용, 동등성에 equals를 직접 호출
    // Kotlin에서는 동일성에 ===를 사용 동등성에 ==을 호출 (간접적으로 equals를 호출해 준다)
    println(money1 === money2)
    // 논리연산자 && || ! 는 JAVA=COTLIN 완전 동일
    // in / !in : 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다
    // a..b : a부터 b까지의 범위 객체를 생성한다
}