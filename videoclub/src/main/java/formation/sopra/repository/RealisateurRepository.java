package formation.sopra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import formation.sopra.entity.Realisateur;

public interface RealisateurRepository extends JpaRepository<Realisateur, Long>{

	
	Optional<Realisateur> findByNom (String nom);
}

