package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.ClassAverageBonusProf;
import ma.engflexy.alc.dao.criteria.core.ClassAverageBonusProfCriteria;
import ma.engflexy.alc.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ClassAverageBonusProfAdminService extends  IService<ClassAverageBonusProf,ClassAverageBonusProfCriteria, ClassAverageBonusProfHistoryCriteria>  {

    List<ClassAverageBonusProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ClassAverageBonusProf> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);



}
