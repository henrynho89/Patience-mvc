package org.oukiba.patient.web;

import org.oukiba.patient.dao.PatienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatienceController {
	@Autowired
	PatienceRepository patienceRepository;
	
	@GetMapping("/patiences")
	public String getPatience(Model model){
		model.addAttribute("listPatiences", patienceRepository.findAll());
		return "patience/patiences";
	}

}
