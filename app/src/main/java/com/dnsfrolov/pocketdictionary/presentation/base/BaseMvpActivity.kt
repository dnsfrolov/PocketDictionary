package com.dnsfrolov.pocketdictionary.presentation.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import com.dnsfrolov.gymtracker.app.base.mvp.BaseMvpContract
import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.presentation.widget.ToolbarLayout

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
abstract class BaseMvpActivity<in V : BaseMvpContract.View, P : BaseMvpContract.Presenter<V>> :
		AppCompatActivity(),
		BaseMvpContract.View {

	open protected lateinit var presenter: P

	protected lateinit var toolbar: ToolbarLayout

	@LayoutRes
	protected abstract fun getContentView(): Int

	protected abstract fun providePresenter(): P

	protected open fun configureToolbar(toolbar: ToolbarLayout) {}

	open protected fun interceptTransaction() {
	}

	open protected fun configureUI() {}

	open protected fun configurePresenter() {}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		interceptTransaction()
		setContentView(getContentView())

		presenter = providePresenter()
		@Suppress("UNCHECKED_CAST")
		presenter.attachView(this as V)

		toolbar = findViewById(R.id.toolbar)

		configureToolbar(toolbar)
		configureUI()
		configurePresenter()
	}

	override fun onDestroy() {
		super.onDestroy()
		presenter.detachView()
	}
}