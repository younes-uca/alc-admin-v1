package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FaqType;
import ma.engflexy.alc.bean.history.FaqTypeHistory;
import ma.engflexy.alc.dao.criteria.core.FaqTypeCriteria;
import ma.engflexy.alc.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FaqTypeDao;
import ma.engflexy.alc.dao.facade.history.FaqTypeHistoryDao;
import ma.engflexy.alc.dao.specification.core.FaqTypeSpecification;
import ma.engflexy.alc.service.facade.admin.FaqTypeAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FaqTypeAdminServiceImpl extends AbstractServiceImpl<FaqType,FaqTypeHistory, FaqTypeCriteria, FaqTypeHistoryCriteria, FaqTypeDao,
FaqTypeHistoryDao> implements FaqTypeAdminService {




    public void configure() {
        super.configure(FaqType.class,FaqTypeHistory.class, FaqTypeHistoryCriteria.class, FaqTypeSpecification.class);
    }

    public FaqTypeAdminServiceImpl(FaqTypeDao dao, FaqTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}