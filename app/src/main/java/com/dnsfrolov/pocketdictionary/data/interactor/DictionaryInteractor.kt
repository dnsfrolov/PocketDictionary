package com.dnsfrolov.pocketdictionary.data.interactor

import com.dnsfrolov.pocketdictionary.data.model.Word

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
interface DictionaryInteractor {

	fun getDictionaryList(): List<Word>
}