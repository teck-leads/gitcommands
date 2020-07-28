package com.techleasds.app;



public class Anagram {

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "margana";
//		
//		String str1 =	"anagramm";
//		String str2 = "marganaa";
		boolean anagram = isAnagram(str1, str2);
		//String str=anagram==true?"Anagram": "Not an Angram";
		System.out.println(anagram);

	}

	private static void addToMap(char[] charArray, java.util.Map<Character, Integer> map) {
		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				int count = map.get(charArray[i]);
				map.put(charArray[i], ++count);
			} else {
				map.put(charArray[i], 1);
			}
		}
	}

	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] chAr1 = a.toCharArray();
		char[] chAr2 = b.toCharArray();
		

		java.util.Map<Character, Integer> map1 = new java.util.HashMap<>();
		java.util.Map<Character, Integer> map2 = new java.util.HashMap<>();

		addToMap(chAr1, map1);
		addToMap(chAr2, map2);

		boolean flag = false;

		if (map1.size() != map2.size()) {
			return false;
		} else {

			java.util.Set<java.util.Map.Entry<Character, Integer>> entrySet = map1.entrySet();
			for (java.util.Map.Entry<Character, Integer> entry : entrySet) {

				if (map2.containsKey(entry.getKey())) {
					int value1 = entry.getValue();
					int value2 = map2.get(entry.getKey());
					if (value1 == value2) {
						flag = true;
					} else {
						flag = false;
						break;
					}

				} 

			}

			
		}
		return flag;
	}

}
