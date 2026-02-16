package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService { 
	
	
	//Injeção de dependencia
	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll(){
		return dao.findAll();//Trazer os dados do banco de dados
	}
	
	public void saveOrUpdate(Seller obj) {
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}

	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId()); //Remover um departamento do banco de dados
	}
}
