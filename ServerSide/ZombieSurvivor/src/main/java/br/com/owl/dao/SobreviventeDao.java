package br.com.owl.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.owl.models.Inventario;
import br.com.owl.models.Sexo;
import br.com.owl.models.Sobrevivente;

public class SobreviventeDao {
	public static List<Sobrevivente> sobreviventes = new ArrayList<Sobrevivente>();
	
	public int getProximoId(){
		int id = 0;
		for (Sobrevivente sobrevivente : sobreviventes) {
			if (sobrevivente.getId() > id) {
				id = sobrevivente.getId();
			}
		}
		return id + 1;
	}
	
	public void salvar(Sobrevivente sobrevivente){
		sobreviventes.add(sobrevivente);
	}
	
	public void gerarBanco(){
		sobreviventes.add(new Sobrevivente("José Carlos", Sexo.M, "40.76845836", "-74.20235372", 15, new Inventario(2,3,5,7), false));
		sobreviventes.add(new Sobrevivente("Gabriel", Sexo.M, "40.76845836", "-74.20235372", 15, new Inventario(8,6,7,8), false));
		sobreviventes.add(new Sobrevivente("Carlos José", Sexo.M, "40.76845836", "-74.20235372", 15, new Inventario(1,5,4,2), false));
		//sobreviventes.add(new Sobrevivente("Pablo Henrique", Sexo.M, "40.76845836", "-74.20235372", new Inventario(3,6,4,9), false));
		sobreviventes.add(new Sobrevivente("Figueredo", Sexo.M, "40.76845836", "-74.20235372",  15, new Inventario(5,6,9,8), false));
		sobreviventes.add(new Sobrevivente("Manoel", Sexo.M, "40.76845836", "-74.20235372", 15, new Inventario(5,7,5,1), false));
		sobreviventes.add(new Sobrevivente("Cintia", Sexo.F, "40.76845836", "-74.20235372", 15, new Inventario(5,8,9,6), false));
		sobreviventes.add(new Sobrevivente("Reeca", Sexo.F, "40.76845836", "-74.20235372", 15, new Inventario(5,8,3,3), false));
		
		for (Sobrevivente sobrevivente : sobreviventes) {
			sobrevivente.setId(getProximoId());
		}	
	}
	
	public List<Sobrevivente> getSobreviventes(){
		return sobreviventes;
	}
	
	
	public Sobrevivente buscaSobreviventePorId(long id){
		for (Sobrevivente sobrevivente : sobreviventes) {
			if (sobrevivente.getId() == id) {
				return sobrevivente;
			}
		}
		return null;
//	    List<Sobrevivente> list = sobreviventes.stream().filter(u -> u.getId() == id).collect(Collectors.toList());
//		return list.get(0);
	}

	
	public void marcarComoInfectado(long id){
		Sobrevivente sobrevivente = buscaSobreviventePorId(id);
		sobrevivente.setInfectado(true);
	}
	
	public void adicionarIndicacoes(int id){
		buscaSobreviventePorId(id).setNumeroIndicacoes(1);
	}

	public void alterarLatitude(String latitude, long id) {
		Sobrevivente sobrevivente = buscaSobreviventePorId(id);
		sobrevivente.setLatitude(latitude);
		
	}
	
	public void alterarLongitude(String longitude, long id) {
		Sobrevivente sobrevivente = buscaSobreviventePorId(id);
		sobrevivente.setLongitude(longitude);
		
	}
}
