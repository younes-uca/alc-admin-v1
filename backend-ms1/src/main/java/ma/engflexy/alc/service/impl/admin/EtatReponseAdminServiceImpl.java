package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.EtatReponse;
import ma.engflexy.alc.bean.history.EtatReponseHistory;
import ma.engflexy.alc.dao.criteria.core.EtatReponseCriteria;
import ma.engflexy.alc.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.EtatReponseDao;
import ma.engflexy.alc.dao.facade.history.EtatReponseHistoryDao;
import ma.engflexy.alc.dao.specification.core.EtatReponseSpecification;
import ma.engflexy.alc.service.facade.admin.EtatReponseAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatReponseAdminServiceImpl extends AbstractServiceImpl<EtatReponse,EtatReponseHistory, EtatReponseCriteria, EtatReponseHistoryCriteria, EtatReponseDao,
EtatReponseHistoryDao> implements EtatReponseAdminService {


    public EtatReponse findByReferenceEntity(EtatReponse t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(EtatReponse.class,EtatReponseHistory.class, EtatReponseHistoryCriteria.class, EtatReponseSpecification.class);
    }

    public EtatReponseAdminServiceImpl(EtatReponseDao dao, EtatReponseHistoryDao historyDao) {
        super(dao, historyDao);
    }

}