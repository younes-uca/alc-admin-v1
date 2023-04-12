package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.TypeReclamationProfHistoryCriteria;
import ma.engflexy.alc.bean.history.TypeReclamationProfHistory;


public class TypeReclamationProfHistorySpecification extends AbstractHistorySpecification<TypeReclamationProfHistoryCriteria, TypeReclamationProfHistory> {

    public TypeReclamationProfHistorySpecification(TypeReclamationProfHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationProfHistorySpecification(TypeReclamationProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
