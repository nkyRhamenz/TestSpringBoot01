package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SampleController {

	@Autowired
	private SampleService sampleService;

	@RequestMapping(path = "/sample", method = RequestMethod.GET)
	String index(Model model) {
		List<Uketuke> list = this.sampleService.getUketukeList();
	    model.addAttribute("list", list);
	    return "sample/index";
	}
	
	@RequestMapping(path = "/member",method = RequestMethod.GET)
	String member(Model model) {
		return "/sample/member";
	}
	
	@RequestMapping(path = "/member",method = RequestMethod.POST)
	String memberReg(Model model, @ModelAttribute UketukeForm uketukeForm) {
		this.sampleService.insertUketuke(model,uketukeForm);
		List<Uketuke> list = this.sampleService.getUketukeList();
		model.addAttribute("list", list);
		return "/sample/index";
	}
}
