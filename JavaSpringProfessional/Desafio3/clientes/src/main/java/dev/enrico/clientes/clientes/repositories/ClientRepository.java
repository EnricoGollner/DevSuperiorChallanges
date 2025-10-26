package dev.enrico.clientes.clientes.repositories;

import dev.enrico.clientes.clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
