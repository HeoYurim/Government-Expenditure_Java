package ch05;

public class ArrayCopyEx1 {

	public static void main(String[] args) {

		String[] oldStrArray = {"java", "�迭","010"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + " ");
		}
		System.out.println();
		System.out.println("old�� new�� ����� : " + (oldStrArray[0] == newStrArray[0]));
	}

}
