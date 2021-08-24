package com.gds.caderninho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VendaFiadoCotroller {

		@RequestMapping ("/vendaFiado/novo")
		public String novo() {
			return "CadastroVendaFiado";
		}
	
}
