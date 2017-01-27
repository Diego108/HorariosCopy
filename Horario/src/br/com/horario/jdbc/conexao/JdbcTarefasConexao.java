package br.com.horario.jdbc.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTarefasConexao {

	public Connection getConexao() throws SQLException, ClassNotFoundException{
		
					
		Class.forName("com.jdbc.mysql.Driver");
		return DriverManager.getConnection("jdbc:mysql:localhost/ponto", "root", "root");
	}
}
