package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.ProfReview;
import ma.engflexy.alc.dao.criteria.core.ProfReviewCriteria;
import ma.engflexy.alc.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ProfReviewAdminService extends  IService<ProfReview,ProfReviewCriteria, ProfReviewHistoryCriteria>  {

    List<ProfReview> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<ProfReview> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ProfReview> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
