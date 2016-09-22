package prob4;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.foreach(consumer);
		
		
	}
	
	//implement a Consumer
	Consumer<String> consumer=new Consumer<String>(){
		@Override
		public void accept(String s){
			System.out.println(s.toUpperCase());
		}
	}
	
}