package  ma.engflexy.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.engflexy.alc.zynerator.util.ListUtil;

import ma.engflexy.alc.bean.core.Parcours;
import ma.engflexy.alc.bean.core.CategorieProf;

import ma.engflexy.alc.zynerator.util.StringUtil;
import ma.engflexy.alc.zynerator.converter.AbstractConverter;
import ma.engflexy.alc.zynerator.util.DateUtil;
import ma.engflexy.alc.bean.history.ProfHistory;
import ma.engflexy.alc.bean.core.Prof;
import ma.engflexy.alc.ws.dto.ProfDto;

@Component
public class ProfConverter extends AbstractConverter<Prof, ProfDto, ProfHistory> {

    @Autowired
    private TypeTeacherConverter typeTeacherConverter ;
    @Autowired
    private ParcoursConverter parcoursConverter ;
    @Autowired
    private TrancheHoraireProfConverter trancheHoraireProfConverter ;
    @Autowired
    private QuizConverter quizConverter ;
    @Autowired
    private CategorieProfConverter categorieProfConverter ;
    @Autowired
    private EtudiantClassRoomConverter etudiantClassRoomConverter ;
    @Autowired
    private ClassRoomConverter classRoomConverter ;
    @Autowired
    private RecommendTeacherConverter recommendTeacherConverter ;
    @Autowired
    private QuizClassRoomConverter quizClassRoomConverter ;
    @Autowired
    private EtudiantConverter etudiantConverter ;
    private boolean parcours;
    private boolean categorieProf;
    private boolean typeTeacher;
    private boolean trancheHoraireProfList;
    private boolean classRooms;
    private boolean recommendTeachers;

    public  ProfConverter(){
        super(Prof.class, ProfDto.class, ProfHistory.class);
        init(true);
    }

    @Override
    public Prof toItem(ProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        Prof item = new Prof();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getAbout()))
                item.setAbout(dto.getAbout());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            item.setCredentialsNonExpired(dto.getCredentialsNonExpired());
            item.setEnabled(dto.getEnabled());
            item.setAccountNonExpired(dto.getAccountNonExpired());
            item.setAccountNonLocked(dto.getAccountNonLocked());
            item.setPasswordChanged(dto.getPasswordChanged());
            if(StringUtil.isNotEmpty(dto.getCreatedAt().toString()))
                item.setCreatedAt(dto.getCreatedAt());
            if(StringUtil.isNotEmpty(dto.getUpdatedAt().toString()))
                item.setUpdatedAt(dto.getUpdatedAt());
            if(StringUtil.isNotEmpty(dto.getUsername()))
                item.setUsername(dto.getUsername());
            if(StringUtil.isNotEmpty(dto.getPassword()))
                item.setPassword(dto.getPassword());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(dto.getParcours() != null && dto.getParcours().getId() != null){
                item.setParcours(new Parcours());
                item.getParcours().setId(dto.getParcours().getId());
            }

            if(dto.getCategorieProf() != null && dto.getCategorieProf().getId() != null){
                item.setCategorieProf(new CategorieProf());
                item.getCategorieProf().setId(dto.getCategorieProf().getId());
            }

            if(this.typeTeacher && dto.getTypeTeacher()!=null)
                item.setTypeTeacher(typeTeacherConverter.toItem(dto.getTypeTeacher())) ;


            if(this.trancheHoraireProfList && ListUtil.isNotEmpty(dto.getTrancheHoraireProfList()))
                item.setTrancheHoraireProfList(trancheHoraireProfConverter.toItem(dto.getTrancheHoraireProfList()));
            if(this.classRooms && ListUtil.isNotEmpty(dto.getClassRooms()))
                item.setClassRooms(classRoomConverter.toItem(dto.getClassRooms()));
            if(this.recommendTeachers && ListUtil.isNotEmpty(dto.getRecommendTeachers()))
                item.setRecommendTeachers(recommendTeacherConverter.toItem(dto.getRecommendTeachers()));

        return item;
        }
    }

    @Override
    public ProfDto toDto(Prof item) {
        if (item == null) {
            return null;
        } else {
            ProfDto dto = new ProfDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getAbout()))
                dto.setAbout(item.getAbout());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getCredentialsNonExpired()))
                dto.setCredentialsNonExpired(item.getCredentialsNonExpired());
            if(StringUtil.isNotEmpty(item.getEnabled()))
                dto.setEnabled(item.getEnabled());
            if(StringUtil.isNotEmpty(item.getAccountNonExpired()))
                dto.setAccountNonExpired(item.getAccountNonExpired());
            if(StringUtil.isNotEmpty(item.getAccountNonLocked()))
                dto.setAccountNonLocked(item.getAccountNonLocked());
            if(StringUtil.isNotEmpty(item.getPasswordChanged()))
                dto.setPasswordChanged(item.getPasswordChanged());
            if(StringUtil.isNotEmpty(item.getCreatedAt().toString()))
                dto.setCreatedAt(item.getCreatedAt());
            if(StringUtil.isNotEmpty(item.getUpdatedAt().toString()))
                dto.setUpdatedAt(item.getUpdatedAt());
            if(StringUtil.isNotEmpty(item.getUsername()))
                dto.setUsername(item.getUsername());
            if(StringUtil.isNotEmpty(item.getPassword()))
                dto.setPassword(item.getPassword());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
        if(this.parcours && item.getParcours()!=null) {
            dto.setParcours(parcoursConverter.toDto(item.getParcours())) ;
        }
        if(this.categorieProf && item.getCategorieProf()!=null) {
            dto.setCategorieProf(categorieProfConverter.toDto(item.getCategorieProf())) ;
        }
        if(this.typeTeacher && item.getTypeTeacher()!=null) {
            dto.setTypeTeacher(typeTeacherConverter.toDto(item.getTypeTeacher())) ;
        }
        if(this.trancheHoraireProfList && ListUtil.isNotEmpty(item.getTrancheHoraireProfList())){
            trancheHoraireProfConverter.init(true);
            trancheHoraireProfConverter.setProf(false);
            dto.setTrancheHoraireProfList(trancheHoraireProfConverter.toDto(item.getTrancheHoraireProfList()));
            trancheHoraireProfConverter.setProf(true);

        }
        if(this.classRooms && ListUtil.isNotEmpty(item.getClassRooms())){
            classRoomConverter.init(true);
            classRoomConverter.setProf(false);
            dto.setClassRooms(classRoomConverter.toDto(item.getClassRooms()));
            classRoomConverter.setProf(true);

        }
        if(this.recommendTeachers && ListUtil.isNotEmpty(item.getRecommendTeachers())){
            recommendTeacherConverter.init(true);
            recommendTeacherConverter.setProf(false);
            dto.setRecommendTeachers(recommendTeacherConverter.toDto(item.getRecommendTeachers()));
            recommendTeacherConverter.setProf(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.trancheHoraireProfList = value;
        this.classRooms = value;
        this.recommendTeachers = value;
    }

    public void initObject(boolean value) {
        this.parcours = value;
        this.categorieProf = value;
        this.typeTeacher = value;
    }


    public TypeTeacherConverter getTypeTeacherConverter(){
        return this.typeTeacherConverter;
    }
    public void setTypeTeacherConverter(TypeTeacherConverter typeTeacherConverter ){
        this.typeTeacherConverter = typeTeacherConverter;
    }
    public ParcoursConverter getParcoursConverter(){
        return this.parcoursConverter;
    }
    public void setParcoursConverter(ParcoursConverter parcoursConverter ){
        this.parcoursConverter = parcoursConverter;
    }
    public TrancheHoraireProfConverter getTrancheHoraireProfConverter(){
        return this.trancheHoraireProfConverter;
    }
    public void setTrancheHoraireProfConverter(TrancheHoraireProfConverter trancheHoraireProfConverter ){
        this.trancheHoraireProfConverter = trancheHoraireProfConverter;
    }
    public QuizConverter getQuizConverter(){
        return this.quizConverter;
    }
    public void setQuizConverter(QuizConverter quizConverter ){
        this.quizConverter = quizConverter;
    }
    public CategorieProfConverter getCategorieProfConverter(){
        return this.categorieProfConverter;
    }
    public void setCategorieProfConverter(CategorieProfConverter categorieProfConverter ){
        this.categorieProfConverter = categorieProfConverter;
    }
    public EtudiantClassRoomConverter getEtudiantClassRoomConverter(){
        return this.etudiantClassRoomConverter;
    }
    public void setEtudiantClassRoomConverter(EtudiantClassRoomConverter etudiantClassRoomConverter ){
        this.etudiantClassRoomConverter = etudiantClassRoomConverter;
    }
    public ClassRoomConverter getClassRoomConverter(){
        return this.classRoomConverter;
    }
    public void setClassRoomConverter(ClassRoomConverter classRoomConverter ){
        this.classRoomConverter = classRoomConverter;
    }
    public RecommendTeacherConverter getRecommendTeacherConverter(){
        return this.recommendTeacherConverter;
    }
    public void setRecommendTeacherConverter(RecommendTeacherConverter recommendTeacherConverter ){
        this.recommendTeacherConverter = recommendTeacherConverter;
    }
    public QuizClassRoomConverter getQuizClassRoomConverter(){
        return this.quizClassRoomConverter;
    }
    public void setQuizClassRoomConverter(QuizClassRoomConverter quizClassRoomConverter ){
        this.quizClassRoomConverter = quizClassRoomConverter;
    }
    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public boolean  isParcours(){
        return this.parcours;
    }
    public void  setParcours(boolean parcours){
        this.parcours = parcours;
    }
    public boolean  isCategorieProf(){
        return this.categorieProf;
    }
    public void  setCategorieProf(boolean categorieProf){
        this.categorieProf = categorieProf;
    }
    public boolean  isTypeTeacher(){
        return this.typeTeacher;
    }
    public void  setTypeTeacher(boolean typeTeacher){
        this.typeTeacher = typeTeacher;
    }
    public boolean  isTrancheHoraireProfList(){
        return this.trancheHoraireProfList ;
    }
    public void  setTrancheHoraireProfList(boolean trancheHoraireProfList ){
        this.trancheHoraireProfList  = trancheHoraireProfList ;
    }
    public boolean  isClassRooms(){
        return this.classRooms ;
    }
    public void  setClassRooms(boolean classRooms ){
        this.classRooms  = classRooms ;
    }
    public boolean  isRecommendTeachers(){
        return this.recommendTeachers ;
    }
    public void  setRecommendTeachers(boolean recommendTeachers ){
        this.recommendTeachers  = recommendTeachers ;
    }
}
