import java.util.ArrayList;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Produto {

	private ArrayList<Descriptions> descriptions;
	

}
