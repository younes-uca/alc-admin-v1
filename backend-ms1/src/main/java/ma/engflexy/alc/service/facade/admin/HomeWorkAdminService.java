package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.HomeWork;
import ma.engflexy.alc.dao.criteria.core.HomeWorkCriteria;
import ma.engflexy.alc.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface HomeWorkAdminService extends  IService<HomeWork,HomeWorkCriteria, HomeWorkHistoryCriteria>  {

    List<HomeWork> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<HomeWork> findByTypeHomeWorkId(Long id);
    int deleteByTypeHomeWorkId(Long id);



}
