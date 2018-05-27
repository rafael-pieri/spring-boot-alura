package br.com.alura.viplist.controller;

import br.com.alura.viplist.model.Guest;
import br.com.alura.viplist.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/guest-list")
    public String guestList(Model model) {
        model.addAttribute("guests", guestService.getGuestList());
        return "guest-list";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@RequestParam("name") String name, @RequestParam("email") String email,
                       @RequestParam("phone") String phone, Model model) {
        guestService.save(new Guest(name, email, phone));
        model.addAttribute("guests", guestService.getGuestList());
        return "guest-list";
    }
}