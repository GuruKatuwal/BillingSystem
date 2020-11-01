package BillingSystem.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

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
    private String billAmount;

    @Column(name = "paid_amt")
    private String paidAmount;

    @Column(name = "reading_date")
    private String readingDate;

    @Column(name = "present_reading")
    private String presentReading;

    @Column(name = "previous_balance")
    private String previousBalance;

    @Column(name = "reg_no")
    private String registration;

    @ManyToOne
    private User user;

    /**
     * Instantiates a new Billing.
     */
    public Billing() {
    }

    /**
     * Instantiates a new Billing.
     *
     * @param paymentDate     the payment date
     * @param billAmount      the bill amount
     * @param paidAmount      the paid amount
     * @param readingDate     the reading date
     * @param presentReading  the present reading
     * @param previousBalance the previous balance
     * @param registration    the registration
      */
    public Billing(String paymentDate, String billAmount, String paidAmount, String readingDate, String presentReading, String previousBalance,String registration,User user) {
        this.user = user;
        this.paymentDate = paymentDate;
        this.billAmount = billAmount;
        this.paidAmount = paidAmount;
        this.readingDate = readingDate;
        this.presentReading = presentReading;
        this.previousBalance = previousBalance;
        this.registration = registration;
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
    public String getBillAmount() {
        return billAmount;
    }

    /**
     * Sets bill amount.
     *
     * @param billAmount the bill amount
     */
    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * Gets paid amount.
     *
     * @return the paid amount
     */
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets paid amount.
     *
     * @param paidAmount the paid amount
     */
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

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
     * Gets present reading.
     *
     * @return the present reading
     */
    public String getPresentReading() {
        return presentReading;
    }

    /**
     * Sets present reading.
     *
     * @param presentReading the present reading
     */
    public void setPresentReading(String presentReading) {
        this.presentReading = presentReading;
    }

    /**
     * Gets previous balance.
     *
     * @return the previous balance
     */
    public String getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets previous balance.
     *
     * @param previousBalance the previous balance
     */
    public void setPreviousBalance(String previousBalance) {
        this.previousBalance = previousBalance;
    }

    /**
     * Gets registration.
     *
     * @return the registration
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * Sets registration.
     *
     * @param registration the registration
     */
    public void setRegistration(String registration) {
        this.registration = registration;
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

    @Override
    public String toString() {
        return "Billing{" +
                "paymentDate='" + paymentDate + '\'' +
                ", billAmount='" + billAmount + '\'' +
                ", paidAmount='" + paidAmount + '\'' +
                ", readingDate='" + readingDate + '\'' +
                ", presentReading='" + presentReading + '\'' +
                ", previousBalance='" + previousBalance + '\'' +
                ", registration='" + registration + '\'' +
                ", id=" + id +
                ", user=" + user +
                '}';
    }

}
