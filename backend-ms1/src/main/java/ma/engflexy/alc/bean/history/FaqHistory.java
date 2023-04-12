package ma.engflexy.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.engflexy.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "faq")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="faq_seq",sequenceName="faq_seq",allocationSize=1, initialValue = 1)
public class FaqHistory extends HistBusinessObject  {


    public FaqHistory() {
    super();
    }

    public FaqHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="faq_seq")
    public Long getId() {
    return id;
    }
}

