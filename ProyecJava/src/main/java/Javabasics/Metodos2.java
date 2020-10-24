package Javabasics;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
	protected static String heredar = "Mensaje de texto";
	public List<String> listaDeNombres(){
		List<String> listaNombres = new ArrayList<>();
		    listaNombres.add("Michel");
		    listaNombres.add("Lizeth");
		    listaNombres.add("Zazhil");
		    listaNombres.add("Juan");
		    listaNombres.add("Leticia");
		    listaNombres.add("Jimena");
		    listaNombres.add("Juan");
		return listaNombres;
	}
	
	public List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(5);
		listaNumeros.add(10);
		listaNumeros.add(20);
		listaNumeros.add(53);
		listaNumeros.add(10);
		listaNumeros.add(1);
		listaNumeros.add(8);
		return listaNumeros;
	}
}
