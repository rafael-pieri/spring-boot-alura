package br.com.alura.viplist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.alura.emailsender.service.EmailService;
import br.com.alura.viplist.model.Guest;
import br.com.alura.viplist.service.GuestService;

@Controller
public class GuestController {

	@Autowired
	private GuestService guestService;

	@Autowired
	private EmailService emailSender;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("guestlist")
	public String guestList(Model model) {

		Iterable<Guest> guests = guestService.getAllGuests();

		model.addAttribute("guests", guests);

		return "guestlist";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("phone") String phone, Model model) {

		Guest newGuest = new Guest(name, email, phone);

		guestService.save(newGuest);

		emailSender.send(email, "VIP List", "You are invited to VIP List.");

		Iterable<Guest> guests = guestService.getAllGuests();

		model.addAttribute("guests", guests);

		return "guestlist";
	}

}
