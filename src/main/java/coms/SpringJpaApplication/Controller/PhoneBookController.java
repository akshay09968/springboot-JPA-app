package coms.SpringJpaApplication.Controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import coms.SpringJpaApplication.service.PhoneBookService;
import coms.SpringJpaApplication.model.PhoneBook;

@Controller
public class PhoneBookController {
	
	@Autowired
	PhoneBookService pbs;
	
	@GetMapping("/newcustomer")
	public String AddNewCustomer(Model m) {
		return "AddNewCustomer";
	}
		
	@PostMapping("/addnewcustomer")
	public String AddNewCustomer(@RequestParam("txtPname") String pname,
			@RequestParam("txtPhone") String phone,
			@RequestParam("txtEmail") String email,
			Model m) {
		System.out.println(pname+" "+phone+" "+email);
		
		PhoneBook pb = new PhoneBook();
		
		pb.setPname(pname);
		pb.setPhone(phone);
		pb.setEmail(email);
		
		String res = pbs.AddPhoneBook(pb);
		if(res.equals("Success")) 
			m.addAttribute("msg","Added new personal details");
		else 
			m.addAttribute("msg","Error");
		
		return "AddNewCustomer";
	}
	
	@GetMapping("/showall")
	public String ShowAllCustomers(Model m) {
		List<PhoneBook> allcustomers = pbs.ShowAll();
		m.addAttribute("vall",allcustomers);
		return "ShowAllCustomers";
	}
	
	@GetMapping("/search")
	public String SearchCustomer(Model m) {
		return "SearchCustomer";
	}
	
	@PostMapping("/fetchinfo")
	public String SearchCustomer(@RequestParam("txtSearch") Integer cid, Model m) {
		PhoneBook pb = pbs.searchPhone(cid);
		if(pb!=null)
			m.addAttribute("pb", pb);
		else
			m.addAttribute("msg","Customer not found");
		return "SearchCustomer";
	}
	
	@GetMapping("/delete")
	public String DeleteCustomer(Model m) {
		return "DeleteCustomer";
	}
	
	@PostMapping("/deleteCustomer")
	public String DeleteCustomer(@RequestParam("txtSearch") Integer cid, Model m) {
		String res = pbs.DeletePhoneBook(cid);
		if(res.equalsIgnoreCase("Success"))
			 m.addAttribute("msg","Deleted the customer successfully");
		else
			m.addAttribute("msg","Customer not Found");
		return "DeleteCustomer";
	}
	
	@GetMapping("/modify")
	public String ModCustomer(Model m) {
		
		return "ModifyCustomer";
	}
	
	@PostMapping("/getinfo")
	public String ModCustomer(@RequestParam("txtSearch") Integer cid, Model m) {
		PhoneBook pb = pbs.searchPhone(cid);
		if(pb!=null) {
			m.addAttribute("pinfo",pb);
			return "UpdateCustomer";
		}else
			m.addAttribute("msg","Customer not found.....");
		
		return "ModifyCustomer";
	}
	
	@PostMapping("/updateinfo")
	public String UpdateCustomer(@RequestParam("txtCid") Integer cid , 
			@RequestParam("txtPname") String pname,
			@RequestParam("txtPhone") String phone,
			@RequestParam("txtEmail") String email,
			Model m) 
	{
		PhoneBook pb = new PhoneBook();
		pb.setCustID(cid);
		pb.setPname(pname);
		pb.setPhone(phone);
		pb.setEmail(email);
		
		String res = pbs.UpdatePhoneBook(pb);
		
		if(res.equalsIgnoreCase("Success"))
//			return "redirect:/showall";
//			return "ShowAllCustomer";
			m.addAttribute("msg", "Customer is updated");
		else
			m.addAttribute("msg","Not updated");
		return "UpdateCustomer";
	}
}









