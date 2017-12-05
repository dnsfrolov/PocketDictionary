package com.dnsfrolov.gymtracker.app.base.mvp

import com.dnsfrolov.gymtracker.app.base.mvp.BaseMvpContract.Presenter
import com.dnsfrolov.gymtracker.app.base.mvp.BaseMvpContract.View

/**
 * project: GymTracker
 * date: 01.09.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
abstract class BasePresenterImpl<V : View> : Presenter<V> {

	protected var view: V? = null

	override fun attachView(v: V) {
		view = v
	}

	override fun detachView() {
		view = null
	}
}