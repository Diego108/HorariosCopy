package br.com.horario.tarefas;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.horario.beans.tabelas.HorarioBeanValidation;
import br.com.horario.dao.modelo.JdbcTarefasHorario;

@Controller
public class TarefasHorarios {

	@RequestMapping("novoHorario")
	public String novo() {

		return "adiciona";
	}

	@RequestMapping("adicionaHorario")
	public String add(@Valid HorarioBeanValidation horario, BindingResult result) {

		if (result.hasErrors()) {

			return "index";
		} else {

			JdbcTarefasHorario daoTarefas = new JdbcTarefasHorario();
			daoTarefas.adicionar(horario);
			return "concluido";
		}
	}
}
