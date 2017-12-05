package com.dnsfrolov.gymtracker.app.base.mvp

/**
 * project: GymTracker
 * date: 01.09.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
interface BaseMvpContract {

	interface View

	interface Presenter<in V : View> {

		fun attachView(v: V)

		fun detachView()
	}
}