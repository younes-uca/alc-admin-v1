package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.TypeHomeWork;
import ma.engflexy.alc.bean.history.TypeHomeWorkHistory;
import ma.engflexy.alc.dao.criteria.core.TypeHomeWorkCriteria;
import ma.engflexy.alc.dao.criteria.history.TypeHomeWorkHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.TypeHomeWorkDao;
import ma.engflexy.alc.dao.facade.history.TypeHomeWorkHistoryDao;
import ma.engflexy.alc.dao.specification.core.TypeHomeWorkSpecification;
import ma.engflexy.alc.service.facade.admin.TypeHomeWorkAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeHomeWorkAdminServiceImpl extends AbstractServiceImpl<TypeHomeWork,TypeHomeWorkHistory, TypeHomeWorkCriteria, TypeHomeWorkHistoryCriteria, TypeHomeWorkDao,
TypeHomeWorkHistoryDao> implements TypeHomeWorkAdminService {


    public TypeHomeWork findByReferenceEntity(TypeHomeWork t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeHomeWork.class,TypeHomeWorkHistory.class, TypeHomeWorkHistoryCriteria.class, TypeHomeWorkSpecification.class);
    }

    public TypeHomeWorkAdminServiceImpl(TypeHomeWorkDao dao, TypeHomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}