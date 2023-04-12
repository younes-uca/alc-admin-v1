package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.FaqProf;
import ma.engflexy.alc.dao.criteria.core.FaqProfCriteria;
import ma.engflexy.alc.dao.criteria.history.FaqProfHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface FaqProfAdminService extends  IService<FaqProf,FaqProfCriteria, FaqProfHistoryCriteria>  {

    List<FaqProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<FaqProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqProf> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
