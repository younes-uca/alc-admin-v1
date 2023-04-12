package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Cours;
import ma.engflexy.alc.dao.criteria.core.CoursCriteria;
import ma.engflexy.alc.dao.criteria.history.CoursHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface CoursAdminService extends  IService<Cours,CoursCriteria, CoursHistoryCriteria>  {

    List<Cours> findByEtatCoursId(Long id);
    int deleteByEtatCoursId(Long id);
    List<Cours> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);



}
