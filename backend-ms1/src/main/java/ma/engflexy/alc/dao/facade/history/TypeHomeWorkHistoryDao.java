package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.TypeHomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeHomeWorkHistoryDao extends AbstractHistoryRepository<TypeHomeWorkHistory,Long> {

}
