package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.edu.model.Staff;

@Controller
public class DetailController {
	@RequestMapping("/poly/staff-detail")
	public String detail(Model model) {
		Staff staff = Staff.builder().id("user@gmail.com").fullname("nguyễn văn user").level(2)
//	.photo("staff.png")
				.build();
		model.addAttribute("staff", staff);
		return "/poly/staff-detail";
	}
}
