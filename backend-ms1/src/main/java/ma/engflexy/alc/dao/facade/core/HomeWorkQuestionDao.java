package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.HomeWorkQuestion;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.HomeWorkQuestion;
import java.util.List;


@Repository
public interface HomeWorkQuestionDao extends AbstractRepository<HomeWorkQuestion,Long>  {
    HomeWorkQuestion findByRef(String ref);
    int deleteByRef(String ref);

    List<HomeWorkQuestion> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<HomeWorkQuestion> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);

}
