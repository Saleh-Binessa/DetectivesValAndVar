package com.example.detectivesvalandvar

fun main() {
    println("Welcome, detective! A mystery awaits your expertise...")

    val suspiciousEvidence = "The butler did it."
    println("Initial evidence: $suspiciousEvidence")

    val reliableAccount = "The first alibi holds true."
    println("Reliable account: $reliableAccount")

    println("Your task, detective: Ensure the evidence remains untampered with.")
    println("Find the correct keyword to make the evidence immutable (unchangeable).")

    if (isEvidenceSecure(suspiciousEvidence)) {
        println("Congratulations, detective! You've preserved the integrity of the evidence.")
        println("The truth prevails!")
    } else {
        println("The evidence remains vulnerable to manipulation.")
        println("Keep investigating, detective!")
    }
}

    fun isEvidenceSecure(suspiciousEvidence: String): Boolean {
    return true;
}