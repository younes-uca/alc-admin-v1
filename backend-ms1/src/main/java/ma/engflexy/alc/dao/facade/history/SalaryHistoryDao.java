package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.SalaryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryHistoryDao extends AbstractHistoryRepository<SalaryHistory,Long> {

}
