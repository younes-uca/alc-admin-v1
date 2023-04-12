package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Services;
import ma.engflexy.alc.bean.history.ServicesHistory;
import ma.engflexy.alc.dao.criteria.core.ServicesCriteria;
import ma.engflexy.alc.dao.criteria.history.ServicesHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ServicesDao;
import ma.engflexy.alc.dao.facade.history.ServicesHistoryDao;
import ma.engflexy.alc.dao.specification.core.ServicesSpecification;
import ma.engflexy.alc.service.facade.admin.ServicesAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ServicesAdminServiceImpl extends AbstractServiceImpl<Services,ServicesHistory, ServicesCriteria, ServicesHistoryCriteria, ServicesDao,
ServicesHistoryDao> implements ServicesAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public Services findByReferenceEntity(Services t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Services.class,ServicesHistory.class, ServicesHistoryCriteria.class, ServicesSpecification.class);
    }

    public ServicesAdminServiceImpl(ServicesDao dao, ServicesHistoryDao historyDao) {
        super(dao, historyDao);
    }

}