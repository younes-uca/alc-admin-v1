package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.ClassRoom;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ClassRoomDao extends AbstractRepository<ClassRoom,Long>  {

    List<ClassRoom> findByProfId(Long id);
    int deleteByProfId(Long id);

}
