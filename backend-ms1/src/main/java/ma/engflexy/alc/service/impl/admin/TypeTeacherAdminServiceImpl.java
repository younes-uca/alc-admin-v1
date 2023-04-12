package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.TypeTeacher;
import ma.engflexy.alc.bean.history.TypeTeacherHistory;
import ma.engflexy.alc.dao.criteria.core.TypeTeacherCriteria;
import ma.engflexy.alc.dao.criteria.history.TypeTeacherHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.TypeTeacherDao;
import ma.engflexy.alc.dao.facade.history.TypeTeacherHistoryDao;
import ma.engflexy.alc.dao.specification.core.TypeTeacherSpecification;
import ma.engflexy.alc.service.facade.admin.TypeTeacherAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeTeacherAdminServiceImpl extends AbstractServiceImpl<TypeTeacher,TypeTeacherHistory, TypeTeacherCriteria, TypeTeacherHistoryCriteria, TypeTeacherDao,
TypeTeacherHistoryDao> implements TypeTeacherAdminService {


    public TypeTeacher findByReferenceEntity(TypeTeacher t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeTeacher.class,TypeTeacherHistory.class, TypeTeacherHistoryCriteria.class, TypeTeacherSpecification.class);
    }

    public TypeTeacherAdminServiceImpl(TypeTeacherDao dao, TypeTeacherHistoryDao historyDao) {
        super(dao, historyDao);
    }

}