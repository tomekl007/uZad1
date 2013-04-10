import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class MainClass {
	
	 static Map<Integer,List<String>> keyMapping = new HashMap<>();
	static List<String> nr0 = new LinkedList<>();
	static List<String> nr1 = new LinkedList<>();
	static List<String> nr2 = new LinkedList<>();
	static List<String> nr3 = new LinkedList<>();
	static List<String> nr4 = new LinkedList<>();
	static List<String> nr5 = new LinkedList<>();
	static List<String> nr6 = new LinkedList<>();
	static List<String> nr7 = new LinkedList<>();
	static List<String> nr8 = new LinkedList<>();
	static List<String> nr9 = new LinkedList<>();
	
	 public Integer i;

	
	public static void main(String[] args) {
		//initialize
		
		if(args[0].length()!=9){
			System.out.println("ERROR");
			return;
		}
		
		
		
		nr0.add("0");
		
		nr1.add("1");
		
		nr2.add("A");
		nr2.add("B");
		nr2.add("C");
		
		nr3.add("D");
		nr3.add("E");
		nr3.add("F");
		
		nr4.add("G");
		nr4.add("H");
		nr4.add("I");
		
		nr5.add("J");
		nr5.add("K");
		nr5.add("L");
	
		nr6.add("M");
		nr6.add("N");
		nr6.add("O");
	
		nr7.add("P");
		nr7.add("R");
		nr7.add("S");
	
		nr8.add("T");
		nr8.add("U");
		nr8.add("V");
		
		nr9.add("X");
		nr9.add("X");
		nr9.add("Y");
		
		//keyMapping.put(0, nr0);
		//keyMapping.put(1, nr1);
		keyMapping.put(2, nr2);
		keyMapping.put(3, nr3);
		keyMapping.put(4, nr4);
		keyMapping.put(5, nr5);
		keyMapping.put(6, nr6);
		keyMapping.put(7, nr7);
		keyMapping.put(8, nr8);
		keyMapping.put(9, nr9);
		
		System.out.println(keyMapping);
		
		
		printAllCompinations(args[0]);
		
		//MainClass mc = new MainClass();
		//mc.printFieldNames(mc);
		
	
		
		

	}
	
	public static void printAllCompinations(String stringToMap){
		
		boolean dontSkip = true;
		
		for(int i = 0; i < 9; i++){
			int numberToMap = Character.getNumericValue(stringToMap.charAt(i));
				if(numberToMap <=1 || numberToMap>=10)
					dontSkip=false;
				else
					dontSkip=true;
				
			List<String> l = keyMapping.get(numberToMap);
			
			if(dontSkip)
				for(String s : l ){
					String attemp = stringToMap.substring(0, i)+
							s+stringToMap.substring(i+1,stringToMap.length());
					System.out.println(i + " "+ attemp);
					printAllCompinations(attemp);
				}
			
		}
		
	}
	
	


}
