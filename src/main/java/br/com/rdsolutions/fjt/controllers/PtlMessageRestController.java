package br.com.rdsolutions.fjt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rdsolutions.fjt.models.PtlMessage;
import br.com.rdsolutions.fjt.repositories.PtlMessageRepository;

@CrossOrigin(origins = "*")
@RestController
public class PtlMessageRestController {

	@Autowired
	private PtlMessageRepository ptlmRepository;
	
	@GetMapping("/api/v1/messages")
	public Iterable<PtlMessage> getAllPtlMessages() {
		return ptlmRepository.findAll();
	}
	
}
