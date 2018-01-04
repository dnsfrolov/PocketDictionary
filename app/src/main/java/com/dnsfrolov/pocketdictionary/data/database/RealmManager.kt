package com.dnsfrolov.pocketdictionary.data.database

import android.content.Context
import android.util.Log
import com.dnsfrolov.pocketdictionary.BuildConfig
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.log.RealmLog

/**
 * project: PocketDictionary
 * date: 03.01.2018
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */

object RealmManager {

	fun init(context: Context) {
		Realm.init(context)
		if (BuildConfig.DEBUG) {
			RealmLog.setLevel(Log.DEBUG)
		}
		val realmConfiguration = RealmConfiguration.Builder()
				.name("pocketdictionary.realm")
				.schemaVersion(0)
				.deleteRealmIfMigrationNeeded()
				.build()
		Realm.setDefaultConfiguration(realmConfiguration)
	}
}