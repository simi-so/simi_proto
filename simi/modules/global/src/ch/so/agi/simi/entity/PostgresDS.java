package ch.so.agi.simi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "SIMI_POSTGRES_DS")
@Entity(name = "simi_PostgresDS")
public class PostgresDS extends SingleActor {
    private static final long serialVersionUID = 7162102249320888437L;

    @NotNull
    @Column(name = "TABLENAME", nullable = false)
    protected String tablename;

    @NotNull
    @Column(name = "IN_DATA_SERVICES", nullable = false)
    protected Boolean inDataServices = false;

    @Max(100)
    @Min(0)
    @NotNull
    @Column(name = "DEF_TRANSPARENCY", nullable = false)
    protected Integer defTransparency = 0;

    public Integer getDefTransparency() {
        return defTransparency;
    }

    public void setDefTransparency(Integer defTransparency) {
        this.defTransparency = defTransparency;
    }

    public Boolean getInDataServices() {
        return inDataServices;
    }

    public void setInDataServices(Boolean inDataServices) {
        this.inDataServices = inDataServices;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }
}