package io.github.joacirsoares.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.joacirsoares.vendasapi.model.ItemVenda;

public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {

}