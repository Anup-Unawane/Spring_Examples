package spring.dao.daotest;

import java.util.List;

public interface StudentDAO {
	public int save(Student st) throws Exception;
	public boolean update(Student st) throws Exception;
	public boolean delete(Student st) throws Exception;
	public Student findByPK(int id) throws Exception;
	public List<Student> findByName(String name) throws Exception;
	public Student findByEmail(String email) throws Exception;
	public Student findByAddress(String address) throws Exception;
	public List<Student> findAll() throws Exception;
}
