/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Adnan
 */
@Entity
@Table(name = "ProductCategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductCategory.findAll", query = "SELECT p FROM ProductCategory p"),
    @NamedQuery(name = "ProductCategory.findByPcid", query = "SELECT p FROM ProductCategory p WHERE p.pcid = :pcid"),
    @NamedQuery(name = "ProductCategory.findByProductCategoryName", query = "SELECT p FROM ProductCategory p WHERE p.productCategoryName = :productCategoryName")})
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCID")
    private Integer pcid;
    @Basic(optional = false)
    @Column(name = "ProductCategoryName")
    private String productCategoryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryID")
    private Collection<Product> productCollection;

    public ProductCategory() {
    }

    public ProductCategory(Integer pcid) {
        this.pcid = pcid;
    }

    public ProductCategory(Integer pcid, String productCategoryName) {
        this.pcid = pcid;
        this.productCategoryName = productCategoryName;
    }

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcid != null ? pcid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategory)) {
            return false;
        }
        ProductCategory other = (ProductCategory) object;
        if ((this.pcid == null && other.pcid != null) || (this.pcid != null && !this.pcid.equals(other.pcid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.ProductCategory[ pcid=" + pcid + " ]";
    }
    
}
