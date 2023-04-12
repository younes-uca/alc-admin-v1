package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.EtudiantReview;
import ma.engflexy.alc.dao.criteria.core.EtudiantReviewCriteria;
import ma.engflexy.alc.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface EtudiantReviewAdminService extends  IService<EtudiantReview,EtudiantReviewCriteria, EtudiantReviewHistoryCriteria>  {

    List<EtudiantReview> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<EtudiantReview> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<EtudiantReview> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
