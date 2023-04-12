package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.WorkloadBonus;
import ma.engflexy.alc.bean.history.WorkloadBonusHistory;
import ma.engflexy.alc.dao.criteria.core.WorkloadBonusCriteria;
import ma.engflexy.alc.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.WorkloadBonusDao;
import ma.engflexy.alc.dao.facade.history.WorkloadBonusHistoryDao;
import ma.engflexy.alc.dao.specification.core.WorkloadBonusSpecification;
import ma.engflexy.alc.service.facade.admin.WorkloadBonusAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class WorkloadBonusAdminServiceImpl extends AbstractServiceImpl<WorkloadBonus,WorkloadBonusHistory, WorkloadBonusCriteria, WorkloadBonusHistoryCriteria, WorkloadBonusDao,
WorkloadBonusHistoryDao> implements WorkloadBonusAdminService {


    public WorkloadBonus findByReferenceEntity(WorkloadBonus t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(WorkloadBonus.class,WorkloadBonusHistory.class, WorkloadBonusHistoryCriteria.class, WorkloadBonusSpecification.class);
    }

    public WorkloadBonusAdminServiceImpl(WorkloadBonusDao dao, WorkloadBonusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}