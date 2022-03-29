package io.github.joacirsoares.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.joacirsoares.vendasapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
