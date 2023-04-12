package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Contact;
import ma.engflexy.alc.dao.criteria.core.ContactCriteria;
import ma.engflexy.alc.dao.criteria.history.ContactHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ContactAdminService extends  IService<Contact,ContactCriteria, ContactHistoryCriteria>  {




}
