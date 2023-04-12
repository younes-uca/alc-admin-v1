package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FaqProf;
import ma.engflexy.alc.bean.history.FaqProfHistory;
import ma.engflexy.alc.dao.criteria.core.FaqProfCriteria;
import ma.engflexy.alc.dao.criteria.history.FaqProfHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FaqProfDao;
import ma.engflexy.alc.dao.facade.history.FaqProfHistoryDao;
import ma.engflexy.alc.dao.specification.core.FaqProfSpecification;
import ma.engflexy.alc.service.facade.admin.FaqProfAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.AdminAdminService ;
import ma.engflexy.alc.service.facade.admin.ProfAdminService ;
import ma.engflexy.alc.service.facade.admin.FaqTypeAdminService ;


import java.util.List;
@Service
public class FaqProfAdminServiceImpl extends AbstractServiceImpl<FaqProf,FaqProfHistory, FaqProfCriteria, FaqProfHistoryCriteria, FaqProfDao,
FaqProfHistoryDao> implements FaqProfAdminService {



    public List<FaqProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<FaqProf> findByAdminId(Long id){
        return dao.findByAdminId(id);
    }
    public int deleteByAdminId(Long id){
        return dao.deleteByAdminId(id);
    }
    public List<FaqProf> findByFaqTypeId(Long id){
        return dao.findByFaqTypeId(id);
    }
    public int deleteByFaqTypeId(Long id){
        return dao.deleteByFaqTypeId(id);
    }

    public void configure() {
        super.configure(FaqProf.class,FaqProfHistory.class, FaqProfHistoryCriteria.class, FaqProfSpecification.class);
    }

    @Autowired
    private AdminAdminService adminService ;
    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private FaqTypeAdminService faqTypeService ;
    public FaqProfAdminServiceImpl(FaqProfDao dao, FaqProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}