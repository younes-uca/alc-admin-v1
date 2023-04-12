package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Price;
import ma.engflexy.alc.bean.history.PriceHistory;
import ma.engflexy.alc.dao.criteria.core.PriceCriteria;
import ma.engflexy.alc.dao.criteria.history.PriceHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.PriceDao;
import ma.engflexy.alc.dao.facade.history.PriceHistoryDao;
import ma.engflexy.alc.dao.specification.core.PriceSpecification;
import ma.engflexy.alc.service.facade.admin.PriceAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class PriceAdminServiceImpl extends AbstractServiceImpl<Price,PriceHistory, PriceCriteria, PriceHistoryCriteria, PriceDao,
PriceHistoryDao> implements PriceAdminService {




    public void configure() {
        super.configure(Price.class,PriceHistory.class, PriceHistoryCriteria.class, PriceSpecification.class);
    }

    public PriceAdminServiceImpl(PriceDao dao, PriceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}