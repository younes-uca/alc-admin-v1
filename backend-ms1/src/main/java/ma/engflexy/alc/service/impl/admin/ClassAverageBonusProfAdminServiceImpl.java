package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ClassAverageBonusProf;
import ma.engflexy.alc.bean.history.ClassAverageBonusProfHistory;
import ma.engflexy.alc.dao.criteria.core.ClassAverageBonusProfCriteria;
import ma.engflexy.alc.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ClassAverageBonusProfDao;
import ma.engflexy.alc.dao.facade.history.ClassAverageBonusProfHistoryDao;
import ma.engflexy.alc.dao.specification.core.ClassAverageBonusProfSpecification;
import ma.engflexy.alc.service.facade.admin.ClassAverageBonusProfAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.SalaryAdminService ;
import ma.engflexy.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class ClassAverageBonusProfAdminServiceImpl extends AbstractServiceImpl<ClassAverageBonusProf,ClassAverageBonusProfHistory, ClassAverageBonusProfCriteria, ClassAverageBonusProfHistoryCriteria, ClassAverageBonusProfDao,
ClassAverageBonusProfHistoryDao> implements ClassAverageBonusProfAdminService {



    public List<ClassAverageBonusProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ClassAverageBonusProf> findBySalaryId(Long id){
        return dao.findBySalaryId(id);
    }
    public int deleteBySalaryId(Long id){
        return dao.deleteBySalaryId(id);
    }

    public void configure() {
        super.configure(ClassAverageBonusProf.class,ClassAverageBonusProfHistory.class, ClassAverageBonusProfHistoryCriteria.class, ClassAverageBonusProfSpecification.class);
    }

    @Autowired
    private SalaryAdminService salaryService ;
    @Autowired
    private ProfAdminService profService ;
    public ClassAverageBonusProfAdminServiceImpl(ClassAverageBonusProfDao dao, ClassAverageBonusProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}