package https.github.com.trabwlg.Patri.git.Patrimonio.model;
import jakarta.persistence.*;

@Entity
@Table(name="tb_patrimonio")

public class Patrimonio {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

@Column(name="nr_patrimonio",nullable = false,length = 50)
    private String nr_patrimonio;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNr_patrimonio() {
        return nr_patrimonio;
    }

    public void setNr_patrimonio(String nr_patrimonio) {
        this.nr_patrimonio = nr_patrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    @Column(name="descricao", nullable = false,length = 255)
    private String descricao;

    @Column(name="local",nullable = false,length = 255 )
    private String Local;

    public Patrimonio(Long id, String nr_patrimonio, String descricao, String local) {
        Id = id;
        this.nr_patrimonio = nr_patrimonio;
        this.descricao = descricao;
        Local = local;
    }
}
