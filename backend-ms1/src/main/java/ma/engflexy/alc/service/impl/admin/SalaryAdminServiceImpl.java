package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Salary;
import ma.engflexy.alc.bean.history.SalaryHistory;
import ma.engflexy.alc.dao.criteria.core.SalaryCriteria;
import ma.engflexy.alc.dao.criteria.history.SalaryHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.SalaryDao;
import ma.engflexy.alc.dao.facade.history.SalaryHistoryDao;
import ma.engflexy.alc.dao.specification.core.SalarySpecification;
import ma.engflexy.alc.service.facade.admin.SalaryAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class SalaryAdminServiceImpl extends AbstractServiceImpl<Salary,SalaryHistory, SalaryCriteria, SalaryHistoryCriteria, SalaryDao,
SalaryHistoryDao> implements SalaryAdminService {


    public Salary findByReferenceEntity(Salary t){
        return  dao.findByCode(t.getCode());
    }

    public List<Salary> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }

    public void configure() {
        super.configure(Salary.class,SalaryHistory.class, SalaryHistoryCriteria.class, SalarySpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    public SalaryAdminServiceImpl(SalaryDao dao, SalaryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}