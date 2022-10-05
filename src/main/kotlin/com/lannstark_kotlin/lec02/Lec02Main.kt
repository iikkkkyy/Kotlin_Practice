package com.lannstark_kotlin.lec02

fun main() {

    // ?: => Elvis 연산자 (앞의 들어간 값이 null이면 뒤에 들어간 값 사용)
    val str: String? = null
    println(str?.length ?: 0)
}


// null 값이 들어갈 때 Exception 던지기 (null값 반환 안됨)
fun startsWithA1(str: String?): Boolean {

    // Kotlin스러운 코드
    return str?.startsWith("A") ?: throw IllegalArgumentException("null값!!!")

    /* Java스러운 코드?
    if (str==null){
        throw IllegalArgumentException("null값!!!")
    }
    return str.startsWith("A")

    */
}

// null값이 들어가면 return으로 null 값 주기
fun startsWithA2(str: String?): Boolean? {
    if(str == null) {
        return null
    }
    return str.startsWith("A")
}

// null값이 들어가면 false로 간주
fun startsWithA3(str: String?): Boolean {
    if(str ==null){
        return false
    }
    return str.startsWith("A")
}