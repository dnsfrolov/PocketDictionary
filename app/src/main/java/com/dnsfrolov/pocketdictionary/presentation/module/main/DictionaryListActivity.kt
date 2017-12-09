package com.dnsfrolov.pocketdictionary.presentation.module.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.data.model.Word
import com.dnsfrolov.pocketdictionary.presentation.adapter.DictionaryListAdapter
import com.dnsfrolov.pocketdictionary.presentation.base.BaseMvpActivity
import com.dnsfrolov.pocketdictionary.presentation.widget.ToolbarLayout
import kotlinx.android.synthetic.main.activity_dictionary_list.*

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
	private var show: Boolean = false

	override fun getContentView(): Int {
		return R.layout.activity_dictionary_list
	}

	override fun configureToolbar(toolbar: ToolbarLayout) {
		toolbar.setEndFirstIconClickListener(this)
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
					//toolbar.validateEndSecondIcon()
				} else if (dy < 0 && fab_add.visibility != View.VISIBLE) {
					fab_add.show()
					//toolbar.hideEndSecondDrawable()
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
		when (v?.id) {
			ToolbarLayout.END_FIRST_ICON -> {
				show = if (!show) {
					toolbar.setEndSecondIcon(getDrawable(R.drawable.ic_settings))
					toolbar.setEndThirdIcon(getDrawable(R.drawable.ic_search))
					toolbar.setEndSecondClickListener(this)
					toolbar.setEndThirdClickListener(this)
					toolbar.validateEndSecondIcon(true)
					toolbar.validateEndThirdIcon(true)
					true
				} else {
					toolbar.validateEndSecondIcon(false)
					toolbar.validateEndThirdIcon(false)
					toolbar.setEndSecondClickListener(null)
					toolbar.setEndThirdClickListener(null)
					false
				}

				if (toolbar.isSearchLayoutVisibility()) {
					toolbar.setSearchLayoutVisibility(false)
				}
				/*show = if (!show) {
					toolbar.setEndSecondIcon(getDrawable(R.drawable.ic_search))
					toolbar.setEndSecondClickListener(this)
					toolbar.validateEndSecondIcon()
					true
				} else {
					toolbar.hideEndSecondDrawable()
					toolbar.setEndSecondClickListener(null)
					false
				}*/
			}
			ToolbarLayout.END_SECOND_ICON -> {
				Toast.makeText(this, "second", Toast.LENGTH_SHORT).show()
			}
			ToolbarLayout.END_THIRD_ICON -> {
				Toast.makeText(this, "third", Toast.LENGTH_SHORT).show()
				toolbar.validateEndSecondIcon(false)
				toolbar.setEndSecondClickListener(null)
				toolbar.validateEndThirdIcon(false)
				toolbar.setEndThirdClickListener(null)
				toolbar.setSearchLayoutVisibility(true)
				show = false
			}
		}
	}
}