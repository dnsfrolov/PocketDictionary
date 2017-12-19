package com.dnsfrolov.pocketdictionary.presentation.module.dictionary.detail

import android.view.View
import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.presentation.base.BaseMvpActivity
import com.dnsfrolov.pocketdictionary.presentation.widget.ToolbarLayout

/**
 * project: PocketDictionary
 * date: 09.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class DictionaryDetailActivity :
		BaseMvpActivity<DictionaryDetailContract.View, DictionaryDetailPresenterImpl>(),
		DictionaryDetailContract.View,
		View.OnClickListener {

	override fun getContentView(): Int {
		return R.layout.activity_dictionary_detail
	}

	override fun configureToolbar(toolbar: ToolbarLayout) {
		toolbar.setStartIcon(getDrawable(R.drawable.ic_back))
		toolbar.setStartIconClickListener(this)
	}

	override fun providePresenter(): DictionaryDetailPresenterImpl {
		return DictionaryDetailPresenterImpl()
	}

	override fun onClick(v: View?) {

	}
}