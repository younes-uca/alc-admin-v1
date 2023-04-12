package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.CategorieSection;
import ma.engflexy.alc.bean.history.CategorieSectionHistory;
import ma.engflexy.alc.dao.criteria.core.CategorieSectionCriteria;
import ma.engflexy.alc.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.CategorieSectionDao;
import ma.engflexy.alc.dao.facade.history.CategorieSectionHistoryDao;
import ma.engflexy.alc.dao.specification.core.CategorieSectionSpecification;
import ma.engflexy.alc.service.facade.admin.CategorieSectionAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.engflexy.alc.bean.core.Section;

import ma.engflexy.alc.service.facade.admin.SectionAdminService ;
import ma.engflexy.alc.service.facade.admin.SuperCategorieSectionAdminService ;


import java.util.List;
@Service
public class CategorieSectionAdminServiceImpl extends AbstractServiceImpl<CategorieSection,CategorieSectionHistory, CategorieSectionCriteria, CategorieSectionHistoryCriteria, CategorieSectionDao,
CategorieSectionHistoryDao> implements CategorieSectionAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public CategorieSection create(CategorieSection t) {
        super.create(t);
        if (t.getSections() != null) {
                t.getSections().forEach(element-> {
                    element.setCategorieSection(t);
                    sectionService.create(element);
            });
        }
        return t;
    }

    public CategorieSection findWithAssociatedLists(Long id){
        CategorieSection result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setSections(sectionService.findByCategorieSectionId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        sectionService.deleteByCategorieSectionId(id);
    }


    public void updateWithAssociatedLists(CategorieSection categorieSection){
    if(categorieSection !=null && categorieSection.getId() != null){
            List<List<Section>> resultSections= sectionService.getToBeSavedAndToBeDeleted(sectionService.findByCategorieSectionId(categorieSection.getId()),categorieSection.getSections());
            sectionService.delete(resultSections.get(1));
            ListUtil.emptyIfNull(resultSections.get(0)).forEach(e -> e.setCategorieSection(categorieSection));
            sectionService.update(resultSections.get(0),true);
    }
    }

    public CategorieSection findByReferenceEntity(CategorieSection t){
        return  dao.findByCode(t.getCode());
    }

    public List<CategorieSection> findBySuperCategorieSectionId(Long id){
        return dao.findBySuperCategorieSectionId(id);
    }
    public int deleteBySuperCategorieSectionId(Long id){
        return dao.deleteBySuperCategorieSectionId(id);
    }

    public void configure() {
        super.configure(CategorieSection.class,CategorieSectionHistory.class, CategorieSectionHistoryCriteria.class, CategorieSectionSpecification.class);
    }

    @Autowired
    private SectionAdminService sectionService ;
    @Autowired
    private SuperCategorieSectionAdminService superCategorieSectionService ;
    public CategorieSectionAdminServiceImpl(CategorieSectionDao dao, CategorieSectionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}