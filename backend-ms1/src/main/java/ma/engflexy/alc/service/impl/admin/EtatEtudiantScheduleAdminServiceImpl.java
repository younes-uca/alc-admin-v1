package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.EtatEtudiantSchedule;
import ma.engflexy.alc.bean.history.EtatEtudiantScheduleHistory;
import ma.engflexy.alc.dao.criteria.core.EtatEtudiantScheduleCriteria;
import ma.engflexy.alc.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.EtatEtudiantScheduleDao;
import ma.engflexy.alc.dao.facade.history.EtatEtudiantScheduleHistoryDao;
import ma.engflexy.alc.dao.specification.core.EtatEtudiantScheduleSpecification;
import ma.engflexy.alc.service.facade.admin.EtatEtudiantScheduleAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatEtudiantScheduleAdminServiceImpl extends AbstractServiceImpl<EtatEtudiantSchedule,EtatEtudiantScheduleHistory, EtatEtudiantScheduleCriteria, EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleDao,
EtatEtudiantScheduleHistoryDao> implements EtatEtudiantScheduleAdminService {


    public EtatEtudiantSchedule findByReferenceEntity(EtatEtudiantSchedule t){
        return  dao.findByLibelle(t.getLibelle());
    }


    public void configure() {
        super.configure(EtatEtudiantSchedule.class,EtatEtudiantScheduleHistory.class, EtatEtudiantScheduleHistoryCriteria.class, EtatEtudiantScheduleSpecification.class);
    }

    public EtatEtudiantScheduleAdminServiceImpl(EtatEtudiantScheduleDao dao, EtatEtudiantScheduleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}