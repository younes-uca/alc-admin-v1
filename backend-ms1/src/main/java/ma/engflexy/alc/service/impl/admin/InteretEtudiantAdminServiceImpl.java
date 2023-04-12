package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.InteretEtudiant;
import ma.engflexy.alc.bean.history.InteretEtudiantHistory;
import ma.engflexy.alc.dao.criteria.core.InteretEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.InteretEtudiantHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.InteretEtudiantDao;
import ma.engflexy.alc.dao.facade.history.InteretEtudiantHistoryDao;
import ma.engflexy.alc.dao.specification.core.InteretEtudiantSpecification;
import ma.engflexy.alc.service.facade.admin.InteretEtudiantAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class InteretEtudiantAdminServiceImpl extends AbstractServiceImpl<InteretEtudiant,InteretEtudiantHistory, InteretEtudiantCriteria, InteretEtudiantHistoryCriteria, InteretEtudiantDao,
InteretEtudiantHistoryDao> implements InteretEtudiantAdminService {


    public InteretEtudiant findByReferenceEntity(InteretEtudiant t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(InteretEtudiant.class,InteretEtudiantHistory.class, InteretEtudiantHistoryCriteria.class, InteretEtudiantSpecification.class);
    }

    public InteretEtudiantAdminServiceImpl(InteretEtudiantDao dao, InteretEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}