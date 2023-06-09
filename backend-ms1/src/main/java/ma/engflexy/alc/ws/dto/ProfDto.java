package  ma.engflexy.alc.ws.dto;

import ma.engflexy.alc.zynerator.audit.Log;
import ma.engflexy.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfDto  extends AuditBaseDto {

    private String ref  ;
    private String about  ;
    private String email  ;
    private Boolean credentialsNonExpired  ;
    private Boolean enabled  ;
    private Boolean accountNonExpired  ;
    private Boolean accountNonLocked  ;
    private Boolean passwordChanged  ;
    private LocalDateTime createdAt ;
    private LocalDateTime updatedAt ;
    private String username  ;
    private String password  ;
    private String prenom  ;
    private String nom  ;

    private ParcoursDto parcours ;
    private CategorieProfDto categorieProf ;
    private TypeTeacherDto typeTeacher ;

    private List<TrancheHoraireProfDto> trancheHoraireProfList ;
    private List<ClassRoomDto> classRooms ;
    private List<RecommendTeacherDto> recommendTeachers ;


    public ProfDto(){
        super();
    }



    @Log
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }

    @Log
    public String getAbout(){
        return this.about;
    }
    public void setAbout(String about){
        this.about = about;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Log
    public Boolean getCredentialsNonExpired(){
        return this.credentialsNonExpired;
    }
    public void setCredentialsNonExpired(Boolean credentialsNonExpired){
        this.credentialsNonExpired = credentialsNonExpired;
    }

    @Log
    public Boolean getEnabled(){
        return this.enabled;
    }
    public void setEnabled(Boolean enabled){
        this.enabled = enabled;
    }

    @Log
    public Boolean getAccountNonExpired(){
        return this.accountNonExpired;
    }
    public void setAccountNonExpired(Boolean accountNonExpired){
        this.accountNonExpired = accountNonExpired;
    }

    @Log
    public Boolean getAccountNonLocked(){
        return this.accountNonLocked;
    }
    public void setAccountNonLocked(Boolean accountNonLocked){
        this.accountNonLocked = accountNonLocked;
    }

    @Log
    public Boolean getPasswordChanged(){
        return this.passwordChanged;
    }
    public void setPasswordChanged(Boolean passwordChanged){
        this.passwordChanged = passwordChanged;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public LocalDateTime getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }

    @Log
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    @Log
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }


    public ParcoursDto getParcours(){
        return this.parcours;
    }

    public void setParcours(ParcoursDto parcours){
        this.parcours = parcours;
    }
    public CategorieProfDto getCategorieProf(){
        return this.categorieProf;
    }

    public void setCategorieProf(CategorieProfDto categorieProf){
        this.categorieProf = categorieProf;
    }
    public TypeTeacherDto getTypeTeacher(){
        return this.typeTeacher;
    }

    public void setTypeTeacher(TypeTeacherDto typeTeacher){
        this.typeTeacher = typeTeacher;
    }



    public List<TrancheHoraireProfDto> getTrancheHoraireProfList(){
        return this.trancheHoraireProfList;
    }

    public void setTrancheHoraireProfList(List<TrancheHoraireProfDto> trancheHoraireProfList){
        this.trancheHoraireProfList = trancheHoraireProfList;
    }
    public List<ClassRoomDto> getClassRooms(){
        return this.classRooms;
    }

    public void setClassRooms(List<ClassRoomDto> classRooms){
        this.classRooms = classRooms;
    }
    public List<RecommendTeacherDto> getRecommendTeachers(){
        return this.recommendTeachers;
    }

    public void setRecommendTeachers(List<RecommendTeacherDto> recommendTeachers){
        this.recommendTeachers = recommendTeachers;
    }

}
