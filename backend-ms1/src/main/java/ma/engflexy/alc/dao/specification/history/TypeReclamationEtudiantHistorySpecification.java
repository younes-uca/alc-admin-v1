package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.TypeReclamationEtudiantHistory;


public class TypeReclamationEtudiantHistorySpecification extends AbstractHistorySpecification<TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantHistory> {

    public TypeReclamationEtudiantHistorySpecification(TypeReclamationEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationEtudiantHistorySpecification(TypeReclamationEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
