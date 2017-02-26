package base;


public class MyInteger {
	public static void main(String[]args){
		System.out.println();
	}
	
	private int iValue;
	
	public MyInteger(int iVal){
		iValue = iVal;
	}

	public int getiValue() {
		return iValue;
	}
	//Consumes int
	public static boolean isEven(int num){
		return num % 2 == 0;
	}
	public static boolean isOdd(int num){
		return num % 2 != 0;
	}
	public static boolean isPrime(int num){
		for(int i = 2; i < num / 2; i++)
			if(num % i == 0)
				return false;
		return true;
	}
	//Consumes MyInteger
	public static boolean isEven(MyInteger mInt){
		return isEven(mInt.iValue);
	}
	public static boolean isOdd(MyInteger mInt){
		return isOdd(mInt.iValue);
	}
	public static boolean isPrime(MyInteger mInt){
		return isPrime(mInt.iValue);
	}
	
	public boolean isEven(){
		return isEven(this.iValue);
	}
	public boolean isOdd(){
		return isOdd(this.iValue);
	}
	public boolean isPrime(){
		return isPrime(this.iValue);
	}
	
	public boolean equals(int num){
		return this.iValue == num;
	}
	public boolean equals(MyInteger other){
		return this.iValue == other.getiValue();
	}
}
