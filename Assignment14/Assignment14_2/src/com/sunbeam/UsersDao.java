package com.sunbeam;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;

	public class UsersDao implements AutoCloseable {
		private Connection con;

		public UsersDao() {
			try {
				con = DBUtil.getConnetion();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public java.util.Date parse(String str) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date date = new Date();
			try {
			date = sdf.parse(str);
			} catch(Exception e) {
				e.printStackTrace();
			}
			return date;
		}

		//Display all elements
		public List<Users> findAll() throws SQLException{
			List<Users> list = new ArrayList<>();
			String sql = "SELECT * FROM users";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						Users user = new Users();
						user.setId(rs.getInt("id"));
						user.setFname(rs.getString("first_name"));
						user.setLname(rs.getString("last_name"));
						user.setEmail(rs.getString("email"));
						user.setPass(rs.getString("password"));
						user.setStatus(rs.getBoolean("status"));
						user.setRole(rs.getString("role"));
						java.util.Date jDate =  rs.getDate("dob");
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						String bdate = sdf.format(jDate);
						user.setDate(bdate);
						list.add(user);
					}
				} 
			}
			return list;
		}
		
		
		
		//Add a user
		public int addUser(Users u) throws SQLException{
			String sql = "INSERT INTO users VALUES(default, ?, ?, ? , ? , ?, ?, ?)";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				
				stmt.setString(1, u.getFname());
				stmt.setString(2, u.getLname());
				stmt.setString(3, u.getEmail());
				stmt.setString(4, u.getPass());
				java.util.Date date = parse(u.getDate());
				java.sql.Date sqlDate = new java.sql.Date( date.getTime() );
				stmt.setDate(5, sqlDate);
				stmt.setBoolean(6, u.isStatus());
				stmt.setString(7, u.getRole());
				int cnt = stmt.executeUpdate();
				
				return cnt;
			}
		}
		//Delete by Id
				public int deleteById(int id) throws SQLException{
					String sql = "DELETE FROM users WHERE id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						stmt.setInt(1, id);
						int cnt = stmt.executeUpdate();
						return cnt;
					}
				}
		
		
		
		public int updateUser(Users u) throws SQLException{
			String sql = "UPDATE users SET first_name = ?, last_name = ?, email = ?, password = ?, dob = ?, status = ?, role = ? WHERE id = ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				
				stmt.setString(1, u.getFname());
				stmt.setString(2, u.getLname());
				stmt.setString(3, u.getEmail());
				stmt.setString(4, u.getPass());
				java.util.Date date = parse(u.getDate());
				java.sql.Date sqlDate = new java.sql.Date( date.getTime() );
				stmt.setDate(5, sqlDate);
				stmt.setBoolean(6, u.isStatus());
				stmt.setString(7, u.getRole());
				stmt.setInt(8, u.getId());
				int cnt = stmt.executeUpdate();
				
				return cnt;
			}
		}
		//Change User Status by Id
				public int changeStatusById(int id) throws SQLException{
					String sql = "UPDATE users SET status = true WHERE id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						stmt.setInt(1, id);
						int cnt = stmt.executeUpdate();
						return cnt;
					}
				}
		
		@Override
		public void close() {
			try {
				if(con != null) {
					con.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

