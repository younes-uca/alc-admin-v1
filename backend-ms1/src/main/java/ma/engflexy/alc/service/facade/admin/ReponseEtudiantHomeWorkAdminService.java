package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.ReponseEtudiantHomeWork;
import ma.engflexy.alc.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.engflexy.alc.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ReponseEtudiantHomeWorkAdminService extends  IService<ReponseEtudiantHomeWork,ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWorkHistoryCriteria>  {

    List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(Long id);
    int deleteByHoweWorkQSTReponseId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(Long id);
    int deleteByHomeWorkEtudiantId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);



}
