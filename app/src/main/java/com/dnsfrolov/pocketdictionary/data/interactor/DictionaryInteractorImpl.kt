package com.dnsfrolov.pocketdictionary.data.interactor

import com.dnsfrolov.pocketdictionary.data.model.Word

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class DictionaryInteractorImpl : DictionaryInteractor {

	override fun getDictionaryList(): List<Word> {
		val list = ArrayList<Word>()
		list.add(Word("Robust", "Здоровий, живий", arrayListOf("Description1")))
		list.add(Word("Centenarian", "Людина старша ніж 100 років", arrayListOf("Description1")))
		list.add(Word("Juxtaposition", "Порівнювати непорівнююче", arrayListOf("Description1")))
		list.add(Word("Just do it", "Просто зроби це", arrayListOf("Description1")))
		list.add(Word("Quagmire", "Трясовина", arrayListOf("Description1")))
		list.add(Word("Bedlam", "Безлад, хаос", arrayListOf("Description1")))
		list.add(Word("Convince", "Переконувати", arrayListOf("Description1")))
		list.add(Word("Ostracize", "Відчуджувати, виключати, виганяти", arrayListOf("Description1")))
		list.add(Word("Fluctuate", "Коливатися", arrayListOf("Description1")))
		list.add(Word("Robust", "Здоровий, живий", arrayListOf("Description1")))
		list.add(Word("Centenarian", "Людина старша ніж 100 років", arrayListOf("Description1")))
		list.add(Word("Juxtaposition", "Порівнювати непорівнююче", arrayListOf("Description1")))
		list.add(Word("Just do it", "Просто зроби це", arrayListOf("Description1")))
		list.add(Word("Quagmire", "Трясовина", arrayListOf("Description1")))
		list.add(Word("Bedlam", "Безлад, хаос", arrayListOf("Description1")))
		list.add(Word("Convince", "Переконувати", arrayListOf("Description1")))
		list.add(Word("Ostracize", "Відчуджувати, виключати, виганяти", arrayListOf("Description1")))
		list.add(Word("Fluctuate", "Коливатися", arrayListOf("Description1")))
		return list
	}
}