package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.EtatEtudiant;
import ma.engflexy.alc.bean.history.EtatEtudiantHistory;
import ma.engflexy.alc.dao.criteria.core.EtatEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.EtatEtudiantDao;
import ma.engflexy.alc.dao.facade.history.EtatEtudiantHistoryDao;
import ma.engflexy.alc.dao.specification.core.EtatEtudiantSpecification;
import ma.engflexy.alc.service.facade.admin.EtatEtudiantAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatEtudiantAdminServiceImpl extends AbstractServiceImpl<EtatEtudiant,EtatEtudiantHistory, EtatEtudiantCriteria, EtatEtudiantHistoryCriteria, EtatEtudiantDao,
EtatEtudiantHistoryDao> implements EtatEtudiantAdminService {


    public EtatEtudiant findByReferenceEntity(EtatEtudiant t){
        return  dao.findByReference(t.getReference());
    }


    public void configure() {
        super.configure(EtatEtudiant.class,EtatEtudiantHistory.class, EtatEtudiantHistoryCriteria.class, EtatEtudiantSpecification.class);
    }

    public EtatEtudiantAdminServiceImpl(EtatEtudiantDao dao, EtatEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}