/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adnan
 */
@Entity
@Table(name = "Invoice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i"),
    @NamedQuery(name = "Invoice.findByIvid", query = "SELECT i FROM Invoice i WHERE i.ivid = :ivid"),
    @NamedQuery(name = "Invoice.findByOrderNumber", query = "SELECT i FROM Invoice i WHERE i.orderNumber = :orderNumber"),
    @NamedQuery(name = "Invoice.findByCustomerName", query = "SELECT i FROM Invoice i WHERE i.customerName = :customerName"),
    @NamedQuery(name = "Invoice.findByInvoiceDate", query = "SELECT i FROM Invoice i WHERE i.invoiceDate = :invoiceDate"),
    @NamedQuery(name = "Invoice.findByInvoiceTotal", query = "SELECT i FROM Invoice i WHERE i.invoiceTotal = :invoiceTotal"),
    @NamedQuery(name = "Invoice.findByBillingAddress", query = "SELECT i FROM Invoice i WHERE i.billingAddress = :billingAddress"),
    @NamedQuery(name = "Invoice.findByEmployeeName", query = "SELECT i FROM Invoice i WHERE i.employeeName = :employeeName")})
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IVID")
    private Integer ivid;
    @Basic(optional = false)
    @Column(name = "OrderNumber")
    private String orderNumber;
    @Basic(optional = false)
    @Column(name = "CustomerName")
    private String customerName;
    @Basic(optional = false)
    @Column(name = "InvoiceDate")
    @Temporal(TemporalType.DATE)
    private Date invoiceDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "InvoiceTotal")
    private BigDecimal invoiceTotal;
    @Basic(optional = false)
    @Column(name = "BillingAddress")
    private String billingAddress;
    @Basic(optional = false)
    @Column(name = "EmployeeName")
    private String employeeName;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CID")
    @ManyToOne(optional = false)
    private Customer customerID;
    @JoinColumn(name = "EmployeeID", referencedColumnName = "EID")
    @ManyToOne(optional = false)
    private Employee employeeID;
    @JoinColumn(name = "OrderID", referencedColumnName = "OID")
    @ManyToOne(optional = false)
    private Orders orderID;

    public Invoice() {
    }

    public Invoice(Integer ivid) {
        this.ivid = ivid;
    }

    public Invoice(Integer ivid, String orderNumber, String customerName, Date invoiceDate, BigDecimal invoiceTotal, String billingAddress, String employeeName) {
        this.ivid = ivid;
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;
        this.invoiceTotal = invoiceTotal;
        this.billingAddress = billingAddress;
        this.employeeName = employeeName;
    }

    public Integer getIvid() {
        return ivid;
    }

    public void setIvid(Integer ivid) {
        this.ivid = ivid;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public BigDecimal getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(BigDecimal invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    public Orders getOrderID() {
        return orderID;
    }

    public void setOrderID(Orders orderID) {
        this.orderID = orderID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ivid != null ? ivid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.ivid == null && other.ivid != null) || (this.ivid != null && !this.ivid.equals(other.ivid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Invoice[ ivid=" + ivid + " ]";
    }
    
}
