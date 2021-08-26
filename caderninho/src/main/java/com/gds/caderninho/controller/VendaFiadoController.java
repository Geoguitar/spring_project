package com.gds.caderninho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gds.caderninho.model.VendaFiado;

@Controller
@RequestMapping("/vendaFiado")
public class VendaFiadoController {

		@RequestMapping ("/novo")
		public String novo() {
			return "CadastroVendaFiado";
		}

		//Salvando no BD
		
		@RequestMapping(method = RequestMethod.POST)
		public void salvar(VendaFiado vendaFiados) { 
			
		}
}