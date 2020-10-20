package BillingSystem.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Invoice.
 */
@Entity(name="Billing")
@Table(name="invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "reading_date")
    private String readingDate;

    @Column(name = "present_reading")
    private String presentreading;

    @Column(name = "previous_balance")
    private String previousReading;

    @Column(name = "due_date")
    private String dueDate;

    @ManyToOne
    private Billing billing;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets reading date.
     *
     * @return the reading date
     */
    public String getReadingDate() {
        return readingDate;
    }

    /**
     * Sets reading date.
     *
     * @param readingDate the reading date
     */
    public void setReadingDate(String readingDate) {
        this.readingDate = readingDate;
    }

    /**
     * Gets presentreading.
     *
     * @return the presentreading
     */
    public String getPresentreading() {
        return presentreading;
    }

    /**
     * Sets presentreading.
     *
     * @param presentreading the presentreading
     */
    public void setPresentreading(String presentreading) {
        this.presentreading = presentreading;
    }

    /**
     * Gets previous reading.
     *
     * @return the previous reading
     */
    public String getPreviousReading() {
        return previousReading;
    }

    /**
     * Sets previous reading.
     *
     * @param previousReading the previous reading
     */
    public void setPreviousReading(String previousReading) {
        this.previousReading = previousReading;
    }

    /**
     * Gets due date.
     *
     * @return the due date
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets due date.
     *
     * @param dueDate the due date
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Gets billing.
     *
     * @return the billing
     */
    public Billing getBilling() {
        return billing;
    }

    /**
     * Sets billing.
     *
     * @param billing the billing
     */
    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    /**
     * Instantiates a new Invoice.
     */
    public Invoice() {
    }

    /**
     * Instantiates a new Invoice.
     *
     * @param readingDate     the reading date
     * @param presentreading  the presentreading
     * @param previousReading the previous reading
     * @param dueDate         the due date
     */
    public Invoice(String readingDate, String presentreading, String previousReading, String dueDate) {
        this.readingDate = readingDate;
        this.presentreading = presentreading;
        this.previousReading = previousReading;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", readingDate='" + readingDate + '\'' +
                ", presentreading='" + presentreading + '\'' +
                ", previousReading='" + previousReading + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", billing=" + billing +
                '}';
    }
}
