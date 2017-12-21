package com.dnsfrolov.pocketdictionary.presentation.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.data.model.WordExample
import com.dnsfrolov.pocketdictionary.util.RomanNumeral

/**
 * project: PocketDictionary
 * date: 20.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class WordExampleListAdapter : BaseQuickAdapter<WordExample, BaseViewHolder>(
		R.layout.item_word_example_list, null) {


	override fun convert(helper: BaseViewHolder?, item: WordExample) {
		helper?.setText(R.id.txt_word_example_id_example, RomanNumeral.convertToRomanNumeral(item.id))
				?.setText(R.id.etxt_word_example_example, item.example)
	}
}