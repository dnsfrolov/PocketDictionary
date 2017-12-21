package com.dnsfrolov.pocketdictionary.presentation.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.data.model.Word
import com.dnsfrolov.pocketdictionary.util.OnWordClickListener

/**
 * project: PocketDictionary
 * date: 06.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class DictionaryListAdapter(private var wordClickListener: OnWordClickListener?) :
		BaseQuickAdapter<Word, BaseViewHolder>(R.layout.item_dictionary_list, null) {

	private var wordListener: OnWordClickListener? = null

	init {
		wordListener = this.wordClickListener
	}

	override fun convert(helper: BaseViewHolder, item: Word) {
		helper.setText(R.id.txt_dictionary_item_word, item.word)
		helper.setText(R.id.txt_dictionary_item_translated_word, item.translation)

		helper.itemView.setOnClickListener({
			this.wordListener?.onWordClick(item.id)
		})
	}
}