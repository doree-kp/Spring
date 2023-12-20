package doree.classtp2.repository;

import doree.classtp2.entity.Categorie;
import doree.classtp2.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategorieRepository extends JpaRepository<Categorie, Long> {
}
