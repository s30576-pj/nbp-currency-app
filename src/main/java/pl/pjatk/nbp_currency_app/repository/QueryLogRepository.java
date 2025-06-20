package pl.pjatk.nbp_currency_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.nbp_currency_app.model.QueryLog;

@Repository
public interface QueryLogRepository extends JpaRepository<QueryLog, Integer> {
}
