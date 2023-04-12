package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Admin;
import ma.engflexy.alc.bean.history.AdminHistory;
import ma.engflexy.alc.dao.criteria.core.AdminCriteria;
import ma.engflexy.alc.dao.criteria.history.AdminHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.AdminDao;
import ma.engflexy.alc.dao.facade.history.AdminHistoryDao;
import ma.engflexy.alc.dao.specification.core.AdminSpecification;
import ma.engflexy.alc.service.facade.admin.AdminAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AdminAdminServiceImpl extends AbstractServiceImpl<Admin,AdminHistory, AdminCriteria, AdminHistoryCriteria, AdminDao,
AdminHistoryDao> implements AdminAdminService {




    Admin findByUsername(String username){
        return dao.findByUsername(username);
    }
    public void configure() {
        super.configure(Admin.class,AdminHistory.class, AdminHistoryCriteria.class, AdminSpecification.class);
    }

    public AdminAdminServiceImpl(AdminDao dao, AdminHistoryDao historyDao) {
        super(dao, historyDao);
    }

}