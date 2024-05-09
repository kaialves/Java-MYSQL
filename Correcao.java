package exemplo_colections;

import java.util.ArrayList;
import java.util.List;

public class Correcao {

	public static void main(String[] args) {
		
		Minerio m1 = new Minerio("Ouro", 400, "grama");
		Minerio m2 = new Minerio("Ferro", 1.2, "Kilo");
		Minerio m3 = new Minerio("Prata", 30, "Tonelada");
		Minerio m4 = new Minerio("Vibranium", 60, "Kilo");
		Minerio m5 = new Minerio("Tungstênio", 20, "Grama");
		
		List<Minerio> lista = new ArrayList<Minerio>();
		
		lista.add(m1);
		lista.add(m2);
		lista.add(m3);
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println("Listando " +lista.get(i).getNome());
		}
		
		int k = lista.indexOf(m2);
		if (k >= 0) {
			System.out.println("Encontrado: " + lista.get(k).getNome());
			System.out.println("Removendo " + lista.get(k).getNome());
			lista.remove(k);
		}
		else 
			System.out.println("Não encontrado");
		
		List<Minerio> lista2 = new ArrayList<Minerio>();
		lista2.add(m4);
		lista2.add(m5);
		
		lista2.addAll(lista);
		
		for(Minerio m : lista2) {
			System.out.println("Na Lista 2 " + m.getNome());
		}

	}

}
