package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.ReclamationProf;
import ma.engflexy.alc.dao.criteria.core.ReclamationProfCriteria;
import ma.engflexy.alc.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ReclamationProfAdminService extends  IService<ReclamationProf,ReclamationProfCriteria, ReclamationProfHistoryCriteria>  {

    List<ReclamationProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<ReclamationProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ReclamationProf> findByTypeReclamationProfId(Long id);
    int deleteByTypeReclamationProfId(Long id);



}
