package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Skill;
import ma.engflexy.alc.bean.history.SkillHistory;
import ma.engflexy.alc.dao.criteria.core.SkillCriteria;
import ma.engflexy.alc.dao.criteria.history.SkillHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.SkillDao;
import ma.engflexy.alc.dao.facade.history.SkillHistoryDao;
import ma.engflexy.alc.dao.specification.core.SkillSpecification;
import ma.engflexy.alc.service.facade.admin.SkillAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SkillAdminServiceImpl extends AbstractServiceImpl<Skill,SkillHistory, SkillCriteria, SkillHistoryCriteria, SkillDao,
SkillHistoryDao> implements SkillAdminService {


    public Skill findByReferenceEntity(Skill t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Skill.class,SkillHistory.class, SkillHistoryCriteria.class, SkillSpecification.class);
    }

    public SkillAdminServiceImpl(SkillDao dao, SkillHistoryDao historyDao) {
        super(dao, historyDao);
    }

}