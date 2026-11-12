package https.github.com.trabwlg.Patri.git.Patrimonio.repository;

import https.github.com.trabwlg.Patri.git.Patrimonio.model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.function.LongFunction;

@Repository
/*
public class PatrimonioRepository {
}
*/
public interface PatrimonioRepository extends JpaRepository<Patrimonio,Long> {
}
