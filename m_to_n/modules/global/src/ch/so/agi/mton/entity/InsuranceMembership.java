package ch.so.agi.mton.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "MTON_INSURANCE_MEMBERSHIP")
@Entity(name = "mton_InsuranceMembership")
public class InsuranceMembership extends StandardEntity {
    private static final long serialVersionUID = 7627519202543270294L;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "VALID_FROM", nullable = false)
    protected Date validFrom;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "VALID_UNTIL")
    protected Date validUntil;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PET_ID")
    protected Pet pet;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INSURANCE_COMPANY_ID")
    protected InsuranceCompany insuranceCompany;

    public InsuranceCompany getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }
}