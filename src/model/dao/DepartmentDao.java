package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert (Department obj);  // vai inserir este objeto no banco de dados
	void update (Department obj);
	void DeleteById (Integer id);
	Department findById(Integer id);    //responsavel por  consultar se existe o objeto id no banco (se tiver vai retornar, se nao, vai retornar nulo
	List<Department> findall();
	

}
