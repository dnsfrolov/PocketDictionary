package com.dnsfrolov.pocketdictionary.presentation.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.data.model.Word

/**
 * project: PocketDictionary
 * date: 06.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class DictionaryListAdapter : BaseQuickAdapter<Word, BaseViewHolder>(
		R.layout.item_dictionary_list, null) {

	override fun convert(helper: BaseViewHolder, item: Word) {
		helper.setText(R.id.txt_dictionary_item_word, item.word)
		helper.setText(R.id.txt_dictionary_item_translated_word, item.translatedWord)
	}
}