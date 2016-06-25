package spring.dao.springorm;

import java.util.List;

public interface StudentDAOInterface {
	public int save(Student st) throws Exception;
	public boolean update(Student st) throws Exception;
	public boolean delete(Student st) throws Exception;
	public Student findByPK(int id) throws Exception;
	public List<?> findAllUsingHQL() throws Exception;
	List<?> findAllUsingCriteria() throws Exception;
}
