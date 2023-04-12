package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.EtatEtudiantSchedule;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.EtatEtudiantSchedule;
import java.util.List;


@Repository
public interface EtatEtudiantScheduleDao extends AbstractRepository<EtatEtudiantSchedule,Long>  {
    EtatEtudiantSchedule findByLibelle(String libelle);
    int deleteByLibelle(String libelle);


}
