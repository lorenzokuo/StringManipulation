public class StringManipulator{
	public String trimAndConcat(String sentenceOne, String sentenceTwo){
		String sentence1 = sentenceOne.trim();
		String sentence2 = sentenceTwo.trim();
		String sentence3 = sentence1.concat(sentence2);
		return sentence3;
	}
	public Integer getIndexOrNull(String word, char letter){
		int index = word.indexOf(letter);
		if(index == -1){
			return null;
		}
		return index;
	}
	public Integer getIndexOrNull(String word, String sub){
		int index = word.indexOf(sub);
		if(index == -1){
			return null;
		}
		return index;
	}
	public String concatSubstring(String word1, int index1, int index2, String word2){
		String str1 = word1.substring(index1, index2);
		String str2 = word2;
		String str3 = str1.concat(str2);
		return str3;
	}
}