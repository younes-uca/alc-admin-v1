package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FreeTrialformule;
import ma.engflexy.alc.bean.history.FreeTrialformuleHistory;
import ma.engflexy.alc.dao.criteria.core.FreeTrialformuleCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FreeTrialformuleDao;
import ma.engflexy.alc.dao.facade.history.FreeTrialformuleHistoryDao;
import ma.engflexy.alc.dao.specification.core.FreeTrialformuleSpecification;
import ma.engflexy.alc.service.facade.admin.FreeTrialformuleAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.InscriptionAdminService ;


import java.util.List;
@Service
public class FreeTrialformuleAdminServiceImpl extends AbstractServiceImpl<FreeTrialformule,FreeTrialformuleHistory, FreeTrialformuleCriteria, FreeTrialformuleHistoryCriteria, FreeTrialformuleDao,
FreeTrialformuleHistoryDao> implements FreeTrialformuleAdminService {


    public FreeTrialformule findByReferenceEntity(FreeTrialformule t){
        return  dao.findByCode(t.getCode());
    }

    public List<FreeTrialformule> findByInscriptionId(Long id){
        return dao.findByInscriptionId(id);
    }
    public int deleteByInscriptionId(Long id){
        return dao.deleteByInscriptionId(id);
    }

    public void configure() {
        super.configure(FreeTrialformule.class,FreeTrialformuleHistory.class, FreeTrialformuleHistoryCriteria.class, FreeTrialformuleSpecification.class);
    }

    @Autowired
    private InscriptionAdminService inscriptionService ;
    public FreeTrialformuleAdminServiceImpl(FreeTrialformuleDao dao, FreeTrialformuleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}