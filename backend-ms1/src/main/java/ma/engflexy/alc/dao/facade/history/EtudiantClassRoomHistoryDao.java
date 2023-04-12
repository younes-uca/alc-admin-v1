package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.EtudiantClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantClassRoomHistoryDao extends AbstractHistoryRepository<EtudiantClassRoomHistory,Long> {

}
