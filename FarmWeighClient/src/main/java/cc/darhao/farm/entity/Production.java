package cc.darhao.farm.entity;

import java.util.Date;

public class Production {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.id
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.name
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.supplier
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    private Integer supplier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.weight
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    private String weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.type
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.create_time
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.is_offline
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    private Boolean isOffline;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.id
     *
     * @return the value of production.id
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.id
     *
     * @param id the value for production.id
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.name
     *
     * @return the value of production.name
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.name
     *
     * @param name the value for production.name
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.supplier
     *
     * @return the value of production.supplier
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public Integer getSupplier() {
        return supplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.supplier
     *
     * @param supplier the value for production.supplier
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.weight
     *
     * @return the value of production.weight
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public String getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.weight
     *
     * @param weight the value for production.weight
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.type
     *
     * @return the value of production.type
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.type
     *
     * @param type the value for production.type
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.create_time
     *
     * @return the value of production.create_time
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.create_time
     *
     * @param createTime the value for production.create_time
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.is_offline
     *
     * @return the value of production.is_offline
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public Boolean getIsOffline() {
        return isOffline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.is_offline
     *
     * @param isOffline the value for production.is_offline
     *
     * @mbggenerated Wed Apr 11 22:04:25 CST 2018
     */
    public void setIsOffline(Boolean isOffline) {
        this.isOffline = isOffline;
    }
}