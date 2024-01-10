
public class StringMethodesz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String team="ind";
		String team2="aus";
		String team3="sa";
		String team4="nz";
		char[] game= {'c','r','i','c'};
		String game1=" ";
		String colour="black green";
		String bat=" nike ";
		
		
//		charAt
		System.out.println("charAt");
		char position=team.charAt(0);
		System.out.println(position);
		
//		codePointAt
		System.out.println("codePointAt");
		int position2=team.codePointAt(0);
		System.out.println(position2);
		
//		codePointBefore
		System.out.println("codePointBefore");
		int position3=team.codePointBefore(1);
		System.out.println(position3);
		
//		compareTo
		System.out.println("compareTo");
		System.out.println(team.compareTo(team4));
		
//		compareToIgnorecase
		System.out.println("compareToIgnorecase");
		System.out.println(team2.compareToIgnoreCase(team3));
		
//		Contains
		System.out.println("Contains");
		System.out.println(team.contains("nz"));
		
//		contentEquals
		System.out.println("contentEquals");
		System.out.println(team.contentEquals("aus"));
		System.out.println(team.contentEquals("nz"));
		
//		CopyValueOf
		System.out.println("CopyValueOf");
		game1=game1.copyValueOf(game,0,4);
		System.out.println("returend string:" +game1);
		
//		endsWith
		System.out.println("endsWith");
		System.out.println(team.endsWith("in"));
		System.out.println(team.endsWith("nd"));
		
//		equals
		System.out.println("equals");
		System.out.println(team.equals(team2));
		
//		equalsIgnorecase
		System.out.println("equalsIgnorecase");
		System.out.println(team.equalsIgnoreCase(team2));
		System.out.println(team.equalsIgnoreCase(team3));
		
//		hash code
		System.out.println("hash code");
		System.out.println(team.hashCode());
		
//		indexOf
		System.out.println("indexOf");
		System.out.println(team.indexOf("ind"));
		
//		lastindexOf
		System.out.println("lastindexOf");
		System.out.println(team4.lastIndexOf("nz"));
		
//		isEmpty
		System.out.println("isEmpty");
		System.out.println(team2.isEmpty());
		System.out.println(colour.isEmpty());
		
//		length
		System.out.println("length");
		System.out.println(bat.length());
		
		StringMethodesz ind=new StringMethodesz();
		ind.mani();
	
	}
	public void mani() {

		String team="ind";
		String team2="aus";
		String team3="sa";
		String team4="nz";
		char[] game= {'c','r','i','c'};
		String game1=" ";
		String colour="black green";
		String bat=" nike ";
		
		
//		replace
		System.out.println("replace");
		System.out.println(team.replace('c','c'));
		
//		split
		System.out.println("split");
		System.out.println(colour.split(" "));
		
//		startsWith
		System.out.println("startsWith");
		System.out.println(team.startsWith("i"));
		System.out.println(team.startsWith("nd"));
		
//		toLowerCase
		System.out.println(colour.toUpperCase());
		System.out.println(colour.toLowerCase());
		
//		trim
		System.out.println(bat);
		System.out.println(bat.trim());	
	}
}
