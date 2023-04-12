package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.QuizEtudiant;
import ma.engflexy.alc.dao.criteria.core.QuizEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface QuizEtudiantAdminService extends  IService<QuizEtudiant,QuizEtudiantCriteria, QuizEtudiantHistoryCriteria>  {

    List<QuizEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<QuizEtudiant> findByQuizId(Long id);
    int deleteByQuizId(Long id);



}
