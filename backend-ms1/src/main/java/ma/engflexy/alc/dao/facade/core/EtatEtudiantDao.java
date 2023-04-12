package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.EtatEtudiant;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.EtatEtudiant;
import java.util.List;


@Repository
public interface EtatEtudiantDao extends AbstractRepository<EtatEtudiant,Long>  {
    EtatEtudiant findByReference(String reference);
    int deleteByReference(String reference);


}
