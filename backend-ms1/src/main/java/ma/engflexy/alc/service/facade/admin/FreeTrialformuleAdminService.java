package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.FreeTrialformule;
import ma.engflexy.alc.dao.criteria.core.FreeTrialformuleCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface FreeTrialformuleAdminService extends  IService<FreeTrialformule,FreeTrialformuleCriteria, FreeTrialformuleHistoryCriteria>  {

    List<FreeTrialformule> findByInscriptionId(Long id);
    int deleteByInscriptionId(Long id);



}
