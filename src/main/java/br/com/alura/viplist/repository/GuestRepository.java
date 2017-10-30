package br.com.alura.viplist.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.viplist.model.Guest;

public interface GuestRepository extends CrudRepository<Guest, Long> {
	
	List<Guest> findByName(String name);
}
