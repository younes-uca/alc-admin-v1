package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomHistoryDao extends AbstractHistoryRepository<ClassRoomHistory,Long> {

}
