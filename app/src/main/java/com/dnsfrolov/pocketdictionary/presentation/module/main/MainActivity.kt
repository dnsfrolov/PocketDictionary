package com.dnsfrolov.pocketdictionary.presentation.module.main

import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.presentation.base.BaseMvpActivity

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class MainActivity :
		BaseMvpActivity<MainContract.View, MainContract.Presenter>(),
		MainContract.View {

	override fun getContentView(): Int {
		return R.layout.activity_main
	}

	override fun providePresenter(): MainContract.Presenter {
		return MainPresenterImpl()
	}
}