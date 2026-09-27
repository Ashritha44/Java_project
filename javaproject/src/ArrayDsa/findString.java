package ArrayDsa;

public class findString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"ash","raj","pran","swat"};
		String target = "swat";
		boolean found = false;
		for(String str:names) {
			if(str.equals(target)) {
				found= true;
				break;
			}
		}
		System.out.println(found?"present":"not present");
	}

}
