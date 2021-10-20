package za.ac.mycput.studentmarks.repository.results;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.studentmarks.entity.results.Results;

@Repository
public interface ResultRepository extends JpaRepository<Results, Integer> {
}
