package com.dnsfrolov.pocketdictionary.data.model

import io.realm.RealmModel

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class Word(val id: Int,
		   val word: String,
		   val transcription: String?,
		   val translation: String,
		   val examples: List<WordExample>?) : RealmModel