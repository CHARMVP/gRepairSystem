package com.ruoyi.web.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.springframework.context.annotation.ComponentScan;

/**
 * 设备信息对象 device
 *
 * @author guo
 * @date 2021-12-21
 */
public class Device extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备编号 */
    private Long id;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String name;

    /** 设备购买日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "设备购买日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date buyTime;

    /** 生产线 */
    @Excel(name = "生产线")
    private String productionLine;

    /** 生产厂家 */
    @Excel(name = "生产厂家")
    private String manufacturer;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String type;

    /** 固定资产号 */
    @Excel(name = "固定资产号")
    private Long fixedAssetId;

    /** 供应商联系方式 */
    @Excel(name = "供应商联系方式")
    private Long supplierPhoneNumber;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setBuyTime(Date buyTime)
    {
        this.buyTime = buyTime;
    }

    public Date getBuyTime()
    {
        return buyTime;
    }
    public void setProductionLine(String productionLine)
    {
        this.productionLine = productionLine;
    }

    public String getProductionLine()
    {
        return productionLine;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setFixedAssetId(Long fixedAssetId)
    {
        this.fixedAssetId = fixedAssetId;
    }

    public Long getFixedAssetId()
    {
        return fixedAssetId;
    }
    public void setSupplierPhoneNumber(Long supplierPhoneNumber)
    {
        this.supplierPhoneNumber = supplierPhoneNumber;
    }

    public Long getSupplierPhoneNumber()
    {
        return supplierPhoneNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("buyTime", getBuyTime())
            .append("productionLine", getProductionLine())
            .append("manufacturer", getManufacturer())
            .append("type", getType())
            .append("fixedAssetId", getFixedAssetId())
            .append("supplierPhoneNumber", getSupplierPhoneNumber())
            .toString();
    }
}
