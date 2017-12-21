package com.dnsfrolov.pocketdictionary.presentation.module.dictionary.detail

import com.dnsfrolov.gymtracker.app.base.mvp.BaseMvpContract
import com.dnsfrolov.pocketdictionary.data.model.Word

/**
 * project: PocketDictionary
 * date: 09.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
interface DictionaryDetailContract {

	interface View : BaseMvpContract.View {

		fun showWordDetails(word: Word?)
	}

	interface Presenter : BaseMvpContract.Presenter<View> {

		fun getWordDetails()
	}
}