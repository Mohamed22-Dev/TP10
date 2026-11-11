
package com.example.tp10

fun validerMotDePasse(motDePasse: String): Boolean {

    val longueurValide = motDePasse.length >= 8

    val majusculeValide = motDePasse.any {
        it.isUpperCase()
    }

    val chiffreValide = motDePasse.any {
        it.isDigit()
    }

    return longueurValide &&
            majusculeValide &&
            chiffreValide
}
