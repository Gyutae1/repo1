package sec01.exam04;

public class DictKorEng {
	
	String ko_word1 = "사랑";
	String en_word1 = "love";
	
	String ko_word2 = "우정";
	String en_word2 = "friendship";
	
	String translate(String word){
		if(ko_word1.equals(word)) {
			return en_word1;
		} else if (ko_word2.equals(word)) {
			return en_word2;
		} else {
			return "그런 단어는 모릅니다";
		}
		
	}
}
