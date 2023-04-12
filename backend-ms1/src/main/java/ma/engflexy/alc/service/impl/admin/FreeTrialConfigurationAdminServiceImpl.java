package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FreeTrialConfiguration;
import ma.engflexy.alc.bean.history.FreeTrialConfigurationHistory;
import ma.engflexy.alc.dao.criteria.core.FreeTrialConfigurationCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FreeTrialConfigurationDao;
import ma.engflexy.alc.dao.facade.history.FreeTrialConfigurationHistoryDao;
import ma.engflexy.alc.dao.specification.core.FreeTrialConfigurationSpecification;
import ma.engflexy.alc.service.facade.admin.FreeTrialConfigurationAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialConfigurationAdminServiceImpl extends AbstractServiceImpl<FreeTrialConfiguration,FreeTrialConfigurationHistory, FreeTrialConfigurationCriteria, FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationDao,
FreeTrialConfigurationHistoryDao> implements FreeTrialConfigurationAdminService {




    public void configure() {
        super.configure(FreeTrialConfiguration.class,FreeTrialConfigurationHistory.class, FreeTrialConfigurationHistoryCriteria.class, FreeTrialConfigurationSpecification.class);
    }

    public FreeTrialConfigurationAdminServiceImpl(FreeTrialConfigurationDao dao, FreeTrialConfigurationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}