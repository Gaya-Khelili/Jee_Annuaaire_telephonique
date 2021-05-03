package org.lip6.struts.domain;


import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DAOContact {
private final static String RESOURCE_JDBC = "java:comp/env/jdbc/dsMyDB";
	
	

	public String addContact(final long id, final String firstName, final String lastName, final String email,
			final String street, final String city,final String zip,final String country,final String phonenumber
			,final String phonekind,final String groupname) {
		try {
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection  = lDataSource.getConnection();
			Statement stmt =  (Statement) lConnection.createStatement();
			
		    
			String requete0 = " INSERT INTO contact VALUES " +
					"(" + null+ ", '"+ lastName + "', '" + firstName +"', '" + email+ "')";
			
			 stmt.executeUpdate(requete0);
			 
			 
			 String requete1 = " INSERT INTO address  " +
						"( SELECT " + null + ", '"+ street + "', '" + 
						city +"', '" + zip+"', '"+ country+"', " + 
					 " C.idcontact FROM contact C WHERE C.email = '"+email+ "')";
			 
			    stmt.executeUpdate(requete1);
			
			 
			 String requete2 = " INSERT INTO contactgroup VALUES " +
						"(" + null + ", '"+ groupname + "')";
				stmt.executeUpdate(requete2);
				
			String requete3 = " INSERT INTO phonenumber  " + 
								"( SELECT " + null + ", '"+ phonekind+ "', '" +phonenumber+ "', " +
								 " C.idcontact FROM contact C WHERE C.email = '"+email+ "')";
			stmt.executeUpdate(requete3);
			
			ResultSet rs2 = stmt.executeQuery(" SELECT C.idcontact FROM contact C WHERE C.email = '"+email+ "'");
			int idcontact=0;
			while (rs2.next()){
				
				 idcontact =rs2.getInt("idcontact"); 
				
				
				
			}
		
			ResultSet rs =  stmt.executeQuery(" SELECT GC.idcontactgroup FROM contactgroup GC WHERE GC.groupename = '"+groupname+ "'");
			int  idgroupcontact=0 ;
			while (rs.next()){
				
				idgroupcontact = rs.getInt("idcontactgroup");
				System.out.println("idgroupecontact"+idgroupcontact);
				
				
			}
		
			 
			
	     	String requete4 =  " INSERT INTO contactgroupcontact VALUES " +
			"(" +   idcontact + ", '"+ idgroupcontact + "')";

			stmt.executeUpdate(requete4);
			
			return null;
		} catch (NamingException e) {
		
			return "NamingException : " + e.getMessage();
		
		} catch (SQLException e) {

			return "SQLException : " + e.getMessage();
			
		}
	}
	
	public String searchContact(String email,Contact contact,Address address,ContactGroup contactgroup,PhoneNumber phonenumber) {
		
		try {
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection  = lDataSource.getConnection();
			Statement ps = (Statement) lConnection.createStatement();
			ResultSet rs = ps.executeQuery("SELECT * from Contact WHERE email = '"+ email+"'");
			while (rs.next()){
				
				contact.setId(rs.getInt("idcontact")); 
				contact.setEmail( rs.getString("email"));
				contact.setFirstName(rs.getString("firstname"));
				contact.setLastName(rs.getString("lastname"));
				
			}
			
			
			ResultSet rs2 = ps.executeQuery("SELECT CG.* from contactgroup CG,contact C,contactgroupcontact CGC  WHERE CG.idcontactgroup  = CGC.idGroupContact AND CGC.idContact  = C.idcontact  AND C.email = '"+ email+"'");
			while (rs2.next()){
				contactgroup.setGroupId(rs2.getInt("idcontactgroup"));
				contactgroup.setGroupName(rs2.getString("groupename"));
				
			}
			
			ResultSet rs3 = ps.executeQuery("SELECT AD.* from address AD,contact C WHERE AD.idcontact = C.idcontact AND C.email = '"+ email+"'");
			while (rs3.next()){
				
				address.setId(rs3.getInt("idaddress")); 
				address.setStreet(rs3.getString("street"));
				address.setCity(rs3.getString("city"));
				address.setZip(rs3.getString("zip"));
				address.setCountry(rs3.getString("country"));
					
			}
			ResultSet rs1 = ps.executeQuery("SELECT PN.* from phonenumber PN, contact C WHERE PN.idcontact = C.idcontact AND C.email = '"+ email+"'");
			while (rs1.next()){
				
				phonenumber.setId(rs1.getInt("idPhoneNumber")); 
				phonenumber.setPhoneKind(rs1.getString("phonekind"));
				phonenumber.setPhoneNumber(rs1.getString("phoneNumber"));
				
			}
			return null;
		}
		 catch (NamingException e) {
		
			return "NamingException : " + e.getMessage();
		
		} catch (SQLException e) {

			return "SQLException : " + e.getMessage();
			
		}
	
	}
	
	public String updateContact(String email,String nom, String prenom) {
		try {
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection  = lDataSource.getConnection();
			Statement stmt =  (Statement) lConnection.createStatement();
			
		
			 
			String requete0 = "UPDATE Contact SET firstname = '"+nom+"' , lastname = '"+prenom+"' WHERE email = '"+ email+"'" ;
			
			stmt.executeUpdate(requete0);
			
		
		return null;
	} catch (NamingException e) {
	
		return "NamingException : " + e.getMessage();
	
	} catch (SQLException e) {

		return "SQLException : " + e.getMessage();
		
	}
		
			
	}
	
	
	public String deleteContact(String email) {
		try {
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection  = lDataSource.getConnection();
			Statement stmt =  (Statement) lConnection.createStatement();
			
			String requete2 = "DELETE AD from address AD,contact C WHERE AD.idcontact = C.idcontact AND C.email = '"+ email+"'" ;
			stmt.executeUpdate(requete2);
			String requete3 = "DELETE PN from phonenumber PN, contact C WHERE PN.idcontact = C.idcontact AND C.email = '"+ email+"'" ;

			stmt.executeUpdate(requete3);
			
			
			ResultSet rs2 = stmt.executeQuery(" SELECT C.idcontact FROM contact C WHERE C.email = '"+email+ "'");
			int idcontact=0;
			while (rs2.next()){
				
				 idcontact =rs2.getInt("idcontact"); 
				
				
				
			}
		
		
		
			String requete4 =  " DELETE FROM   contactgroupcontact WHERE idcontact = '" +
					+   idcontact +"'" ;
					
			
			 stmt.executeUpdate(requete4);
			 
			String requete0 = "DELETE from Contact WHERE email = '"+ email+"'" ;
			
			stmt.executeUpdate(requete0);
			
		
			return null;
		} 
		catch (NamingException e) {
		
			return "NamingException : " + e.getMessage();
		
		} catch (SQLException e) {

			return "SQLException : " + e.getMessage();
			
		}
			
	}
	
	
	
}
