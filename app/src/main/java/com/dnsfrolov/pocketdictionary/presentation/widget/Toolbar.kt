package com.dnsfrolov.pocketdictionary.presentation.widget

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v4.view.animation.FastOutLinearInInterpolator
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import com.dnsfrolov.pocketdictionary.R
import com.dnsfrolov.pocketdictionary.R.id.*
import kotlinx.android.synthetic.main.layout_toolbar.view.*

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class Toolbar : FrameLayout {
	companion object {
		val START_ICON = img_toolbar_start_icon
		val END_FIRST_ICON = img_toolbar_end_first_icon
		val END_SECOND_ICON = img_toolbar_end_second_icon

		val POSITION_START = "start"
		val POSITION_CENTER = "center"
		val POSITION_END = "end"
	}

	constructor(context: Context?) : super(context) {
		init(null)
	}

	constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
		init(attrs)
	}

	override fun onAttachedToWindow() {
		super.onAttachedToWindow()
		val mPadding: Int = resources.getDimension(R.dimen.toolbar_padding).toInt()
		setPadding(mPadding, mPadding, mPadding, mPadding)
	}

	private fun init(attrs: AttributeSet?) {
		View.inflate(context, R.layout.layout_toolbar, this)

		val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Toolbar)
		try {
			txt_toolbar_title.text = typedArray.getString(R.styleable.Toolbar_android_title)
			val startIcon = typedArray.getDrawable(R.styleable.Toolbar_icon_start)
			val endFirstIcon = typedArray.getDrawable(R.styleable.Toolbar_icon_first_end)
			val endSecondIcon = typedArray.getDrawable(R.styleable.Toolbar_icon_second_end)
			val titlePosition = typedArray.getString(R.styleable.Toolbar_title_position)
			setStartDrawable(startIcon)
			setEndFirstDrawable(endFirstIcon)
			setEndSecondDrawable(endSecondIcon)
			setTitlePosition(titlePosition)
		} finally {
			typedArray.recycle()
		}
	}

	fun setTitle(title: String) {
		txt_toolbar_title?.text = title
	}

	fun setTitlePosition(titlePosition: String) {
		img_toolbar_start_icon.visibility = View.VISIBLE
		img_toolbar_end_first_icon.visibility = View.VISIBLE
		img_toolbar_end_second_icon.visibility = View.VISIBLE

		when (titlePosition) {
			POSITION_START -> {
				img_toolbar_start_icon.visibility = View.GONE
			}
			POSITION_CENTER -> {
				img_toolbar_end_second_icon.visibility = View.GONE
				txt_toolbar_title.gravity = Gravity.CENTER
			}
			POSITION_END -> {
				img_toolbar_start_icon.visibility = View.GONE
				img_toolbar_end_second_icon.visibility = View.GONE
				txt_toolbar_title.gravity = Gravity.END
			}
		}
	}

	fun setStartDrawable(startIcon: Drawable?) {
		img_toolbar_start_icon?.setImageDrawable(startIcon)
		img_toolbar_start_icon?.visibility = View.VISIBLE
	}

	fun setEndFirstDrawable(endFirstIcon: Drawable?) {
		img_toolbar_end_first_icon.setImageDrawable(endFirstIcon)
		img_toolbar_end_first_icon.visibility = View.VISIBLE
	}

	fun setEndSecondDrawable(endSecondIcon: Drawable?) {
		img_toolbar_end_second_icon.setImageDrawable(endSecondIcon)
	}

	fun showEndSecondDrawable() {
		img_toolbar_end_second_icon.visibility = View.VISIBLE
		img_toolbar_end_second_icon.animate()
				.alpha(1F)
				.setDuration(150L)
				.scaleX(1F)
				.scaleY(1F).interpolator = FastOutLinearInInterpolator()
	}

	fun hideEndSecondDrawable() {
		img_toolbar_end_second_icon.animate()
				.alpha(0F)
				.setDuration(150L)
				.scaleX(0F)
				.scaleY(0F)
				.setInterpolator(FastOutLinearInInterpolator())
				.withEndAction({ img_toolbar_end_second_icon.visibility = View.GONE })
	}

	fun setIconsClickListener(onClickListener: View.OnClickListener?) {
		onClickListener?.let {
			setStartIconClickListener(it)
			setEndFirstIconClickListener(it)
			setEndSecondClickListener(it)
		}
	}

	fun setStartIconClickListener(clickListener: View.OnClickListener) {
		img_toolbar_start_icon.setOnClickListener(clickListener)
	}

	fun setEndFirstIconClickListener(clickListener: View.OnClickListener) {
		img_toolbar_end_first_icon.setOnClickListener(clickListener)
	}

	fun setEndSecondClickListener(clickListener: View.OnClickListener) {
		img_toolbar_end_second_icon.setOnClickListener(clickListener)
	}

	override fun onDetachedFromWindow() {
		super.onDetachedFromWindow()
		img_toolbar_end_second_icon.animate().cancel()
	}
}