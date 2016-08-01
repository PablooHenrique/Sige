package br.com.owl.controller;

import java.util.List;

import br.com.owl.dao.SobreviventeDao;
import br.com.owl.models.Sobrevivente;

public class Start {
	public static void main(String[] args) {
		
		SobreviventeDao dao = new SobreviventeDao();
		dao.gerarBanco();
		List<Sobrevivente> sobre = dao.getSobreviventes(); 
		
		for (Sobrevivente sobrevivente : sobre) {
			
			System.out.println(sobrevivente.getId() +" - "+ sobrevivente.getNome());
		}
			

		

		
		
	}
}
