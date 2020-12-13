package BillingSystem.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.LocalDate;

import static BillingSystem.entity.User.dateTimeFormatter;


/**
 * The type Billing.
 */
@Entity(name = "Billing")
@Table(name = "billing")

public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "payment_date")
    private String paymentDate;

    @Column(name = "bill_amt")
    private Double billAmount;

    @Column(name = "paid_amt")
    private Double paidAmount;

    @Column(name = "previous_balance")
    private Double previousBalance;

    @Column(name = "readingDate")
    private String readingDate;

    @Column(name = "presentreading")
    private Double presentreading;

    @Column(name = "previousreading")
    private Double previousreading;

    @ManyToOne
    private User user;

    /**
     * Instantiates a new Billing.
        */
    public Billing() {
    }

    /**
     * Gets payment date.
     *
     * @return the payment date
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets payment date.
     *
     * @param paymentDate the payment date
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * Gets bill amount.
     *
     * @return the bill amount
     */
    public Double getBillAmount() {
        return billAmount;
    }

    /**
     * Sets bill amount.
     *
     * @param billAmount the bill amount
     */
    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * Gets paid amount.
     *
     * @return the paid amount
     */
    public Double getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets paid amount.
     *
     * @param paidAmount the paid amount
     */
    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Gets previous balance.
     *
     * @return the previous balance
     */
    public Double getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets previous balance.
     *
     * @param previousBalance the previous balance
     */
    public void setPreviousBalance(Double previousBalance) {
        this.previousBalance = previousBalance;
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
    public Double getPresentreading() {
        return presentreading;
    }

    /**
     * Sets presentreading.
     *
     * @param presentreading the presentreading
     */
    public void setPresentreading(Double presentreading) {
        this.presentreading = presentreading;
    }

    /**
     * Gets previousreading.
     *
     * @return the previousreading
     */
    public Double getPreviousreading() {
        return previousreading;
    }

    /**
     * Sets previousreading.
     *
     * @param previousreading the previousreading
     */
    public void setPreviousreading(Double previousreading) {
        this.previousreading = previousreading;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }



    public Billing(String paymentDate, Double billAmount, Double paidAmount, Double previousBalance, String readingDate, Double presentreading, Double previousreading, User user) {
        this.paymentDate = paymentDate;
        this.billAmount = billAmount;
        this.paidAmount = paidAmount;
        this.previousBalance = previousBalance;
        this.readingDate = readingDate;
        this.presentreading = presentreading;
        this.previousreading = previousreading;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "id=" + id +
                ", paymentDate=" + paymentDate +
                ", billAmount=" + billAmount +
                ", paidAmount=" + paidAmount +
                ", previousBalance=" + previousBalance +
                ", readingDate=" + readingDate +
                ", presentreading=" + presentreading +
                ", previousreading=" + previousreading +
                ", user=" + user +
                '}';
    }
}
