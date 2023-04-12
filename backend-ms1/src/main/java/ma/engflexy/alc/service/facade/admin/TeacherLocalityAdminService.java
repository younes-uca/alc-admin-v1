package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.TeacherLocality;
import ma.engflexy.alc.dao.criteria.core.TeacherLocalityCriteria;
import ma.engflexy.alc.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface TeacherLocalityAdminService extends  IService<TeacherLocality,TeacherLocalityCriteria, TeacherLocalityHistoryCriteria>  {

    Long getNextOrdre();



}
