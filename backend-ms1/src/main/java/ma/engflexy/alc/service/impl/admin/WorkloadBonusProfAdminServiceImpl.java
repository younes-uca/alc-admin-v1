package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.WorkloadBonusProf;
import ma.engflexy.alc.bean.history.WorkloadBonusProfHistory;
import ma.engflexy.alc.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.engflexy.alc.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.WorkloadBonusProfDao;
import ma.engflexy.alc.dao.facade.history.WorkloadBonusProfHistoryDao;
import ma.engflexy.alc.dao.specification.core.WorkloadBonusProfSpecification;
import ma.engflexy.alc.service.facade.admin.WorkloadBonusProfAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.WorkloadBonusAdminService ;
import ma.engflexy.alc.service.facade.admin.SalaryAdminService ;
import ma.engflexy.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class WorkloadBonusProfAdminServiceImpl extends AbstractServiceImpl<WorkloadBonusProf,WorkloadBonusProfHistory, WorkloadBonusProfCriteria, WorkloadBonusProfHistoryCriteria, WorkloadBonusProfDao,
WorkloadBonusProfHistoryDao> implements WorkloadBonusProfAdminService {



    public List<WorkloadBonusProf> findByWorkloadBonusId(Long id){
        return dao.findByWorkloadBonusId(id);
    }
    public int deleteByWorkloadBonusId(Long id){
        return dao.deleteByWorkloadBonusId(id);
    }
    public List<WorkloadBonusProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<WorkloadBonusProf> findBySalaryId(Long id){
        return dao.findBySalaryId(id);
    }
    public int deleteBySalaryId(Long id){
        return dao.deleteBySalaryId(id);
    }

    public void configure() {
        super.configure(WorkloadBonusProf.class,WorkloadBonusProfHistory.class, WorkloadBonusProfHistoryCriteria.class, WorkloadBonusProfSpecification.class);
    }

    @Autowired
    private WorkloadBonusAdminService workloadBonusService ;
    @Autowired
    private SalaryAdminService salaryService ;
    @Autowired
    private ProfAdminService profService ;
    public WorkloadBonusProfAdminServiceImpl(WorkloadBonusProfDao dao, WorkloadBonusProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}