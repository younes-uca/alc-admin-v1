import {ParcoursCriteria} from './ParcoursCriteria.model';
import {TypeTeacherCriteria} from './TypeTeacherCriteria.model';
import {RecommendTeacherCriteria} from './RecommendTeacherCriteria.model';
import {CategorieProfCriteria} from './CategorieProfCriteria.model';
import {TrancheHoraireProfCriteria} from './TrancheHoraireProfCriteria.model';
import {ClassRoomCriteria} from './ClassRoomCriteria.model';
import {User} from 'src/app/zynerator/security/User.model';


export class ProfCriteria  extends    User {

    public ref: string;
    public refLike: string;
    public about: string;
    public aboutLike: string;
    public email: string;
    public emailLike: string;
    public credentialsNonExpired: null | boolean;
    public enabled: null | boolean;
    public accountNonExpired: null | boolean;
    public accountNonLocked: null | boolean;
    public passwordChanged: null | boolean;
    public createdAt: Date;
    public createdAtFrom: Date;
    public createdAtTo: Date;
    public updatedAt: Date;
    public updatedAtFrom: Date;
    public updatedAtTo: Date;
    public username: string;
    public usernameLike: string;
    public password: string;
    public passwordLike: string;
    public prenom: string;
    public prenomLike: string;
    public nom: string;
    public nomLike: string;
  public parcours: ParcoursCriteria ;
  public categorieProf: CategorieProfCriteria ;
  public typeTeacher: TypeTeacherCriteria ;
      public trancheHoraireProfList: Array<TrancheHoraireProfCriteria>;
      public classRooms: Array<ClassRoomCriteria>;
      public recommendTeachers: Array<RecommendTeacherCriteria>;

      //last added
    public maxResults: number;
    public page: number;

}
