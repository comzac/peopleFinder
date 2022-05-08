package com.zac.Tricking1sic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zac.Tricking1sic.service.TestService;
import com.zac.Tricking1sic.vo.TestVo;

@Controller
public class TestController {

	@RequestMapping(value = "/home")
	public String home() {
		System.out.println("home");
		return "index.html";
	}

	@ResponseBody
	@RequestMapping("/valueTest")
	public String valueTest() {
		String value = "테스트 String";
		return value;
	}

//	@RequestMapping("/test")
//	public ModelAndView test() throws Exception {
//		ModelAndView mav = new ModelAndView("test");
//		mav.addObject("name", "goddaehee");
//		List<String> testList = new ArrayList<String>();
//		testList.add("a");
//		testList.add("b");
//		testList.add("c");
//		mav.addObject("list", testList);
//		return mav;
//	}

	@RequestMapping("/thymeleafTest")
	public String thymeleafTest(Model model) {
		TestVo testModel = new TestVo("goddaehee", "갓대희");
		model.addAttribute("testModel", testModel);
		return "thymeleaf/thymeleafTest";
	}

	@Autowired
	TestService testService;

	@RequestMapping(value = "/test")
	public ModelAndView test() throws Exception {
		ModelAndView mav = new ModelAndView("test");
		List<TestVo> testList = testService.selectTest();
		mav.addObject("list", testList);
		return mav;
	}

}
