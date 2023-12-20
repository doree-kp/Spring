package doree.classtp2.repository;

import doree.classtp2.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduitRepository extends JpaRepository<Produit, Long> {
}
