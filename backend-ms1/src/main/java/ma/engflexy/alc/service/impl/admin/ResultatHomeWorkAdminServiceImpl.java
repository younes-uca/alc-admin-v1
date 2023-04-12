package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ResultatHomeWork;
import ma.engflexy.alc.bean.history.ResultatHomeWorkHistory;
import ma.engflexy.alc.dao.criteria.core.ResultatHomeWorkCriteria;
import ma.engflexy.alc.dao.criteria.history.ResultatHomeWorkHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ResultatHomeWorkDao;
import ma.engflexy.alc.dao.facade.history.ResultatHomeWorkHistoryDao;
import ma.engflexy.alc.dao.specification.core.ResultatHomeWorkSpecification;
import ma.engflexy.alc.service.facade.admin.ResultatHomeWorkAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ResultatHomeWorkAdminServiceImpl extends AbstractServiceImpl<ResultatHomeWork,ResultatHomeWorkHistory, ResultatHomeWorkCriteria, ResultatHomeWorkHistoryCriteria, ResultatHomeWorkDao,
ResultatHomeWorkHistoryDao> implements ResultatHomeWorkAdminService {


    public ResultatHomeWork findByReferenceEntity(ResultatHomeWork t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(ResultatHomeWork.class,ResultatHomeWorkHistory.class, ResultatHomeWorkHistoryCriteria.class, ResultatHomeWorkSpecification.class);
    }

    public ResultatHomeWorkAdminServiceImpl(ResultatHomeWorkDao dao, ResultatHomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}