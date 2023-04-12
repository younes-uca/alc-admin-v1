package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.CalendrierProf;
import ma.engflexy.alc.dao.criteria.core.CalendrierProfCriteria;
import ma.engflexy.alc.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface CalendrierProfAdminService extends  IService<CalendrierProf,CalendrierProfCriteria, CalendrierProfHistoryCriteria>  {

    List<CalendrierProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<CalendrierProf> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
