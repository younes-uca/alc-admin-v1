package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.EtudiantClassRoom;
import ma.engflexy.alc.bean.history.EtudiantClassRoomHistory;
import ma.engflexy.alc.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.engflexy.alc.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.EtudiantClassRoomDao;
import ma.engflexy.alc.dao.facade.history.EtudiantClassRoomHistoryDao;
import ma.engflexy.alc.dao.specification.core.EtudiantClassRoomSpecification;
import ma.engflexy.alc.service.facade.admin.EtudiantClassRoomAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.ClassRoomAdminService ;
import ma.engflexy.alc.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class EtudiantClassRoomAdminServiceImpl extends AbstractServiceImpl<EtudiantClassRoom,EtudiantClassRoomHistory, EtudiantClassRoomCriteria, EtudiantClassRoomHistoryCriteria, EtudiantClassRoomDao,
EtudiantClassRoomHistoryDao> implements EtudiantClassRoomAdminService {



    public List<EtudiantClassRoom> findByClassRoomId(Long id){
        return dao.findByClassRoomId(id);
    }
    public int deleteByClassRoomId(Long id){
        return dao.deleteByClassRoomId(id);
    }
    public List<EtudiantClassRoom> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(EtudiantClassRoom.class,EtudiantClassRoomHistory.class, EtudiantClassRoomHistoryCriteria.class, EtudiantClassRoomSpecification.class);
    }

    @Autowired
    private ClassRoomAdminService classRoomService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    public EtudiantClassRoomAdminServiceImpl(EtudiantClassRoomDao dao, EtudiantClassRoomHistoryDao historyDao) {
        super(dao, historyDao);
    }

}