package com.maks.warehouse.warehouse.domain

data class UserKt (private val name: String, private val surname: String) {
    fun fun1(vararg ints: Int) {
        println(ints)
    }

    fun fun2(vararg str: String) {
        println(str)
    }
}

fun String.isMaks(): Boolean = this == "Maks"

infix fun UserKt.eq(str: String) {

}

inline fun UserKt.doStuff(action: UserKt.() -> Unit) {
    action(this)
}

fun main() {
    val user = UserKt("maks", "kaczmarek")

    user.doStuff {
        fun1(1, 2, 3)
        fun2("1", "2", "3")
    }

    user eq "owefowefn"

    println("Maks".isMaks())
}