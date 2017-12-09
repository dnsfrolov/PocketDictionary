package com.dnsfrolov.pocketdictionary.presentation.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.dnsfrolov.pocketdictionary.R

/**
 * project: PocketDictionary
 * date: 07.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class SearchLayout : FrameLayout {

	constructor(context: Context?) : super(context) {
		init(null)
	}

	constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
		init(attrs)
	}

	private fun init(attrs: AttributeSet?) {
		View.inflate(context, R.layout.layout_search, this)

		val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SearchLayout)
		try {

		} finally {
			typedArray.recycle()
		}
	}
}