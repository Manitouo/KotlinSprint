package org.example.lesson_2

fun main() {
    val crystalMineral: Int = 7
    val ironMineral: Int = 11

    val benefitCrystal = crystalMineral * STRATEGY_BUFF
    val benefitIron = ironMineral * STRATEGY_BUFF

    println(String.format("%.0f - кристаллической руды \"сверху\"", benefitCrystal))
    println(String.format("%.0f - железной руды \"сверху\"", benefitIron))

}

const val STRATEGY_BUFF = 0.2