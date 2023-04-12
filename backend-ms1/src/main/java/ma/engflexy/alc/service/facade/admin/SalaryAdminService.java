package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Salary;
import ma.engflexy.alc.dao.criteria.core.SalaryCriteria;
import ma.engflexy.alc.dao.criteria.history.SalaryHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface SalaryAdminService extends  IService<Salary,SalaryCriteria, SalaryHistoryCriteria>  {

    List<Salary> findByProfId(Long id);
    int deleteByProfId(Long id);



}
