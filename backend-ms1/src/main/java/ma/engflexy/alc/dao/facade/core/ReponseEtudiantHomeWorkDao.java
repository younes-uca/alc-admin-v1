package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.ReponseEtudiantHomeWork;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ReponseEtudiantHomeWorkDao extends AbstractRepository<ReponseEtudiantHomeWork,Long>  {

    List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(Long id);
    int deleteByHoweWorkQSTReponseId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(Long id);
    int deleteByHomeWorkEtudiantId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);

}
