package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.WorkloadBonusProf;
import ma.engflexy.alc.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.engflexy.alc.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface WorkloadBonusProfAdminService extends  IService<WorkloadBonusProf,WorkloadBonusProfCriteria, WorkloadBonusProfHistoryCriteria>  {

    List<WorkloadBonusProf> findByWorkloadBonusId(Long id);
    int deleteByWorkloadBonusId(Long id);
    List<WorkloadBonusProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<WorkloadBonusProf> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);



}
