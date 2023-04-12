package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.FreeTrialDetail;
import ma.engflexy.alc.dao.criteria.core.FreeTrialDetailCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface FreeTrialDetailAdminService extends  IService<FreeTrialDetail,FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria>  {

    List<FreeTrialDetail> findByFreeTrialId(Long id);
    int deleteByFreeTrialId(Long id);
    List<FreeTrialDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
