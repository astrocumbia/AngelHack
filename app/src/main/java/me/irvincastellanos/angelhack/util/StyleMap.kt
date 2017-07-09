package me.irvincastellanos.angelhack.util

import android.content.Context
import me.irvincastellanos.angelhack.R

/**
 * Created by positr0nix on 7/8/17.
 */
class StyleMap {
    companion object {
        val CLASIC = "clasic"
        val COSPLAY = "cosplay"
        val HIPPIE = "hippie"
        val HIPSTER = "hipster"
        val LOLITA = "lolita"
        val ROCKER = "rocker"
        val SPORT = "sport"
        val VINTAGE = "vintage"
        val OFFICE = "office"

        val NIKE = "Nike"
        val GUESS = "Guess"
        var LEVIS = "Levis"
        var CK = "Calvin Klein"

        var LP = "Liverpool"
        val PLH = "Palacio de Hierro"
        var SEARS = "Sears"
        var ZARA = "Zara"

        fun getDrawable(type: String): Int {
            when {
                type.equals(CLASIC) -> return R.drawable.clasic
                type.equals(COSPLAY) -> return R.drawable.cosplay
                type.equals(HIPPIE) -> return R.drawable.hippie
                type.equals(HIPSTER) -> return R.drawable.hipster
                type.equals(LOLITA) -> return R.drawable.lolita
                type.equals(ROCKER) -> return R.drawable.rocker
                type.equals(SPORT) -> return R.drawable.sport
                type.equals(VINTAGE) -> return R.drawable.vintage
                type.equals(OFFICE) -> return R.drawable.office

                type.equals(NIKE) -> return R.drawable.ic_nike
                type.equals(GUESS) -> return R.drawable.ic_guess
                type.equals(LEVIS) -> return R.drawable.ic_levis
                type.equals(CK) -> return R.drawable.ic_ck

                type.equals(LP) -> return R.drawable.ic_liverpool
                type.equals(PLH) -> return R.drawable.ic_palacio_hierro
                type.equals(SEARS) -> return R.drawable.ic_sears
                type.equals(ZARA) -> return R.drawable.ic_zara
            }
            return R.drawable.clasic
        }
    }
}