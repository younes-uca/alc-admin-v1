package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.HoweWorkQSTReponse;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.HoweWorkQSTReponse;
import java.util.List;


@Repository
public interface HoweWorkQSTReponseDao extends AbstractRepository<HoweWorkQSTReponse,Long>  {
    HoweWorkQSTReponse findByRef(String ref);
    int deleteByRef(String ref);

    List<HoweWorkQSTReponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<HoweWorkQSTReponse> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);

}
