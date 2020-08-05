import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//assume number will be 1 - 9999

public class Q8 {

	Map<Integer, String> intToEnglishPhraseMap;

	public String getEnglishPhraseForInt(int intToConvert) {
		intToEnglishPhraseMap = new HashMap<>();
		setup();
		List<Integer> intList = new ArrayList<>();

		while (intToConvert >= 1 && intToConvert <= 20) {
			return intToEnglishPhraseMap.get(intToConvert);
		}

		while (intToConvert >= 21 && intToConvert <= 99) {
			if (intToConvert % 10 == 0) {
				return intToEnglishPhraseMap.get(intToConvert);
			} else {
				int remainder = intToConvert % 10;
				return intToEnglishPhraseMap.get(intToConvert - remainder) + " " + intToEnglishPhraseMap.get(remainder);
			}
		}

		while (intToConvert >= 100 && intToConvert <= 999) {
			int hundredCount = intToConvert / 100;
			if (intToConvert % 100 == 0) {
				return intToEnglishPhraseMap.get(hundredCount) + " " + intToEnglishPhraseMap.get(100);
			} else {
				int tenCount = intToConvert % 100; //987 = 9.87 == 87
				int digitCount = tenCount % 10; //87 = 8.7 == 7
				return intToEnglishPhraseMap.get(hundredCount) + " " + intToEnglishPhraseMap.get(100) + " "
						+ intToEnglishPhraseMap.get(tenCount - digitCount) + " " + intToEnglishPhraseMap.get(digitCount);
			}
		}

		while (intToConvert >= 1000 && intToConvert <= 9999) {
			int thousandCount = intToConvert / 1000;
			if (intToConvert % 1000 == 0) {
				return intToEnglishPhraseMap.get(thousandCount) + " " + intToEnglishPhraseMap.get(1000);
			} else {
				int hundredCount = intToConvert % 1000; //9876 = 9.876 == 876
				int tenCount = hundredCount % 100; //876 = 8.76 == 76
				int digitCount = tenCount % 10; //76 = 7.6 == 6
				return intToEnglishPhraseMap.get(thousandCount) + " " + intToEnglishPhraseMap.get(1000) + " "
						+ intToEnglishPhraseMap.get(((hundredCount - tenCount) / 100)) + " " + intToEnglishPhraseMap.get(100) + " "
						+ intToEnglishPhraseMap.get(tenCount - digitCount) + " " + intToEnglishPhraseMap.get(digitCount);

			}

		}
		return null;
	}


	private void setup() {
		intToEnglishPhraseMap.put(1, "One");
		intToEnglishPhraseMap.put(2, "Two");
		intToEnglishPhraseMap.put(3, "Three");
		intToEnglishPhraseMap.put(4, "Four");
		intToEnglishPhraseMap.put(5, "Five");
		intToEnglishPhraseMap.put(6, "Six");
		intToEnglishPhraseMap.put(7, "Seven");
		intToEnglishPhraseMap.put(8, "Eight");
		intToEnglishPhraseMap.put(9, "Nine");
		intToEnglishPhraseMap.put(10, "Ten");
		intToEnglishPhraseMap.put(11, "Eleven");
		intToEnglishPhraseMap.put(12, "Twelve");
		intToEnglishPhraseMap.put(13, "Thirteen");
		intToEnglishPhraseMap.put(14, "Fourteen");
		intToEnglishPhraseMap.put(15, "Fifteen");
		intToEnglishPhraseMap.put(16, "Sixteen");
		intToEnglishPhraseMap.put(17, "Seventeen");
		intToEnglishPhraseMap.put(18, "Eighteen");
		intToEnglishPhraseMap.put(19, "Nineteen");
		intToEnglishPhraseMap.put(20, "Twenty");
		intToEnglishPhraseMap.put(30, "Thirty");
		intToEnglishPhraseMap.put(40, "Forty");
		intToEnglishPhraseMap.put(50, "Fifty");
		intToEnglishPhraseMap.put(60, "Sixty");
		intToEnglishPhraseMap.put(70, "Seventy");
		intToEnglishPhraseMap.put(80, "Eighty");
		intToEnglishPhraseMap.put(90, "Ninety");
		intToEnglishPhraseMap.put(100, "Hundred");
		intToEnglishPhraseMap.put(1000, "Thousand");
	}
}
