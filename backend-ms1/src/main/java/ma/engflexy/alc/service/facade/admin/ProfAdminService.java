package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Prof;
import ma.engflexy.alc.dao.criteria.core.ProfCriteria;
import ma.engflexy.alc.dao.criteria.history.ProfHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ProfAdminService extends  IService<Prof,ProfCriteria, ProfHistoryCriteria>  {
    Prof findByUsername(String username);

    List<Prof> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<Prof> findByCategorieProfId(Long id);
    int deleteByCategorieProfId(Long id);
    List<Prof> findByTypeTeacherId(Long id);
    int deleteByTypeTeacherId(Long id);



}
