package br.com.horario.dao.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.horario.beans.tabelas.HorarioBeanValidation;
import br.com.horario.jdbc.conexao.JdbcTarefasConexao;

public class JdbcTarefasHorario {

	Connection conexao;
	
	public JdbcTarefasHorario(){
		
		try {
			this.conexao = new JdbcTarefasConexao().getConexao();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
	public void adicionar(HorarioBeanValidation horario){
		
		try{
			
			String sql = "INSERT INTO hchegada_hsaida(chegada, horario, saida, horario_saida) VALUES(?, ?, ?, ?)";
			PreparedStatement statement = conexao.prepareStatement(sql);
			
				statement.setDate  (1, new Date(horario.getDataChegada().getTimeInMillis()));
				statement.setString(2, horario.getHorariochegada());
				statement.setDate  (3, new Date(horario.getDataSaida().getTimeInMillis()));
				statement.setString(4, horario.getHorarioSaida());
				
			statement.execute();
		}catch(SQLException e){
			
			throw new RuntimeException(e);
		}
	}
}
