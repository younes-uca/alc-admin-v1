package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.EtatCours;
import ma.engflexy.alc.bean.history.EtatCoursHistory;
import ma.engflexy.alc.dao.criteria.core.EtatCoursCriteria;
import ma.engflexy.alc.dao.criteria.history.EtatCoursHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.EtatCoursDao;
import ma.engflexy.alc.dao.facade.history.EtatCoursHistoryDao;
import ma.engflexy.alc.dao.specification.core.EtatCoursSpecification;
import ma.engflexy.alc.service.facade.admin.EtatCoursAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatCoursAdminServiceImpl extends AbstractServiceImpl<EtatCours,EtatCoursHistory, EtatCoursCriteria, EtatCoursHistoryCriteria, EtatCoursDao,
EtatCoursHistoryDao> implements EtatCoursAdminService {


    public EtatCours findByReferenceEntity(EtatCours t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(EtatCours.class,EtatCoursHistory.class, EtatCoursHistoryCriteria.class, EtatCoursSpecification.class);
    }

    public EtatCoursAdminServiceImpl(EtatCoursDao dao, EtatCoursHistoryDao historyDao) {
        super(dao, historyDao);
    }

}