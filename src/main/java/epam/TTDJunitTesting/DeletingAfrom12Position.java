package epam.TTDJunitTesting;

public class DeletingAfrom12Position {
	String removeA(String string) {
		int stringlength=string.length();
		String result="";
		if(stringlength>=2) {
		if(string.charAt(0)=='a' && string.charAt(1)=='a') {
			result=string.substring(2,stringlength);
		}
		else if(string.charAt(0)=='a' && string.charAt(1)!='a') {
			result=string.substring(1,stringlength);
		}
		else if(string.charAt(0)!='a' && string.charAt(1)=='a') {
			result=string.charAt(0)+string.substring(2,stringlength);
		}
		else {
			result=string;
		}
		}
		return result;
	}
}