package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.ConfirmationToken;
import ma.engflexy.alc.dao.criteria.core.ConfirmationTokenCriteria;
import ma.engflexy.alc.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ConfirmationTokenAdminService extends  IService<ConfirmationToken,ConfirmationTokenCriteria, ConfirmationTokenHistoryCriteria>  {

    List<ConfirmationToken> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
