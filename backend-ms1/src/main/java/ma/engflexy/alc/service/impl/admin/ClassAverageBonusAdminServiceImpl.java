package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ClassAverageBonus;
import ma.engflexy.alc.bean.history.ClassAverageBonusHistory;
import ma.engflexy.alc.dao.criteria.core.ClassAverageBonusCriteria;
import ma.engflexy.alc.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ClassAverageBonusDao;
import ma.engflexy.alc.dao.facade.history.ClassAverageBonusHistoryDao;
import ma.engflexy.alc.dao.specification.core.ClassAverageBonusSpecification;
import ma.engflexy.alc.service.facade.admin.ClassAverageBonusAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ClassAverageBonusAdminServiceImpl extends AbstractServiceImpl<ClassAverageBonus,ClassAverageBonusHistory, ClassAverageBonusCriteria, ClassAverageBonusHistoryCriteria, ClassAverageBonusDao,
ClassAverageBonusHistoryDao> implements ClassAverageBonusAdminService {


    public ClassAverageBonus findByReferenceEntity(ClassAverageBonus t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(ClassAverageBonus.class,ClassAverageBonusHistory.class, ClassAverageBonusHistoryCriteria.class, ClassAverageBonusSpecification.class);
    }

    public ClassAverageBonusAdminServiceImpl(ClassAverageBonusDao dao, ClassAverageBonusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}