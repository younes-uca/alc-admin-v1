package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Section;
import ma.engflexy.alc.dao.criteria.core.SectionCriteria;
import ma.engflexy.alc.dao.criteria.history.SectionHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface SectionAdminService extends  IService<Section,SectionCriteria, SectionHistoryCriteria>  {

    List<Section> findByCategorieSectionId(Long id);
    int deleteByCategorieSectionId(Long id);
    List<Section> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<Section> findBySessionCoursId(Long id);
    int deleteBySessionCoursId(Long id);



}
