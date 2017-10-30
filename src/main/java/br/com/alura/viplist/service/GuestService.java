package br.com.alura.viplist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.viplist.model.Guest;
import br.com.alura.viplist.repository.GuestRepository;

@Service
public class GuestService {

	@Autowired
	private GuestRepository guestRepository;

	public Iterable<Guest> getGuestList() {

		return guestRepository.findAll();
	}

	public void save(Guest guest) {
		guestRepository.save(guest);
	}

}
