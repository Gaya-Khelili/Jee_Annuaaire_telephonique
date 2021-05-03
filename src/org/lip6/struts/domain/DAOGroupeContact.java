package org.lip6.struts.domain;


import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DAOGroupeContact {
private final static String RESOURCE_JDBC = "java:comp/env/jdbc/dsMyDB";
	
	
	public String deleteGroup(String GroupeName) {
		try {
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection  = lDataSource.getConnection();
			Statement stmt =  (Statement) lConnection.createStatement();
			
			
			ResultSet rs2 = stmt.executeQuery(" SELECT CG.idcontactgroup from contactgroup CG WHERE CG.groupeName ='"+GroupeName+ "'");
			int idgroupcontact=0;
			while (rs2.next()){
				
				 idgroupcontact =rs2.getInt("idcontactgroup"); 
				
				
				
			}
		
		
		
			String requete1 =  " DELETE FROM contactgroupcontact WHERE idGroupContact = '" +
					+   idgroupcontact +"'" ;
					
			
			stmt.executeUpdate(requete1);
			
			String requete2 = "DELETE CG from contactgroup CG WHERE CG.groupeName = '"+GroupeName+"'" ;
			stmt.executeUpdate(requete2);
		
			return null;
		} 
		catch (NamingException e) {
		
			return "NamingException : " + e.getMessage();
		
		} catch (SQLException e) {

			return "SQLException : " + e.getMessage();
			
		}
			
	}
	
	
	
}
