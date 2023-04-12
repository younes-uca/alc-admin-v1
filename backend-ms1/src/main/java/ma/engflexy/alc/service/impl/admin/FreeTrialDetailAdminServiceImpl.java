package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FreeTrialDetail;
import ma.engflexy.alc.bean.history.FreeTrialDetailHistory;
import ma.engflexy.alc.dao.criteria.core.FreeTrialDetailCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FreeTrialDetailDao;
import ma.engflexy.alc.dao.facade.history.FreeTrialDetailHistoryDao;
import ma.engflexy.alc.dao.specification.core.FreeTrialDetailSpecification;
import ma.engflexy.alc.service.facade.admin.FreeTrialDetailAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.EtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.FreeTrialAdminService ;


import java.util.List;
@Service
public class FreeTrialDetailAdminServiceImpl extends AbstractServiceImpl<FreeTrialDetail,FreeTrialDetailHistory, FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria, FreeTrialDetailDao,
FreeTrialDetailHistoryDao> implements FreeTrialDetailAdminService {



    public List<FreeTrialDetail> findByFreeTrialId(Long id){
        return dao.findByFreeTrialId(id);
    }
    public int deleteByFreeTrialId(Long id){
        return dao.deleteByFreeTrialId(id);
    }
    public List<FreeTrialDetail> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(FreeTrialDetail.class,FreeTrialDetailHistory.class, FreeTrialDetailHistoryCriteria.class, FreeTrialDetailSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private FreeTrialAdminService freeTrialService ;
    public FreeTrialDetailAdminServiceImpl(FreeTrialDetailDao dao, FreeTrialDetailHistoryDao historyDao) {
        super(dao, historyDao);
    }

}