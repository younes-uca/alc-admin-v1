package  ma.engflexy.alc.ws.dto;

import ma.engflexy.alc.zynerator.audit.Log;
import ma.engflexy.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuizClassRoomDto  extends AuditBaseDto {


    private ClassRoomDto classRoom ;
    private QuizDto quiz ;



    public QuizClassRoomDto(){
        super();
    }




    public ClassRoomDto getClassRoom(){
        return this.classRoom;
    }

    public void setClassRoom(ClassRoomDto classRoom){
        this.classRoom = classRoom;
    }
    public QuizDto getQuiz(){
        return this.quiz;
    }

    public void setQuiz(QuizDto quiz){
        this.quiz = quiz;
    }




}
