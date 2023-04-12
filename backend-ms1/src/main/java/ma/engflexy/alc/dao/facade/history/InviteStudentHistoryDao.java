package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.InviteStudentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InviteStudentHistoryDao extends AbstractHistoryRepository<InviteStudentHistory,Long> {

}
