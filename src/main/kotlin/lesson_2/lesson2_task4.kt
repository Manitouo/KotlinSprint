package org.example.lesson_2

fun main() {
    val crystalMineral: Int = 7
    val ironMineral: Int = 11

    val percentageShare = STRATEGY_BUFF.toDouble() / 100
    val benefitCrystal = crystalMineral * percentageShare
    val benefitIron = ironMineral * percentageShare

    println(String.format("%.0f - кристаллической руды \"сверху\"", benefitCrystal))
    println(String.format("%.0f - железной руды \"сверху\"", benefitIron))

}

const val STRATEGY_BUFF = 20