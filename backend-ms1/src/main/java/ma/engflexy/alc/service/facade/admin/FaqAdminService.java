package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Faq;
import ma.engflexy.alc.dao.criteria.core.FaqCriteria;
import ma.engflexy.alc.dao.criteria.history.FaqHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface FaqAdminService extends  IService<Faq,FaqCriteria, FaqHistoryCriteria>  {

    List<Faq> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
