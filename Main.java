package exemplo_colections;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Olá ");
		lista.add("mundo");
		lista.add("!");
		
		for(String s : lista) {
			System.out.print(s);
		} 
	} 
}


