package BillingSystem.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * The type Billing.
 */
@Entity(name = "Billing")
@Table(name = "billing")

public class Billing {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;
    @Column(name = "payment_date")
    private Date paymentDate;
    @Column(name = "name")
    private String name;
    @Column(name = "bill_amount")
    private Float billAmount;
    @Column(name = "paid_amount")
    private Float paidAmoint;

    /**
     * The Customer.
     */
    @ManyToOne
    Customer customer;

    /**
     * Gets customer.
     *
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets customer.
     *
     * @param customer the customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
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
     * Gets payment date.
     *
     * @return the payment date
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets payment date.
     *
     * @param paymentDate the payment date
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * Gets cutomer name.
     *
     * @return the cutomer name
     */
    public String getCutomerName() {
        return name;
    }

    /**
     * Sets cutomer name.
     *
     * @param customerName the customer name
     */
    public void setCutomerName(String customerName) {
        this.name = name;
    }

    /**
     * Gets bill amount.
     *
     * @return the bill amount
     */
    public Float getBillAmount() {
        return billAmount;
    }

    /**
     * Sets bill amount.
     *
     * @param billAmount the bill amount
     */
    public void setBillAmount(Float billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * Gets paid amoint.
     *
     * @return the paid amoint
     */
    public Float getPaidAmoint() {
        return paidAmoint;
    }

    /**
     * Sets paid amoint.
     *
     * @param paidAmoint the paid amoint
     */
    public void setPaidAmoint(Float paidAmoint) {
        this.paidAmoint = paidAmoint;
    }

    /**
     * Instantiates a new Billing.
     */
    public Billing() {
    }

    /**
     * Instantiates a new Billing.
     *
     * @param id           the id
     * @param customer     the customer
     * @param paymentDate  the payment date
     * @param customerName the customer name
     * @param billAmount   the bill amount
     * @param paidAmoint   the paid amoint
     */
    public Billing(int id, Customer customer,Date paymentDate, String customerName, Float billAmount, Float paidAmoint) {
        this.id = id;
        this.paymentDate = paymentDate;
        this.customer = customer;
        this.billAmount = billAmount;
        this.paidAmoint = paidAmoint;

    }


}
