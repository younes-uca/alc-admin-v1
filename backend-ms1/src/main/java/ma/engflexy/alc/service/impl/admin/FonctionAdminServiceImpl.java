package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Fonction;
import ma.engflexy.alc.bean.history.FonctionHistory;
import ma.engflexy.alc.dao.criteria.core.FonctionCriteria;
import ma.engflexy.alc.dao.criteria.history.FonctionHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FonctionDao;
import ma.engflexy.alc.dao.facade.history.FonctionHistoryDao;
import ma.engflexy.alc.dao.specification.core.FonctionSpecification;
import ma.engflexy.alc.service.facade.admin.FonctionAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FonctionAdminServiceImpl extends AbstractServiceImpl<Fonction,FonctionHistory, FonctionCriteria, FonctionHistoryCriteria, FonctionDao,
FonctionHistoryDao> implements FonctionAdminService {


    public Fonction findByReferenceEntity(Fonction t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Fonction.class,FonctionHistory.class, FonctionHistoryCriteria.class, FonctionSpecification.class);
    }

    public FonctionAdminServiceImpl(FonctionDao dao, FonctionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}