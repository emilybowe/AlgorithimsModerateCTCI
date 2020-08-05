import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Q8Test {

	Q8 q8;

	@BeforeEach
	public void init() {
		q8 = new Q8();
	}

	@Test
	public void given1To10_1_shouldReturnOne() {
		Assertions.assertEquals("One", q8.getEnglishPhraseForInt(1));
	}

	@Test
	public void given11To20_11_shouldReturnEleven() {
		Assertions.assertEquals("Eleven", q8.getEnglishPhraseForInt(11));
	}

	@Test
	public void given21To29_21_shouldReturnTwentyOne() {
		Assertions.assertEquals("Twenty One", q8.getEnglishPhraseForInt(21));
	}

	@Test
	public void given30To90_30_shouldReturnThirty() {
		Assertions.assertEquals("Thirty", q8.getEnglishPhraseForInt(30));
	}

	@Test
	public void givenEndInZero_10_shouldReturnTen() {
		Assertions.assertEquals("Ten", q8.getEnglishPhraseForInt(10));
	}

	@Test
	public void givenEndInZero_100_shouldReturnHundred() {
		Assertions.assertEquals("One Hundred", q8.getEnglishPhraseForInt(100));
	}

	@Test
	public void givenEndInZero_1000_shouldReturnThousand() {
		Assertions.assertEquals("One Thousand", q8.getEnglishPhraseForInt(1000));
	}

	@Test
	public void givenAllDifferentDigits_987_shouldReturnNineThousandEightHundredSeventySix() {
		Assertions.assertEquals("Nine Thousand Eight Hundred Seventy Six", q8.getEnglishPhraseForInt(9876));
	}

	@Test
	public void givenAllDifferentDigits_1234_shouldReturnOneThousandTwoHundredThirtyFour() {
		Assertions.assertEquals("One Thousand Two Hundred Thirty Four", q8.getEnglishPhraseForInt(1234));
	}

	@Test
	public void givenAllSameDigits_9999_shouldReturnNineThousandNineHundredNinetyNine() {
		Assertions.assertEquals("Nine Thousand Nine Hundred Ninety Nine", q8.getEnglishPhraseForInt(9999));
	}

}
