package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.GroupeEtudiantDetail;
import ma.engflexy.alc.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.engflexy.alc.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface GroupeEtudiantDetailAdminService extends  IService<GroupeEtudiantDetail,GroupeEtudiantDetailCriteria, GroupeEtudiantDetailHistoryCriteria>  {

    List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<GroupeEtudiantDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
