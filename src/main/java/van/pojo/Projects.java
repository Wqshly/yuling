package van.pojo;

import java.util.Date;

public class Projects {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.charge_user_id
     *
     * @mbg.generated
     */
    private Integer chargeUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.filepath
     *
     * @mbg.generated
     */
    private String filepath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.note_taker
     *
     * @mbg.generated
     */
    private String noteTaker;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.record_time
     *
     * @mbg.generated
     */
    private Date recordTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.id
     *
     * @return the value of projects.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.id
     *
     * @param id the value for projects.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.name
     *
     * @return the value of projects.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.name
     *
     * @param name the value for projects.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.charge_user_id
     *
     * @return the value of projects.charge_user_id
     *
     * @mbg.generated
     */
    public Integer getChargeUserId() {
        return chargeUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.charge_user_id
     *
     * @param chargeUserId the value for projects.charge_user_id
     *
     * @mbg.generated
     */
    public void setChargeUserId(Integer chargeUserId) {
        this.chargeUserId = chargeUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.start_time
     *
     * @return the value of projects.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.start_time
     *
     * @param startTime the value for projects.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.end_time
     *
     * @return the value of projects.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.end_time
     *
     * @param endTime the value for projects.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.filepath
     *
     * @return the value of projects.filepath
     *
     * @mbg.generated
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.filepath
     *
     * @param filepath the value for projects.filepath
     *
     * @mbg.generated
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.address
     *
     * @return the value of projects.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.address
     *
     * @param address the value for projects.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.note_taker
     *
     * @return the value of projects.note_taker
     *
     * @mbg.generated
     */
    public String getNoteTaker() {
        return noteTaker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.note_taker
     *
     * @param noteTaker the value for projects.note_taker
     *
     * @mbg.generated
     */
    public void setNoteTaker(String noteTaker) {
        this.noteTaker = noteTaker == null ? null : noteTaker.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.record_time
     *
     * @return the value of projects.record_time
     *
     * @mbg.generated
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.record_time
     *
     * @param recordTime the value for projects.record_time
     *
     * @mbg.generated
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}