package com.btc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.btc.app.model.Employee;
import com.btc.app.model.User;
import com.btc.app.ui.UserAppUI;


public class UserDaoJdbcImpl implements UserDao {

	private Connection con;

	private PreparedStatement smt;
	public Scanner scanner=new Scanner(System.in);


	public UserDaoJdbcImpl() throws SQLException {
		con=ConnectionUtil.getDbConnection();
	}

	@Override
	public User addUser(User user) throws SQLException, InvalidIdException {
		String query1="select count(*) from user where userid=?";
		smt=con.prepareStatement(query1);
		smt.setInt(1, user.getUserid());	
		ResultSet c1=smt.executeQuery();
		c1.next();
		int count=c1.getInt(1);
		System.out.println("Total"+count);

		if(count>0)
		{
			throw new InvalidIdException("Data already present");
		}

		//new code ends

		String query = "insert into user values(?,?,?,?)";


		smt= con.prepareStatement(query);

		smt.setInt(1, user.getUserid());
		smt.setString(2, user.getUsername());
		smt.setString(3, user.getPassword());
		smt.setString(4, user.getFavCategory());

		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return user;
		}
		return null;
	}
	public User readNews(int userId) throws SQLException, InvalidIdException {
		//new code
		String query1="select count(*) from user where userId=? and password=?";
		smt=con.prepareStatement(query1);
		System.out.println("Enter password:");
		String password1=scanner.next();
		smt.setInt(1, userId);	
		smt.setString(2,password1);
		ResultSet c1=smt.executeQuery();
		c1.next();
		int count=c1.getInt(1);
		//System.out.println("Total"+count);
		if(count<1)
		{
			throw new InvalidIdException("User Id doesnot exist");
		}
		//ends

		String query="select * from user where userId=?";
		smt=con.prepareStatement(query);

		smt.setInt(1, userId);	

		ResultSet queryResult = smt.executeQuery();

		User user=null;

		if(queryResult.next()) {
			user=new User();
			user.setUserid(userId);
			user.setUsername(queryResult.getString("username"));
			user.setPassword(queryResult.getString("password"));
			user.setFavCategory(queryResult.getString("FavCategory"));
		}

		String favCat=queryResult.getString("FavCategory");
		System.out.print("Favorite category="+queryResult.getString("FavCategory"));

		//new code
		while(true)
		{
			int option;
			System.out.println();
			System.out.println("Enter option");
			System.out.println("1.FAvorite article\t 2.All article\t 3.Recommended Article\t 4.Exit");
			option=scanner.nextInt();
			switch(option)
			{
			case 1:System.out.println("Favorite category");
			//favCategory();
			System.out.println(favCat);

			//newcode


			try{
				String queryfav="select title from news where category=?";
				smt=con.prepareStatement(queryfav);
				smt.setString(1,favCat);
				ResultSet rs=smt.executeQuery();
				System.out.println("News Title");
				// HashMap<String>
				List<String> newsBTC=new ArrayList<>();
				while(rs.next()){

					System.out.println(rs.getString("title")+"\t");
					newsBTC.add(rs.getString("title"));
				}
				int num=1;
				while(num!=0)
				{
					//newsBTC.forEach(title->System.out.println(title));
					System.out.println("Enter news to read");
					String desc=scanner.next();
					scanner.nextLine();
					//whether title exist or not

					String querytitle="select count(*) from news where title=?";
					smt=con.prepareStatement(querytitle);
					smt.setString(1,desc);
					ResultSet queryTitle=smt.executeQuery();
					queryTitle.next();
					int countTitle=queryTitle.getInt(1);
					//System.out.println("Total"+count);
					if(countTitle<1)
					{
						System.out.println("News title doesnot exist");
						//throw new InvalidIdException("Content doesnot exist");
					}

					String descquery="select content from news where title=?";
					smt=con.prepareStatement(descquery);
					smt.setString(1,desc);
					ResultSet rs1=smt.executeQuery();
					// System.out.println(rs1);
					while(rs1.next())
					{
						System.out.println(rs1.getString("content")+"\t");
						//new code
						System.out.println("Did you like the content,if(yes) press 1 else press 0");
						int like=scanner.nextInt();
						if(like==1)
						{
							String likeSQL="update news set likecount=likecount+1 where title=?";
							smt=con.prepareStatement(likeSQL);
							//Employee emp=null;
							smt.setString(1, desc);
							smt.executeUpdate();
							System.out.println("databse updated successfully");
						}
					}
					// close ResultSet rs
					System.out.println("1.Continue 0.exit");
					//System.out.println();
					num=scanner.nextInt();
					rs1.close();
				}
				// rs1.close();
				rs.close();
			} catch(SQLException s){						
				s.printStackTrace();
			}



			//return user;
			break;
			case 2:System.out.println("Read All news");

			//new code
			try{

				String queryCat="select category from news group by category";
				smt=con.prepareStatement(queryCat);
				//smt.setString(1,favCat);
				ResultSet rs=smt.executeQuery();
				// System.out.println("News Title");
				// HashMap<String>
				List<String> newsBTC=new ArrayList<>();
				while(rs.next()){

					System.out.println(rs.getString("category")+"\t");
					//newsBTC.add(rs.getString("category"));
				}
				System.out.println("Please select the category");
				String selectCat=scanner.next();
				scanner.nextLine();
				String queryfav="select title from news where category=?";
				smt=con.prepareStatement(queryfav);
				smt.setString(1,selectCat);
				ResultSet rs1=smt.executeQuery();
				System.out.println("News Title");
				// HashMap<String>
				List<String> newsBTC1=new ArrayList<>();
				while(rs1.next()){

					System.out.println(rs1.getString("title")+"\t");
					newsBTC.add(rs1.getString("title"));
				}
				int num=1;
				while(num!=0)
				{
					//newsBTC.forEach(title->System.out.println(title));
					System.out.println("Enter news to read");
					String desc=scanner.next();
					scanner.nextLine();
					//whether title exist or not

					String querytitle="select count(*) from news where title=?";
					smt=con.prepareStatement(querytitle);
					smt.setString(1,desc);
					ResultSet queryTitle=smt.executeQuery();
					queryTitle.next();
					int countTitle=queryTitle.getInt(1);
					//System.out.println("Total"+count);
					if(countTitle<1)
					{
						System.out.println("News title doesnot exist");
						//throw new InvalidIdException("Content doesnot exist");
					}





					String descquery="select content from news where title=?";
					smt=con.prepareStatement(descquery);
					smt.setString(1,desc);
					ResultSet rs2=smt.executeQuery();
					// System.out.println(rs1);
					while(rs2.next())
					{
						System.out.println(rs2.getString("content")+"\t");
						System.out.println("Did you like the content,if(yes) press 1 else press 0");
						int like=scanner.nextInt();
						if(like==1)
						{
							String likeSQL="update news set likecount=likecount+1 where title=?";
							smt=con.prepareStatement(likeSQL);
							//Employee emp=null;
							smt.setString(1, desc);
							smt.executeUpdate();
							System.out.println("databse updated successfully");
						}

					}
					// close ResultSet rs
					System.out.println("1.Continue 0.exit");
					//System.out.println();
					num=scanner.nextInt();
					if(num==1)
					{
						System.out.println("News Title");
						newsBTC.forEach((k)->System.out.println(k));
					}
					rs2.close();
				}
				// rs1.close();
				rs.close();
			} catch(SQLException s){						
				s.printStackTrace();
			}





			break;
			case 3:System.out.println("Recomended News Articles");
			
			try
			{
			String recquery="select title from news where likecount>0";
			smt=con.prepareStatement(recquery);
			//smt.setString(1,desc);
			ResultSet rq1=smt.executeQuery();
			// System.out.println(rs1);
			List<String>recArt=new ArrayList<>();
			while(rq1.next())
			{
				System.out.println(rq1.getString("title")+"\t");
				recArt.add(rq1.getString("title"));
				
			}
			int no=1;
			while(no!=0)
			{
			System.out.println("Enter the news title to read content");
			String cont=scanner.next();
			scanner.nextLine();
			//title exist or not
			
			String querytitle="select count(*) from news where title=?";
			smt=con.prepareStatement(querytitle);
			smt.setString(1,cont);
			ResultSet queryTitle=smt.executeQuery();
			queryTitle.next();
			int countTitle=queryTitle.getInt(1);
			//System.out.println("Total"+count);
			if(countTitle<1)
			{
				System.out.println("News title doesnot exist");
				//throw new InvalidIdException("Content doesnot exist");
			}
			
			
			
			String descquery="select content from news where title=?";
			smt=con.prepareStatement(descquery);
			smt.setString(1,cont);
			ResultSet rq2=smt.executeQuery();
			// System.out.println(rs1);
			while(rq2.next())
			{
				System.out.println(rq2.getString("content")+"\t");
				System.out.println("Did you like the content,if(yes) press 1 else press 0");
				int like=scanner.nextInt();
				if(like==1)
				{
					String likeSQL="update news set likecount=likecount+1 where title=?";
					smt=con.prepareStatement(likeSQL);
					//Employee emp=null;
					smt.setString(1, cont);
					smt.executeUpdate();
					System.out.println("databse updated successfully");
				}
			}
				System.out.println("1.continue 0.Exit");
				no=scanner.nextInt();
				if(no==1)
				{
					System.out.println("News Title");
					recArt.forEach((k)->System.out.println(k));
				}
				
				rq2.close();
				
			}
			rq1.close();
			
			}
			catch(SQLException s){						
				s.printStackTrace();
			}
			break;
			case 4:System.exit(1);
			break;
			default:
				System.out.println("WRong option");
				//throw new IlleagalArgumentException("Wrong option")
			}
		}


		//return user;




	}




}