package van.pojo;

import java.util.Date;

public class Warehousing {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehousing.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehousing.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehousing.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehousing.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehousing.note_taker
     *
     * @mbg.generated
     */
    private String noteTaker;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehousing.record_time
     *
     * @mbg.generated
     */
    private Date recordTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehousing.id
     *
     * @return the value of warehousing.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehousing.id
     *
     * @param id the value for warehousing.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehousing.name
     *
     * @return the value of warehousing.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehousing.name
     *
     * @param name the value for warehousing.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehousing.address
     *
     * @return the value of warehousing.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehousing.address
     *
     * @param address the value for warehousing.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehousing.user_id
     *
     * @return the value of warehousing.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehousing.user_id
     *
     * @param userId the value for warehousing.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehousing.note_taker
     *
     * @return the value of warehousing.note_taker
     *
     * @mbg.generated
     */
    public String getNoteTaker() {
        return noteTaker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehousing.note_taker
     *
     * @param noteTaker the value for warehousing.note_taker
     *
     * @mbg.generated
     */
    public void setNoteTaker(String noteTaker) {
        this.noteTaker = noteTaker == null ? null : noteTaker.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehousing.record_time
     *
     * @return the value of warehousing.record_time
     *
     * @mbg.generated
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehousing.record_time
     *
     * @param recordTime the value for warehousing.record_time
     *
     * @mbg.generated
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}