import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "tiket")
public class Tiket {
	
	@TableGenerator(name = "tiket_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "tiket_gen")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "tiket_gen")
    @Column(name = "id",updatable=false,nullable=false)
	private int id;
	
	private String utakmicaid;
	
	private int kladionicarid;
	
	private int kvota;
	
	private String ishod;
	
	private int vrednost;
	
public Tiket(String utakmicaid, int tiketid, int kvota, String ishod, int vrednost) {
	
		this.utakmicaid = utakmicaid;
		this.kladionicarid = tiketid;
		this.kvota = kvota;
		this.ishod = ishod;
		this.vrednost = vrednost;
	}

public String getUtakmicaid() {
		return utakmicaid;
	}

	public void setUtakmicaid(String utakmicaid) {
		this.utakmicaid = utakmicaid;
	}

	public int getTiketid() {
		return kladionicarid;
	}

	public void setTiketid(int tiketid) {
		this.kladionicarid = tiketid;
	}

	public int getKvota() {
		return kvota;
	}

	public void setKvota(int kvota) {
		this.kvota = kvota;
	}

	public String getIshod() {
		return ishod;
	}

	public void setIshod(String ishod) {
		this.ishod = ishod;
	}

	public int getVrednost() {
		return vrednost;
	}

	public void setVrednost(int vrednost) {
		this.vrednost = vrednost;
	}

public Tiket() {}

@Override
public String toString() {
	return "Tiket [id=" + id + ", utakmicaid=" + utakmicaid + ", tiketid=" + kladionicarid + ", kvota=" + kvota + ", ishod="
			+ ishod + ", vrednost=" + vrednost + "]";
}


}
