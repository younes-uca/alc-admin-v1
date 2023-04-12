package ma.engflexy.alc.zynerator.service;

import ma.engflexy.alc.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.engflexy.alc.zynerator.criteria.BaseCriteria;
import ma.engflexy.alc.zynerator.history.HistBusinessObject;
import ma.engflexy.alc.zynerator.history.HistCriteria;
import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}