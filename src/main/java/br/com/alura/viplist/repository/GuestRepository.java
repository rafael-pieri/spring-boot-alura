package br.com.alura.viplist.repository;

import br.com.alura.viplist.model.Guest;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.Repository;

public interface GuestRepository extends Repository<Guest, Long> {

    Optional<Guest> findByName(String name);

    Optional<List<Guest>> findAll();

    Optional<Guest> save(Guest notification);
}