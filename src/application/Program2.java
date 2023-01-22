package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		
		System.out.println("=== TEST 1: findById ====");
		Department findDep = departmentDao.findById(2);
		System.out.println(findDep);

		System.out.println("\n=== TEST 2: findAll ===");
		List<Department> allDep = departmentDao.findAll();
		for(Department obj :allDep) {
			System.out.println(obj);
		}
		
	/*	System.out.println("\n=== TEST 3: insert ===");
		Department insertDep = new Department(null, "Movies");
		departmentDao.insert(insertDep);
		System.out.println("Inserted! New id: " + insertDep.getId());  */
		
		System.out.println("\n === TEST 4: update ===");
		Department updateDep = departmentDao.findById(12);
		updateDep.setName("Games");
		departmentDao.update(updateDep);
		System.out.println("Update completed");
		
		
		System.out.println("\n === TEST 5: delete ===");
		System.out.println("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
