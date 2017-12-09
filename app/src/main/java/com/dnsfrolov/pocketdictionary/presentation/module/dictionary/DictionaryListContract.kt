package com.dnsfrolov.pocketdictionary.presentation.module.dictionary

import com.dnsfrolov.gymtracker.app.base.mvp.BaseMvpContract
import com.dnsfrolov.pocketdictionary.data.model.Word

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
interface DictionaryListContract {

	interface View : BaseMvpContract.View {

		fun showWordList(dictionaryList: List<Word>)
	}

	interface Presenter : BaseMvpContract.Presenter<View> {

		fun getWordList()
	}
}