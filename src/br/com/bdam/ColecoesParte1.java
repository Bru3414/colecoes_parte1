package br.com.bdam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColecoesParte1 {

	public static void main(String[] args) {
		exibeLista();
	}
	
	public static void exibeLista() {
		List<String> lista = new ArrayList<String>();
		lista.add("Bruno");
		lista.add("Jorge");
		lista.add("Ana");
		lista.add("Carlos");
		Collections.sort(lista);
		System.out.print(lista);
	}

}
