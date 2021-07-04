package br.com.rtorres.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Date;
//import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	Empresa emp = null;
	static {
		Empresa empresa = new Empresa("Alura",new Date());
//		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa("Rtorres", new Date());
//		empresa2.setNome("Rtorres");
		lista.add(empresa);
		lista.add(empresa2);		
	}
	
	public void adiciona(Empresa empresa) {
		
		Banco.lista.add(empresa);
	}
	public List<Empresa> getEmpresa(){
		return Banco.lista;
	}
	public void remove(Integer id) {
		
		//Nao pode alterar uma lista dentro de um loop
		lista.forEach(empresa->{if(empresa.getId() == id) emp = empresa;});
		lista.remove(emp);
		
//		for (Empresa empresa : lista) {if(empresa.getId()==id) emp = empresa;}
//		lista.remove(emp);
		
		
//		Iterator<Empresa> it = lista.iterator();		
//		while(it.hasNext()) {
//			Empresa emp = it.next();
//			if(emp.getId() == id) it.remove();
//		}	
		
		
	}

}
