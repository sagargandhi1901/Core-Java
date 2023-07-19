package Day2;

public class DataTypes {
	public static void main(String[] args) {
		
		byte var1 = 120;
		short var2 = 463;
		int var3 = 7863;
		long var4 = 123L;				// no error if suffix not mentioned
		
		float var5 = 10.45F;			// compilation error if suffix not mentioned
		double var6 = 78.45;
		
		char var7 = 'A';
		boolean var8 = true;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}