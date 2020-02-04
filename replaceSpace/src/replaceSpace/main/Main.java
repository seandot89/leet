package replaceSpace.main;

public class Main {

	public static void main(String[] args) {
		String str = "mr sean  leavy      ";
		
//		System.out.println(test(str,14));
		
		System.out.println(isPermOfPal("bb"));//
		System.out.println(isPermOfPal("a"));//
		System.out.println(isPermOfPal("abc"));//
		System.out.println(isPermOfPal("aba"));//
		System.out.println(isPermOfPal("abba"));//
		System.out.println(isPermOfPal("abbbc"));//
		
		
	}
	
	public static String test(String str, int trueLength) {
		
		int R = str.length()-1;
		char[] strChar = str.toCharArray();
		
		for(int L = trueLength - 1; L >=0; L--) {
			if(strChar[L]==' ') {
				strChar[R] = '0';
				strChar[R-1] = '2';
				strChar[R-2] = '%';
				R -= 3;
			}else {
				strChar[R] = strChar[L];
				R--;
			}
		}

		return new String(strChar);
	}
	
	public static boolean isPermOfPal(String str) {
		int [] chars = new int[128];
		
		for(char c : str.toCharArray()) {
			chars[c]++;
			
		}
		
		int oddCount = 0;
		
		for(int i = 0; i < chars.length; i++) {
			if(chars[i]%2==1) {
				oddCount++;
			}
		}
		
		return (oddCount<=1);
	}

}
