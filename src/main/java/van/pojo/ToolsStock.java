package van.pojo;

import java.util.Date;

public class ToolsStock {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_stock.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_stock.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_stock.tools_id
     *
     * @mbg.generated
     */
    private Integer toolsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_stock.warehousing_id
     *
     * @mbg.generated
     */
    private Integer warehousingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_stock.note_taker
     *
     * @mbg.generated
     */
    private String noteTaker;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_stock.record_time
     *
     * @mbg.generated
     */
    private Date recordTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_stock.id
     *
     * @return the value of tools_stock.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_stock.id
     *
     * @param id the value for tools_stock.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_stock.name
     *
     * @return the value of tools_stock.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_stock.name
     *
     * @param name the value for tools_stock.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_stock.tools_id
     *
     * @return the value of tools_stock.tools_id
     *
     * @mbg.generated
     */
    public Integer getToolsId() {
        return toolsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_stock.tools_id
     *
     * @param toolsId the value for tools_stock.tools_id
     *
     * @mbg.generated
     */
    public void setToolsId(Integer toolsId) {
        this.toolsId = toolsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_stock.warehousing_id
     *
     * @return the value of tools_stock.warehousing_id
     *
     * @mbg.generated
     */
    public Integer getWarehousingId() {
        return warehousingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_stock.warehousing_id
     *
     * @param warehousingId the value for tools_stock.warehousing_id
     *
     * @mbg.generated
     */
    public void setWarehousingId(Integer warehousingId) {
        this.warehousingId = warehousingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_stock.note_taker
     *
     * @return the value of tools_stock.note_taker
     *
     * @mbg.generated
     */
    public String getNoteTaker() {
        return noteTaker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_stock.note_taker
     *
     * @param noteTaker the value for tools_stock.note_taker
     *
     * @mbg.generated
     */
    public void setNoteTaker(String noteTaker) {
        this.noteTaker = noteTaker == null ? null : noteTaker.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_stock.record_time
     *
     * @return the value of tools_stock.record_time
     *
     * @mbg.generated
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_stock.record_time
     *
     * @param recordTime the value for tools_stock.record_time
     *
     * @mbg.generated
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}