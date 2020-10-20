package BillingSystem.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Account.
 */
@Entity(name = "Account")
@Table(name="account")

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "reg_no")
    private String reg_no;

    @ManyToOne
    private User user;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets reg no.
     *
     * @return the reg no
     */
    public String getReg_no() {
        return reg_no;
    }

    /**
     * Sets reg no.
     *
     * @param reg_no the reg no
     */
    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
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

    /**
     * Instantiates a new Account.
     */
    public Account() {
    }

    /**
     * Instantiates a new Account.
     *
     * @param name    the name
     * @param address the address
     * @param reg_no  the reg no
     */
    public Account(String name, String address, String reg_no) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.reg_no = reg_no;
     }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", reg_no='" + reg_no + '\'' +
                ", user=" + user +
                '}';
    }
}
