package formation.sopra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import formation.sopra.entity.Realisateur;

@Repository
public interface RealisateurRepository extends JpaRepository<Realisateur, Long>{

	
	Optional<Realisateur> findByNom (String nom);
}

