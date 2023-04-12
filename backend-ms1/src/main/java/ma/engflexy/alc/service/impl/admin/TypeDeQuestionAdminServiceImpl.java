package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.TypeDeQuestion;
import ma.engflexy.alc.bean.history.TypeDeQuestionHistory;
import ma.engflexy.alc.dao.criteria.core.TypeDeQuestionCriteria;
import ma.engflexy.alc.dao.criteria.history.TypeDeQuestionHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.TypeDeQuestionDao;
import ma.engflexy.alc.dao.facade.history.TypeDeQuestionHistoryDao;
import ma.engflexy.alc.dao.specification.core.TypeDeQuestionSpecification;
import ma.engflexy.alc.service.facade.admin.TypeDeQuestionAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeDeQuestionAdminServiceImpl extends AbstractServiceImpl<TypeDeQuestion,TypeDeQuestionHistory, TypeDeQuestionCriteria, TypeDeQuestionHistoryCriteria, TypeDeQuestionDao,
TypeDeQuestionHistoryDao> implements TypeDeQuestionAdminService {


    public TypeDeQuestion findByReferenceEntity(TypeDeQuestion t){
        return  dao.findByRef(t.getRef());
    }


    public void configure() {
        super.configure(TypeDeQuestion.class,TypeDeQuestionHistory.class, TypeDeQuestionHistoryCriteria.class, TypeDeQuestionSpecification.class);
    }

    public TypeDeQuestionAdminServiceImpl(TypeDeQuestionDao dao, TypeDeQuestionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}