package exemplo_colections;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		List<Minerio> lista = new ArrayList<Minerio>();
		
		Minerio m1 = new Minerio("Ouro",  1000, "Grama");
		Minerio m2 = new Minerio("Ferro", 90, "Kilo");
		Minerio m3 = new Minerio("Tungstênio", 300, "Tonelada");
		
		lista.add(m1);
		lista.add(m2);
		lista.add(m3);
		
		int i = lista.indexOf(m2);
		
		if(i>=0) {
			System.out.println("Achei! " + lista.get(i).getNome());
		}
		
		lista.remove(i);

		
		List<Minerio> lista2 = new ArrayList<Minerio>();
		
		lista2.add(m3);
		
		List<Minerio> lista3 = new ArrayList<Minerio>();
		
		lista3.addAll(lista);
		lista3.addAll(lista2);

		for(Minerio m : lista3) {
			System.out.println(m.getNome());
		}

	}

}
