/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adnan
 */
@Entity
@Table(name = "Menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByMenuID", query = "SELECT m FROM Menu m WHERE m.menuID = :menuID"),
    @NamedQuery(name = "Menu.findByProductName", query = "SELECT m FROM Menu m WHERE m.productName = :productName"),
    @NamedQuery(name = "Menu.findByProductType", query = "SELECT m FROM Menu m WHERE m.productType = :productType"),
    @NamedQuery(name = "Menu.findByProductCategory", query = "SELECT m FROM Menu m WHERE m.productCategory = :productCategory")})
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MenuID")
    private Integer menuID;
    @Basic(optional = false)
    @Column(name = "ProductName")
    private String productName;
    @Basic(optional = false)
    @Column(name = "ProductType")
    private String productType;
    @Basic(optional = false)
    @Column(name = "ProductCategory")
    private String productCategory;
    @JoinColumn(name = "ProductID", referencedColumnName = "PID")
    @ManyToOne(optional = false)
    private Product productID;

    public Menu() {
    }

    public Menu(Integer menuID) {
        this.menuID = menuID;
    }

    public Menu(Integer menuID, String productName, String productType, String productCategory) {
        this.menuID = menuID;
        this.productName = productName;
        this.productType = productType;
        this.productCategory = productCategory;
    }

    public Integer getMenuID() {
        return menuID;
    }

    public void setMenuID(Integer menuID) {
        this.menuID = menuID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuID != null ? menuID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.menuID == null && other.menuID != null) || (this.menuID != null && !this.menuID.equals(other.menuID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Menu[ menuID=" + menuID + " ]";
    }
    
}
