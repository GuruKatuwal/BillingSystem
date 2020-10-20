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

    @Column(name = "payment_date")
    private String paymentDate;

    @Column(name = "bill_amt")
    private String billAmount;

    @Column(name = "paid_amt")
    private String paidAmount;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    @OneToMany(mappedBy = "billing", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Invoice> Invoices = new HashSet<>();

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
     * Gets Invoices.
     *
     * @return the Invoices
     */
    public Set<Invoice> getInvoices() {
        return Invoices;
    }


    /**
     * Sets Invoices.
     *
     * @param Invoices the Invoices
     */
    public void setInvoices(Set<Invoice> Invoices) {
        this.Invoices = Invoices;
    }


    /**
     * Instantiates a new Billing.
     */
    public Billing() {
    }

    /**
     * Instantiates a new Billing.
     *
     * @param paymentDate the payment date
     * @param billAmount  the bill amount
     * @param paidAmount  the paid amount
     */
    public Billing(String paymentDate, String billAmount, String paidAmount) {
        this.paymentDate = paymentDate;
        this.billAmount = billAmount;
        this.paidAmount = paidAmount;
    }
}
