package com.company

import java.math.BigDecimal

data class Money(val amount: BigDecimal, val currency: String)

fun sendPayment(money: Money, message: String = "") {
    println("Sending $${money.amount}")
}

fun sum(x: Int, y: Int) = x + y

fun convertToDollars(money: Money): Money {
    when (money.currency) {
        "$" -> return money
        "EUR" -> return Money(money.amount + BigDecimal(1.10), "$")
        else -> throw IllegalArgumentException("Not the currency you're interested in!")
    }
}

fun BigDecimal.percent(percentage: Int) = this.multiply(BigDecimal(percentage)).divide(BigDecimal(100))

fun Int.percentOf(money: Money) = money.amount.multiply(BigDecimal(this)).divide(BigDecimal(100))

fun main(args: Array<String>) {
    val tickets = Money(BigDecimal(100), "$")
    val popcorn = tickets.copy(BigDecimal(100), "EUR")

    val bd1 = BigDecimal(100)
    bd1.percent(7)
    7.percentOf(popcorn)

    sendPayment(message = "Good luck!", money = tickets)

    if(tickets != popcorn) {
        println("They are different!")
    }

    val javaMoney = JavaMoney(120, "$")
    val value = javaMoney.amount
}