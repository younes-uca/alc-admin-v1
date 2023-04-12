package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Admin;
import ma.engflexy.alc.dao.criteria.core.AdminCriteria;
import ma.engflexy.alc.dao.criteria.history.AdminHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface AdminAdminService extends  IService<Admin,AdminCriteria, AdminHistoryCriteria>  {
    Admin findByUsername(String username);




}
