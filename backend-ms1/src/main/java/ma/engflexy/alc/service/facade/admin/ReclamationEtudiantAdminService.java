package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.ReclamationEtudiant;
import ma.engflexy.alc.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ReclamationEtudiantAdminService extends  IService<ReclamationEtudiant,ReclamationEtudiantCriteria, ReclamationEtudiantHistoryCriteria>  {

    List<ReclamationEtudiant> findByTypeReclamationEtudiantId(Long id);
    int deleteByTypeReclamationEtudiantId(Long id);



}
