package com.dnsfrolov.pocketdictionary

import android.app.Application
import com.dnsfrolov.pocketdictionary.data.database.RealmManager

/**
 * project: PocketDictionary
 * date: 03.01.2018
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class PocketDictionaryApplication : Application() {

	override fun onCreate() {
		super.onCreate()
		RealmManager.init(this)
	}
}