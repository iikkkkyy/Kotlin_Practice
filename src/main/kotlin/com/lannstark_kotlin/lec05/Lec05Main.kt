package com.lannstark_kotlin.lec05

fun valid(score : Int){
    if (score< 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없음")
    }
}

fun getGrade(score : Int) : String {
//    if (score >= 90) {
//        return "A";
//    } else if (score >= 80) {
//        return "B";
//    } else if (score >= 70) {
//        return "C";
//    } else {
//        return "D";
//
//    }
    // In java
    if (0 >= score && score <= 100)
        println("?")
    // In Kotlin 범위를 0..100 이런식으로 사용 가능!!
    if (score in 0..100)
        println("!")

    // Kotlin에서는 switch문이 사라짐
    when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "0"

    }
    when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "0"

    }


    // 코틀린에서는 이런식으로 가능
//    return if (score >= 90) {
//        "A"
//    } else if (score >= 80) {
//        "B"
//    } else if (score >= 70) {
//        "C"
//    } else {
//        "D"
//    }
}