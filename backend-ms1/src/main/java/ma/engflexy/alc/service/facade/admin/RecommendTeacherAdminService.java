package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.RecommendTeacher;
import ma.engflexy.alc.dao.criteria.core.RecommendTeacherCriteria;
import ma.engflexy.alc.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface RecommendTeacherAdminService extends  IService<RecommendTeacher,RecommendTeacherCriteria, RecommendTeacherHistoryCriteria>  {

    List<RecommendTeacher> findByProfId(Long id);
    int deleteByProfId(Long id);



}
