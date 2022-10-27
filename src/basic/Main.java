package basic;

import java.util.*;
import java.lang.reflect.Array;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
	/* 기본 데이터 타입 */
		int i = 1;
		float f= 1.1f;
		double d = 1.2;
		boolean b = true;
		char c = 'a';
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(c);
	
	/* 레퍼런스 데이터 타입 */
		Integer ii = 1;
		Float ff = 1.1f;
		Double dd = 1.2;
		Boolean bb = true;
		Character cc = 'a';
		String s = "Hello World";
		System.out.println(ii);
		System.out.println(ff);
		System.out.println(dd);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(s);
	
	/* 배열 선언 */
		int[] arr = {1,2,3,4};
	
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		System.out.println(Arrays.toString(arr));

		Integer[] a = {1,2,3,4};
		System.out.println(a);
		System.out.println(a [1]);
		
	/* List 클래스 사용 */
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add("Hello");
		System.out.println(list);
		
	
	/* Generics 사용 */	
		ArrayList<String> list2 = new ArrayList <String>();
		list2.add("Hi");
		list2.add("I'm Happy");
		//list.add(123) -- Error
	
	/* Map 사용 */
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("one",  1);
		map.put("two", 2);
		System.out.println(map.get("one"));
		System.out.println(map.get("three")); //null
		System.out.println(map.containsKey("three"));
	    System.out.println(map.remove("one"));
	    System.out.println(map.get("one"));
	    System.out.println(map.size());
	    
	 /* if ~ else 문 */
	    int orange = 3;
	    
	    if(orange == 1) {
	    	System.out.println("1");
	    } else if(orange == 2) {
	    	System.out.println("2");
	    } else if(orange == 3) {
	    	System.out.println("3");
	    } else {
	    	System.out.println("else");
	    }
	    
	/* switch ~ case */
	      switch(orange){
	       case 1:
	              System. out.println("1" );
	              break;
	       case 2:
	              System. out.println("2" );
	              break;
	       case 3:
	              System. out.println("3" );
	              break;
	       default:
	              System. out.println("else" );
	              break;
	       }
	 
	 /* While */
	       int k = 0;
	      
	       while(k < 5){
	              k = k + 1;
	              //k++;
	              //k += 1;
	              System. out.println(k);
	       }
	       
	 /* for을 활용한 배열 순환*/
	       String[] numbers = {"one" , "two" , "three" };
	       for( int u =0; u<numbers.length; u++) {
	           System. out.println(numbers [u ]);
	       }
	       
	       for(String number : numbers ) {
	           System. out.println(number );
	       }
	}
	
}
