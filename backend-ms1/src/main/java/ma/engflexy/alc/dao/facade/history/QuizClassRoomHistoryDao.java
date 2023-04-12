package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.QuizClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizClassRoomHistoryDao extends AbstractHistoryRepository<QuizClassRoomHistory,Long> {

}
