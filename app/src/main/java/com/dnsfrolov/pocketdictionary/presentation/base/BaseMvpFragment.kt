package com.dnsfrolov.gymtracker.app.base.mvp

import android.app.Activity
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * project: GymTracker
 * date: 31.08.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
abstract class BaseMvpFragment<in V : BaseMvpContract.View, P : BaseMvpContract.Presenter<V>> :
		Fragment(),
		BaseMvpContract.View {

	open protected lateinit var actParent: Activity
	protected lateinit var presenter: P

	@LayoutRes
	protected abstract fun getContentView(): Int

	abstract fun providePresenter(): P

	protected open fun configureUI() {}

	protected abstract fun configurePresenter()

	override fun onCreateView(inflater: LayoutInflater?,
							  container: ViewGroup?,
							  savedInstanceState: Bundle?): View? {
		actParent = activity
		return inflater?.inflate(getContentView(), container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		presenter = providePresenter()
		@Suppress("UNCHECKED_CAST")
		presenter.attachView(this as V)

		configureUI()
		configurePresenter()
	}

	override fun onDetach() {
		super.onDetach()
		presenter.detachView()
	}
}