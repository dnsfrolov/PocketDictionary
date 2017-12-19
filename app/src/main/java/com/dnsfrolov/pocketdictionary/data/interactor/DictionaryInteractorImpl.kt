package com.dnsfrolov.pocketdictionary.data.interactor

import com.dnsfrolov.pocketdictionary.data.model.Word
import com.dnsfrolov.pocketdictionary.data.model.WordExample

/**
 * project: PocketDictionary
 * date: 05.12.2017
 * owner: SegaSunset
 * email: denis.frolov.work@gmail.com
 */
class DictionaryInteractorImpl : DictionaryInteractor {

	override fun getDictionaryList(): List<Word> {
		val list = ArrayList<Word>()
		list.add(Word(1, "Robust", "Здоровий, живий",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(2, "Centenarian", "Людина старша ніж 100 років",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(3, "Juxtaposition", "Порівнювати непорівнююче",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(4, "Just do it", "Просто зроби це",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(5, "Quagmire", "Трясовина",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(6, "Bedlam", "Безлад, хаос",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(7, "Convince", "Переконувати",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(8, "Ostracize", "Відчуджувати, виключати, виганяти",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(9, "Fluctuate", "Коливатися",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(10, "Robust", "Здоровий, живий",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(11, "Centenarian", "Людина старша ніж 100 років",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(12, "Juxtaposition", "Порівнювати непорівнююче",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(13, "Just do it", "Просто зроби це",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(14, "Quagmire", "Трясовина",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(15, "Bedlam", "Безлад, хаос",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(16, "Convince", "Переконувати",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(17, "Ostracize", "Відчуджувати, виключати, виганяти",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(18, "Fluctuate", "Коливатися",
				arrayListOf(WordExample(1, "d"))))
		return list
	}
}