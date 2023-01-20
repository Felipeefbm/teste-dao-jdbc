package model.dao.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{  // implementa a interface DepartmentDao junto com os metodos
	
	private Connection conn; 


	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}


	@Override
	public void insert(Department obj) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void DeleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Department findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT * FROM department WHERE Id = ?");
			st.setInt(1,id);
			rs = st.executeQuery();
			if(rs.next()) {
				Department obj = new Department();
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				
				return obj;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
	


	@Override
	public List<Department> findall() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
