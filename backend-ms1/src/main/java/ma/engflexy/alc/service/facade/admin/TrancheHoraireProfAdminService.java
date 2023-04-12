package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.TrancheHoraireProf;
import ma.engflexy.alc.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.engflexy.alc.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface TrancheHoraireProfAdminService extends  IService<TrancheHoraireProf,TrancheHoraireProfCriteria, TrancheHoraireProfHistoryCriteria>  {

    List<TrancheHoraireProf> findByProfId(Long id);
    int deleteByProfId(Long id);



}
