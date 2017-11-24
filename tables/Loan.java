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
public class Loan implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private long assetId;
    private String borrower;
    private String dWhen;

    public Loan(long assetId, String borrower, String when) {
        this.assetId = assetId;
        this.borrower = borrower;
        this.dWhen = when;
    }

    public Loan() {
    }
        
        

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAssetId() {
        return assetId;
    }

    public void setAssetId(long assetId) {
        this.assetId = assetId;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getWhen() {
        return dWhen;
    }

    public void setWhen(String when) {
        this.dWhen = when;
    }
}
