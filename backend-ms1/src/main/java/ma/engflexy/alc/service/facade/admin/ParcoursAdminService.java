package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Parcours;
import ma.engflexy.alc.dao.criteria.core.ParcoursCriteria;
import ma.engflexy.alc.dao.criteria.history.ParcoursHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ParcoursAdminService extends  IService<Parcours,ParcoursCriteria, ParcoursHistoryCriteria>  {

    List<Parcours> findByCentreId(Long id);
    int deleteByCentreId(Long id);



}
