package spring.dao.daotest;

public class StudentBOImpl implements StudentBO {

	StudentDAO dao = null;
	
	@Override
	public int saveStudent(Student st) {
		try {
			return dao.save(st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public StudentDAO getDao() {
		return dao;
	}

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

}
