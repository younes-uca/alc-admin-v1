package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.EtatReponse;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.EtatReponse;
import java.util.List;


@Repository
public interface EtatReponseDao extends AbstractRepository<EtatReponse,Long>  {
    EtatReponse findByCode(String code);
    int deleteByCode(String code);


}
