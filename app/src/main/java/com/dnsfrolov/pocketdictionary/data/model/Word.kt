package com.dnsfrolov.pocketdictionary.data.model

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class Word(val id: Long,
		   val word: String,
		   val translatedWord: String,
		   val examples: List<WordExample>)