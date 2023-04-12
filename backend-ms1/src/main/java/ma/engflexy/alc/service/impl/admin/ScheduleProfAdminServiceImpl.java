package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ScheduleProf;
import ma.engflexy.alc.bean.history.ScheduleProfHistory;
import ma.engflexy.alc.dao.criteria.core.ScheduleProfCriteria;
import ma.engflexy.alc.dao.criteria.history.ScheduleProfHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ScheduleProfDao;
import ma.engflexy.alc.dao.facade.history.ScheduleProfHistoryDao;
import ma.engflexy.alc.dao.specification.core.ScheduleProfSpecification;
import ma.engflexy.alc.service.facade.admin.ScheduleProfAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.GroupeEtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.CoursAdminService ;
import ma.engflexy.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class ScheduleProfAdminServiceImpl extends AbstractServiceImpl<ScheduleProf,ScheduleProfHistory, ScheduleProfCriteria, ScheduleProfHistoryCriteria, ScheduleProfDao,
ScheduleProfHistoryDao> implements ScheduleProfAdminService {



    public List<ScheduleProf> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }
    public List<ScheduleProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ScheduleProf> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }

    public void configure() {
        super.configure(ScheduleProf.class,ScheduleProfHistory.class, ScheduleProfHistoryCriteria.class, ScheduleProfSpecification.class);
    }

    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;
    @Autowired
    private CoursAdminService coursService ;
    @Autowired
    private ProfAdminService profService ;
    public ScheduleProfAdminServiceImpl(ScheduleProfDao dao, ScheduleProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}