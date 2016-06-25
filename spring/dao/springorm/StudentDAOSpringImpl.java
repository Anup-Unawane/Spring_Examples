package spring.dao.springorm;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class StudentDAOSpringImpl implements StudentDAOInterface 
{
	private HibernateTemplate hibernateTemplate;
		
	@Override
	public int save(Student st) throws Exception 
	{
		Serializable s = hibernateTemplate.save(st);
		return 1;
	}

	@Override
	public boolean update(Student st) throws Exception {
		hibernateTemplate.update(st);
		return true;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		hibernateTemplate.delete(st);
		return true;
	}

	@Override
	public List<?> findAllUsingHQL() throws Exception {
		return hibernateTemplate.find(" from Student");
	}
	
	@Override
	public List<?> findAllUsingCriteria() throws Exception {
		DetachedCriteria cr = DetachedCriteria.forClass(Student.class);
		return hibernateTemplate.findByCriteria(cr);
	}

	@Override
	public Student findByPK(int id) throws Exception {
		Student st =  hibernateTemplate.get(Student.class, id);
		return st;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



}
