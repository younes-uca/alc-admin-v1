package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.SectionItem;
import ma.engflexy.alc.bean.history.SectionItemHistory;
import ma.engflexy.alc.dao.criteria.core.SectionItemCriteria;
import ma.engflexy.alc.dao.criteria.history.SectionItemHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.SectionItemDao;
import ma.engflexy.alc.dao.facade.history.SectionItemHistoryDao;
import ma.engflexy.alc.dao.specification.core.SectionItemSpecification;
import ma.engflexy.alc.service.facade.admin.SectionItemAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.SectionAdminService ;


import java.util.List;
@Service
public class SectionItemAdminServiceImpl extends AbstractServiceImpl<SectionItem,SectionItemHistory, SectionItemCriteria, SectionItemHistoryCriteria, SectionItemDao,
SectionItemHistoryDao> implements SectionItemAdminService {



    public List<SectionItem> findBySectionId(Long id){
        return dao.findBySectionId(id);
    }
    public int deleteBySectionId(Long id){
        return dao.deleteBySectionId(id);
    }

    public void configure() {
        super.configure(SectionItem.class,SectionItemHistory.class, SectionItemHistoryCriteria.class, SectionItemSpecification.class);
    }

    @Autowired
    private SectionAdminService sectionService ;
    public SectionItemAdminServiceImpl(SectionItemDao dao, SectionItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}