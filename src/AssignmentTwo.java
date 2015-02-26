/**
 * 
 */

/**
 * @author Pongsathorn Cherngchaosil
 *
 */
public class AssignmentTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte theByte = 124;
		short theShort = 1;
		int theInt = 2;
		long theLong = 15;
		float theFloat = (float) 4.5;
		double theDouble = 5.9;
		char theChar = 'a';
		boolean theBoolean = true;
		System.out.print("theByte = "+theByte+"\ntheShort = "+theShort+"\ntheInt = "
							+theInt+"\ntheLong" + theLong+"\ntheFloat = "+theFloat+
							"\ntheDouble = "+theDouble+"\ntheChar = "+theChar+
							"\nTheBoolean = "+theBoolean+"\nTheByte + theShort = "
							+(theByte+theShort)+"\ntheByte - theShort = "+(theByte-theShort)
							+"\ntheByte * theLong"+(theByte*theLong)+"\ntheByte << 4 = "
									+ ""+(theByte<<4)+"\nExecute: theByte = theByte << 4"+"\ntheByte = ");
		theByte = (byte) (theByte<<4);
		System.out.print(theByte+"\ntheLong * 128 = "+(theLong*128)+"\ntheLong / 128 = "
						+(theLong/128)+"\ntheLong / 128.0 = "+(theLong/128.0)+
						"\n0 < theLong < 2 is false"+"\n0 < theLong < 100 is true\ntheLong equals theLong is true\ntheLong not "
						+"equals theLong is false\ntheChar + theChar = "+(char)(theChar+theChar)+
						"\ntheChar + 1 = "+(char)(theChar+1)+"\ntheLong modulus 3 = "+(theLong%3)+
						"\ntheLong modulus 2 = "+(theLong%2)+"\ntheLong modulus 1 = "+(theLong%1)+
						"\ntheBoolean and theBoolean is "+(theBoolean&&theBoolean)+"\nnot(theBoolean"
						+ " and theBoolean) is "+(!(theBoolean&&theBoolean))+"\n(not theBoolean) and theBoolean is "+
						((!theBoolean)&&theBoolean)+"\ntheBoolean or (not theBoolean) is "+(theBoolean||(!theBoolean)));
		
	}

}
