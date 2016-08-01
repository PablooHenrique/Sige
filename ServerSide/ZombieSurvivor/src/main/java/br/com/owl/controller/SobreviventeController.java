package br.com.owl.controller;

import com.google.gson.Gson;

import br.com.owl.dao.SobreviventeDao;
import br.com.owl.models.Sobrevivente;

public class SobreviventeController {
	private SobreviventeDao sobreviventeDao = new SobreviventeDao();
	
	public void inicializarBanco(){
		sobreviventeDao.gerarBanco();
	}
	
	public void salvar(Sobrevivente sobrevivente){
		sobrevivente.setId(sobreviventeDao.getProximoId());
		sobreviventeDao.salvar(sobrevivente);
	}
	
	public String buscarTodosSobreviventes(){
		return new Gson().toJson(sobreviventeDao.getSobreviventes());
	}
	
	public String buscarSobreviventePorId(long id){
		return new Gson().toJson(sobreviventeDao.buscaSobreviventePorId(id));
	}
	
	public void marcarComoInfectado(long id){
		Sobrevivente sobrevivente = sobreviventeDao.buscaSobreviventePorId(id);
		if(sobrevivente.getNumeroIndicacoes() < 3){
			new SobreviventeDao().adicionarIndicacoes(sobrevivente.getId());
		}
		
		if(sobrevivente.getNumeroIndicacoes() == 3){
			sobreviventeDao.marcarComoInfectado(sobrevivente.getId());
		}
	}

	public void alterarlatitude(String latitude, long id) {
		sobreviventeDao.alterarLatitude(latitude, id);
	}
	
	public void alterarLongitude(String longitude, long id) {
		sobreviventeDao.alterarLongitude(longitude, id);
	}
	
	public void alterarLatitudeLongitude(String longitude, String latitude, long id){
		alterarlatitude(latitude, id);
		alterarLongitude(longitude, id);
	}
}
