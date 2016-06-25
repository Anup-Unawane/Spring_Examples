package spring.dao.daotest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;


public class StudentDAOImplJDBC implements StudentDAO 
{
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}	
	
	@Override
	public int save(Student st) throws Exception 
	{
		Connection con = dataSource.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement("insert into student values (?,?,?,?)");
		pstmt.setInt(1, st.getId());
		pstmt.setString(2, st.getName());
		pstmt.setString(3, st.getEmail());
		pstmt.setString(4, st.getAddress());
		int i = pstmt.executeUpdate();
		System.out.println("i:" + i);
		con.close();
		return i;
	}

	@Override
	public boolean update(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Student findByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByAddress(String address) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
