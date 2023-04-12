package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.StatutFreeTrial;
import ma.engflexy.alc.bean.history.StatutFreeTrialHistory;
import ma.engflexy.alc.dao.criteria.core.StatutFreeTrialCriteria;
import ma.engflexy.alc.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.StatutFreeTrialDao;
import ma.engflexy.alc.dao.facade.history.StatutFreeTrialHistoryDao;
import ma.engflexy.alc.dao.specification.core.StatutFreeTrialSpecification;
import ma.engflexy.alc.service.facade.admin.StatutFreeTrialAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class StatutFreeTrialAdminServiceImpl extends AbstractServiceImpl<StatutFreeTrial,StatutFreeTrialHistory, StatutFreeTrialCriteria, StatutFreeTrialHistoryCriteria, StatutFreeTrialDao,
StatutFreeTrialHistoryDao> implements StatutFreeTrialAdminService {


    public StatutFreeTrial findByReferenceEntity(StatutFreeTrial t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(StatutFreeTrial.class,StatutFreeTrialHistory.class, StatutFreeTrialHistoryCriteria.class, StatutFreeTrialSpecification.class);
    }

    public StatutFreeTrialAdminServiceImpl(StatutFreeTrialDao dao, StatutFreeTrialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}