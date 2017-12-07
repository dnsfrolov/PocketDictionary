package com.dnsfrolov.pocketdictionary.presentation.module.main

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.data.model.Word
import com.dnsfrolov.pocketdictionary.presentation.adapter.DictionaryListAdapter
import com.dnsfrolov.pocketdictionary.presentation.base.BaseMvpActivity
import com.dnsfrolov.pocketdictionary.presentation.widget.Toolbar
import kotlinx.android.synthetic.main.activity_dictionary_list.*
import kotlinx.android.synthetic.main.layout_toolbar.view.*

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class DictionaryListActivity :
		BaseMvpActivity<DictionaryListContract.View, DictionaryListContract.Presenter>(),
		DictionaryListContract.View, View.OnClickListener {

	private lateinit var adapter: DictionaryListAdapter

	override fun getContentView(): Int {
		return R.layout.activity_dictionary_list
	}

	override fun configureToolbar(toolbar: Toolbar) {
		toolbar.img_toolbar_end_second_icon.animate().start()
	}

	override fun configureUI() {
		initAdapter()
		initFab()
		initScrollingListener()
	}

	private fun initAdapter() {
		adapter = DictionaryListAdapter()
		rv_words_list.adapter = adapter
	}

	private fun initFab() {
		fab_add.setOnClickListener(this)
	}

	private fun initScrollingListener() {
		rv_words_list.addOnScrollListener(object : RecyclerView.OnScrollListener() {
			override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
				super.onScrolled(recyclerView, dx, dy)

				if (dy > 0 && fab_add.visibility == View.VISIBLE) {
					fab_add.hide()
					toolbar.showEndSecondDrawable()
				} else if (dy < 0 && fab_add.visibility != View.VISIBLE) {
					fab_add.show()
					toolbar.hideEndSecondDrawable()
				}
			}
		})
	}

	override fun configurePresenter() {
		presenter.getWordList()
	}

	override fun providePresenter(): DictionaryListContract.Presenter {
		return DictionaryListPresenterImpl()
	}

	override fun showWordList(dictionaryList: List<Word>) {
		adapter.setNewData(dictionaryList)
	}

	override fun onClick(v: View?) {
	}
}