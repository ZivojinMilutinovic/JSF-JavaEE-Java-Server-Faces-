import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "utakmica")
public class Utakmica {
	
	@TableGenerator(name = "utakmica_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "utakmica_gen")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utakmica_gen")
    @Column(name = "uid",updatable=false,nullable=false)
	
	private int id;
	
	

	private String ekipa1;
	
	private String ekipa2;
	
	private String ishod;
	
	private String mestoodrzavanja;
	
public Utakmica( String ekipa1, String ekipa2, String ishod, String mestoodrzavanja) {
		
		
		this.ekipa1 = ekipa1;
		this.ekipa2 = ekipa2;
		this.ishod = ishod;
		this.mestoodrzavanja = mestoodrzavanja;
	}

public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEkipa1() {
		return ekipa1;
	}

	public void setEkipa1(String ekipa1) {
		this.ekipa1 = ekipa1;
	}

	public String getEkipa2() {
		return ekipa2;
	}

	public void setEkipa2(String ekipa2) {
		this.ekipa2 = ekipa2;
	}

	public String getIshod() {
		return ishod;
	}

	public void setIshod(String ishod) {
		this.ishod = ishod;
	}

	public String getMestoodrzavanja() {
		return mestoodrzavanja;
	}

	public void setMestoodrzavanja(String mestoodrzavanja) {
		this.mestoodrzavanja = mestoodrzavanja;
	}

public Utakmica() {}

@Override
public String toString() {
	return "Utakmica [id=" + id + ", ekipa1=" + ekipa1 + ", ekipa2=" + ekipa2 + ", ishod=" + ishod
			+ ", mestoodrzavanja=" + mestoodrzavanja + "]";
}
}
