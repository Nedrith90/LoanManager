package tables;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 *
 * @author Nedrith
 */
@Entity
public class Asset implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int quantity;
    private double value;

    public Asset() {
    }

    public Asset(String name, int quantity, double value) {
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }
        

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getValue() {
        return value;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(double value) {
        this.value = value;
    }
        
        
}
