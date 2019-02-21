package formation.sopra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import formation.sopra.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
	
//	@Query("select p from Film p left join fetch p.realisateur")
//	List<Film> findAllWithReal();
	


	
}
