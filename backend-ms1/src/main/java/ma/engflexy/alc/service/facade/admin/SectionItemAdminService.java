package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.SectionItem;
import ma.engflexy.alc.dao.criteria.core.SectionItemCriteria;
import ma.engflexy.alc.dao.criteria.history.SectionItemHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface SectionItemAdminService extends  IService<SectionItem,SectionItemCriteria, SectionItemHistoryCriteria>  {

    List<SectionItem> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
