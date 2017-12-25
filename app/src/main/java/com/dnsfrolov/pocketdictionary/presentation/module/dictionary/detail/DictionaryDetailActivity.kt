package com.dnsfrolov.pocketdictionary.presentation.module.dictionary.detail

import android.content.Context
import android.content.Intent
import android.support.annotation.IntDef
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

class DictionaryDetailActivity :
		BaseMvpActivity<DictionaryDetailContract.View, DictionaryDetailPresenterImpl>(),
		DictionaryDetailContract.View,
		View.OnClickListener {

	companion object {
		@IntDef(CREATE, UPDATE)
		@Retention(AnnotationRetention.SOURCE)
		annotation class Intention

		const val CREATE = 0L
		const val UPDATE = 1L

		fun newIntent(context: Context, @Intention intention: Long, wordId: Int = 0): Intent = Intent(
				context, DictionaryDetailActivity::class.java).apply {
			putExtra(Key.INTENTION, intention)
			putExtra(Key.WORD_ID, wordId)
		}
	}

	@Intention
	private var type: Long = 0
	private lateinit var adapter: WordExampleListAdapter

	override fun interceptTransaction() {
		super.interceptTransaction()
		type = intent.getLongExtra(Key.INTENTION, 0)
	}

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
		if (type == UPDATE) presenter.getWordDetails(intent.getIntExtra(Key.WORD_ID, 0))
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
		if (!etxt_dictionary_detail_transcription?.text.isNullOrEmpty()) {
			fl_dictionary_detail_transcription?.visibility = View.VISIBLE
		} else {
			fl_dictionary_detail_transcription?.visibility = View.GONE
		}
	}
}