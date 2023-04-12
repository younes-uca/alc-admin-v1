package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.TypeReclamationEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeReclamationEtudiantHistoryDao extends AbstractHistoryRepository<TypeReclamationEtudiantHistory,Long> {

}
