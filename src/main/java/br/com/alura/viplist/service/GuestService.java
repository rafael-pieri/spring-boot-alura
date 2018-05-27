package br.com.alura.viplist.service;

import br.com.alura.viplist.model.Guest;
import br.com.alura.viplist.repository.GuestRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService {

	@Autowired
	private GuestRepository guestRepository;

	public List<Guest> getGuestList() {
		return guestRepository.findAll().orElseThrow(RuntimeException::new);
	}

	public void save(Guest guest) {
		guestRepository.save(guest);
	}
}