package BillingSystem.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

//import static BillingSystem.entity.User.dateTimeFormatter;


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

//    @Column(name = "payment_date")
//    private String paymentDate;

    @Column(name = "bill_amt")
    private Double billAmount;

//    @Column(name = "paid_amt")
//    private Double paidAmount;

    @Column(name = "previous_balance")
    private Double previousBalance;

//    @Column(name = "readingDate")
//    private String readingDate;

    @Column(name = "presentreading")
    private Double presentreading;

//    @Column(name = "previousreading")
//    private Double previousreading;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "billing_user_id_fk")
    )
    private User user;

    /**
     * Instantiates a new Billing.
     */
    public Billing() {
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
//     */
//    public Double getPaidAmount() {
//        return paidAmount;
//    }
//
//    /**
//     * Sets paid amount.
//     *
//     * @param paidAmount the paid amount
//     */
//    public void setPaidAmount(Double paidAmount) {
//        this.paidAmount = paidAmount;
//    }

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

//    /**
//     * Gets reading date.
//     *
//     * @return the reading date
//     */
//    public String getReadingDate() {
//        return readingDate;
//    }
//
//    /**
//     * Sets reading date.
//     *
//     * @param readingDate the reading date
//     */
//    public void setReadingDate(String readingDate) {
//        this.readingDate = readingDate;
//    }

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

//    /**
//     * Gets previousreading.
//     *
//     * @return the previousreading
//     */
//    public Double getPreviousreading() {
//        return previousreading;
//    }
//
//    /**
//     * Sets previousreading.
//     *
//     * @param previousreading the previousreading
//     */
//    public void setPreviousreading(Double previousreading) {
//        this.previousreading = previousreading;
//    }

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


    /**
     * Get total double.
     *
     * @param previousBalance the previous balance
     * @param presentreading  the presentreading
     * @return the double
     */
    public double getTotal (double previousBalance, double presentreading){
        return  (double) previousBalance + (presentreading + (presentreading *  5.50 / 100.00));
    }

    /**
     * Get tax double.
     *
     * @param presentreading the presentreading
     * @return the double
     */
    public double getTax(double presentreading){
        return (double) presentreading *  (5.50 / 100.00);
    }


    /**
     * Instantiates a new Billing.
     *
     * @param billAmount      the bill amount
     * @param previousBalance the previous balance
     * @param presentreading  the presentreading
     * @param user            the user
     */
    public Billing( Double billAmount,  Double previousBalance,  Double presentreading, User user) {
        this.billAmount = billAmount;
        this.previousBalance = previousBalance;
        this.presentreading = presentreading;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "id=" + id +
                ", billAmount=" + billAmount +
                ", previousBalance=" + previousBalance +
                ", presentreading=" + presentreading +
                ", user=" + user +
                '}';
    }


}
