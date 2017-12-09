package com.dnsfrolov.pocketdictionary.presentation.module.dictionary.detail

import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.presentation.base.BaseMvpActivity

/**
 * project: PocketDictionary
 * date: 09.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class DictionaryDetailActivity :
		BaseMvpActivity<DictionaryDetailContract.View, DictionaryDetailPresenterImpl>(),
		DictionaryDetailContract.View {

	override fun getContentView(): Int {
		return R.layout.activity_dictionary_detail
	}

	override fun providePresenter(): DictionaryDetailPresenterImpl {
		return DictionaryDetailPresenterImpl()
	}
}