package br.com.teste_pratico.regispro.repositories;

import br.com.teste_pratico.regispro.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
