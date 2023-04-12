package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.FaqEtudiant;
import ma.engflexy.alc.dao.criteria.core.FaqEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface FaqEtudiantAdminService extends  IService<FaqEtudiant,FaqEtudiantCriteria, FaqEtudiantHistoryCriteria>  {

    List<FaqEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<FaqEtudiant> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqEtudiant> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
