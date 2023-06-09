package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.PackStudent;
import ma.engflexy.alc.dao.criteria.core.PackStudentCriteria;
import ma.engflexy.alc.dao.criteria.history.PackStudentHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface PackStudentAdminService extends  IService<PackStudent,PackStudentCriteria, PackStudentHistoryCriteria>  {

    List<PackStudent> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<PackStudent> findByPriceId(Long id);
    int deleteByPriceId(Long id);



}
