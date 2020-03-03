package br.com.rdsolutions.fjt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.rdsolutions.fjt.repositories.PtlMessageRepository;

@Controller
public class PtlMessageController {
	
	@Autowired
	private PtlMessageRepository ptlmRepository;
	
	@GetMapping("/")
	public String getMessages(Model model) {
		model.addAttribute("ptlMessages", ptlmRepository.findAll());
		return "messages";
	}

}
