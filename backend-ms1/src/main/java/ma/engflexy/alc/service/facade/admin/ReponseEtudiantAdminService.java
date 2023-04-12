package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.ReponseEtudiant;
import ma.engflexy.alc.dao.criteria.core.ReponseEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ReponseEtudiantAdminService extends  IService<ReponseEtudiant,ReponseEtudiantCriteria, ReponseEtudiantHistoryCriteria>  {

    List<ReponseEtudiant> findByReponseId(Long id);
    int deleteByReponseId(Long id);
    List<ReponseEtudiant> findByQuizEtudiantId(Long id);
    int deleteByQuizEtudiantId(Long id);
    List<ReponseEtudiant> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);



}
