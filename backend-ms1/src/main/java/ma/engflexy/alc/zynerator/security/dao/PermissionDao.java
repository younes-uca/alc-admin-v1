package ma.engflexy.alc.zynerator.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.engflexy.alc.zynerator.security.bean.Permission;

public interface PermissionDao extends JpaRepository<Permission, Long> {
    public Permission findByName(String name);
}
