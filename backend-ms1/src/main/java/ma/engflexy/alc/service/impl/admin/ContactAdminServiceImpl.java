package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Contact;
import ma.engflexy.alc.bean.history.ContactHistory;
import ma.engflexy.alc.dao.criteria.core.ContactCriteria;
import ma.engflexy.alc.dao.criteria.history.ContactHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ContactDao;
import ma.engflexy.alc.dao.facade.history.ContactHistoryDao;
import ma.engflexy.alc.dao.specification.core.ContactSpecification;
import ma.engflexy.alc.service.facade.admin.ContactAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ContactAdminServiceImpl extends AbstractServiceImpl<Contact,ContactHistory, ContactCriteria, ContactHistoryCriteria, ContactDao,
ContactHistoryDao> implements ContactAdminService {




    public void configure() {
        super.configure(Contact.class,ContactHistory.class, ContactHistoryCriteria.class, ContactSpecification.class);
    }

    public ContactAdminServiceImpl(ContactDao dao, ContactHistoryDao historyDao) {
        super(dao, historyDao);
    }

}