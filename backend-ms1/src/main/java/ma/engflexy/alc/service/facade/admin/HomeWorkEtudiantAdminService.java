package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.HomeWorkEtudiant;
import ma.engflexy.alc.dao.criteria.core.HomeWorkEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.HomeWorkEtudiantHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface HomeWorkEtudiantAdminService extends  IService<HomeWorkEtudiant,HomeWorkEtudiantCriteria, HomeWorkEtudiantHistoryCriteria>  {

    List<HomeWorkEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<HomeWorkEtudiant> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);
    List<HomeWorkEtudiant> findByResultatHomeWorkId(Long id);
    int deleteByResultatHomeWorkId(Long id);



}
