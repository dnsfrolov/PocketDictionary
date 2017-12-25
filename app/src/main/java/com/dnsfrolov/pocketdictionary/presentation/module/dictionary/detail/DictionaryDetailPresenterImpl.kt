package com.dnsfrolov.pocketdictionary.presentation.module.dictionary.detail

import com.dnsfrolov.gymtracker.app.base.mvp.BasePresenterImpl
import com.dnsfrolov.pocketdictionary.data.interactor.DictionaryInteractorImpl

/**
 * project: PocketDictionary
 * date: 09.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class DictionaryDetailPresenterImpl :
		BasePresenterImpl<DictionaryDetailContract.View>(),
		DictionaryDetailContract.Presenter {

	private val dictionaryInteractor = DictionaryInteractorImpl()

	override fun getWordDetails(wordId: Int) {
		view?.showWordDetails(dictionaryInteractor.getDictionaryList()[wordId])
	}
}