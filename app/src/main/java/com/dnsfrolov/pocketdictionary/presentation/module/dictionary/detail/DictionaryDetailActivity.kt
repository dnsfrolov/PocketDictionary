package com.dnsfrolov.pocketdictionary.presentation.module.dictionary.detail

import android.content.Context
import android.content.Intent
import android.view.View
import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.data.model.Word
import com.dnsfrolov.pocketdictionary.presentation.adapter.WordExampleListAdapter
import com.dnsfrolov.pocketdictionary.presentation.base.BaseMvpActivity
import com.dnsfrolov.pocketdictionary.presentation.widget.ToolbarLayout
import com.dnsfrolov.pocketdictionary.util.Key
import kotlinx.android.synthetic.main.activity_dictionary_detail.*

/**
 * project: PocketDictionary
 * date: 09.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */

fun Context.dictionaryDetailIntent(wordId: Int): Intent {
	return Intent(this, DictionaryDetailActivity::class.java).apply {
		putExtra(Key.WORD_ID, wordId)
	}
}

class DictionaryDetailActivity :
		BaseMvpActivity<DictionaryDetailContract.View, DictionaryDetailPresenterImpl>(),
		DictionaryDetailContract.View,
		View.OnClickListener {

	private lateinit var adapter: WordExampleListAdapter

	override fun getContentView(): Int {
		return R.layout.activity_dictionary_detail
	}

	override fun configureToolbar(toolbar: ToolbarLayout) {
		toolbar.setStartIcon(getDrawable(R.drawable.ic_back))
		toolbar.setStartIconClickListener(this)
	}

	override fun configureUI() {
		initAdapter()
	}

	override fun providePresenter(): DictionaryDetailPresenterImpl {
		return DictionaryDetailPresenterImpl()
	}

	override fun configurePresenter() {
		presenter.getWordDetails()
	}

	override fun showWordDetails(word: Word?) {
		etxt_dictionary_detail_word?.setText(word?.word)
		etxt_dictionary_detail_transcription?.setText(word?.transcription)
		etxt_dictionary_detail_translation?.setText(word?.translation)
		adapter.setNewData(word?.examples)
		validateFields()
	}

	override fun onClick(v: View?) {

	}

	private fun initAdapter() {
		adapter = WordExampleListAdapter()
		rv_dictionary_detail_word_example.adapter = adapter
	}

	private fun validateFields() {
		if (!etxt_dictionary_detail_transcription?.text.isNullOrEmpty())
			fl_dictionary_detail_transcription?.visibility = View.VISIBLE
		else
			fl_dictionary_detail_transcription?.visibility = View.GONE
	}
}