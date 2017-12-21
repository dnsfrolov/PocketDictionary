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
		list.add(Word(1, "Robust", null, "Здоровий, живий",
				arrayListOf(
						WordExample(1, "A maudlin movie about a lovable tramp maudlin movie about maudlin movie about."),
						WordExample(2, "A maudlin movie about a lovable tramp maudlin movie about maudlin movie about."),
						WordExample(3, "A maudlin movie about a lovable tramp maudlin movie about maudlin movie about.d"),
						WordExample(4, "A maudlin movie about a lovable tramp maudlin movie about maudlin movie about."),
						WordExample(5, "A maudlin movie about a lovable tramp maudlin movie about maudlin movie about."))
		))
		list.add(Word(2, "Centenarian", null, "Людина старша ніж 100 років",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(3, "Juxtaposition", null, "Порівнювати непорівнююче",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(4, "Just do it", null, "Просто зроби це",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(5, "Quagmire", null, "Трясовина",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(6, "Bedlam", null, "Безлад, хаос",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(7, "Convince", null, "Переконувати",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(8, "Ostracize", null, "Відчуджувати, виключати, виганяти",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(9, "Fluctuate", null, "Коливатися",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(10, "Robust", null, "Здоровий, живий",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(11, "Centenarian", null, "Людина старша ніж 100 років",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(12, "Juxtaposition", null, "Порівнювати непорівнююче",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(13, "Just do it", null, "Просто зроби це",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(14, "Quagmire", null, "Трясовина",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(15, "Bedlam", null, "Безлад, хаос",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(16, "Convince", null, "Переконувати",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(17, "Ostracize", null, "Відчуджувати, виключати, виганяти",
				arrayListOf(WordExample(1, "d"))))
		list.add(Word(18, "Fluctuate", null, "Коливатися",
				arrayListOf(WordExample(1, "d"))))
		return list
	}
}