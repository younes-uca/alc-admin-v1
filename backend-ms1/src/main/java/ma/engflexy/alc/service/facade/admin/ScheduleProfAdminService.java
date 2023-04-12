package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.ScheduleProf;
import ma.engflexy.alc.dao.criteria.core.ScheduleProfCriteria;
import ma.engflexy.alc.dao.criteria.history.ScheduleProfHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ScheduleProfAdminService extends  IService<ScheduleProf,ScheduleProfCriteria, ScheduleProfHistoryCriteria>  {

    List<ScheduleProf> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<ScheduleProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ScheduleProf> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
