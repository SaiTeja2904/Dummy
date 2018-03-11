import java.util.Scanner;
class ToUpper
{
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String source=sc.nextLine();
		//System.out.println(source);
		//String finalString=capitalizeString(source);
		System.out.println("Output is "+finalString);
		/*source=source.toLowerCase();
		//source.charAt(0).toUpperCase();
		source.charAt(0)=Character.toUpperCase(source.charAt(0));
		for(int i=0;i<source.length();i++){
			if(source.charAt(i)==' ')
			{
				source.charAt(i+1).toUpperCase();
			}
		}
		System.out.println(source);
*/
	}
	public static String capitalizeString(String string) {
  char[] chars = string.toLowerCase().toCharArray();
  boolean found = false;
  for (int i = 0; i < chars.length; i++) {
    if (!found && Character.isLetter(chars[i])) {
      chars[i] = Character.toUpperCase(chars[i]);
      found = true;
    } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
      found = false;
    }
  }
  return String.valueOf(chars);
}
}