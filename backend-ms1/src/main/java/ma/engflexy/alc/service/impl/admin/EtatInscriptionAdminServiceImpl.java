package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.EtatInscription;
import ma.engflexy.alc.bean.history.EtatInscriptionHistory;
import ma.engflexy.alc.dao.criteria.core.EtatInscriptionCriteria;
import ma.engflexy.alc.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.EtatInscriptionDao;
import ma.engflexy.alc.dao.facade.history.EtatInscriptionHistoryDao;
import ma.engflexy.alc.dao.specification.core.EtatInscriptionSpecification;
import ma.engflexy.alc.service.facade.admin.EtatInscriptionAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatInscriptionAdminServiceImpl extends AbstractServiceImpl<EtatInscription,EtatInscriptionHistory, EtatInscriptionCriteria, EtatInscriptionHistoryCriteria, EtatInscriptionDao,
EtatInscriptionHistoryDao> implements EtatInscriptionAdminService {


    public EtatInscription findByReferenceEntity(EtatInscription t){
        return  dao.findByLibelle(t.getLibelle());
    }


    public void configure() {
        super.configure(EtatInscription.class,EtatInscriptionHistory.class, EtatInscriptionHistoryCriteria.class, EtatInscriptionSpecification.class);
    }

    public EtatInscriptionAdminServiceImpl(EtatInscriptionDao dao, EtatInscriptionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}