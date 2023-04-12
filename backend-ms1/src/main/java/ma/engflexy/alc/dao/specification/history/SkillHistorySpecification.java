package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.SkillHistoryCriteria;
import ma.engflexy.alc.bean.history.SkillHistory;


public class SkillHistorySpecification extends AbstractHistorySpecification<SkillHistoryCriteria, SkillHistory> {

    public SkillHistorySpecification(SkillHistoryCriteria criteria) {
        super(criteria);
    }

    public SkillHistorySpecification(SkillHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
