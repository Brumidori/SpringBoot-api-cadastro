package med.voll.api.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

//Entre <>, passaremos dois tipos de objeto.
//O primeiro será o tipo da entidade trabalhada pelo repository, Medico, e o tipo do atributo da chave primária
// da entidade, Long. A interface está criada:
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
