package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.CategorieSection;
import ma.engflexy.alc.dao.criteria.core.CategorieSectionCriteria;
import ma.engflexy.alc.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface CategorieSectionAdminService extends  IService<CategorieSection,CategorieSectionCriteria, CategorieSectionHistoryCriteria>  {

    List<CategorieSection> findBySuperCategorieSectionId(Long id);
    int deleteBySuperCategorieSectionId(Long id);



}
