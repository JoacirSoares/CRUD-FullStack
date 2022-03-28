package io.github.joacirsoares.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.joacirsoares.vendasapi.model.Produto;

/* Classe que realiza operações com a entidade produto no banco de dados */
/* Padrão do JPA */

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
