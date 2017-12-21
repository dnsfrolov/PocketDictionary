package com.dnsfrolov.pocketdictionary.util

/**
 * project: PocketDictionary
 * date: 20.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */

object RomanNumeral {
	fun convertToRomanNumeral(number: Int): String {
		return when (number) {
			1 -> "I"
			2 -> "II"
			3 -> "III"
			4 -> "IV"
			5 -> "V"
			6 -> "VI"
			7 -> "VII"
			8 -> "VIII"
			9 -> "IX"
			10 -> "X"
			else -> "I"
		}
	}
}