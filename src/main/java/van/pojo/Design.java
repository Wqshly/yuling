package van.pojo;

import java.util.Date;

public class Design {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design.projects_id
     *
     * @mbg.generated
     */
    private Integer projectsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design.designer_id
     *
     * @mbg.generated
     */
    private Integer designerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design.filepath
     *
     * @mbg.generated
     */
    private String filepath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design.design_time
     *
     * @mbg.generated
     */
    private Date designTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design.plan_start_time
     *
     * @mbg.generated
     */
    private Date planStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design.plan_end_time
     *
     * @mbg.generated
     */
    private Date planEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design.note_taker
     *
     * @mbg.generated
     */
    private String noteTaker;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design.record_time
     *
     * @mbg.generated
     */
    private Date recordTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design.id
     *
     * @return the value of design.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design.id
     *
     * @param id the value for design.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design.projects_id
     *
     * @return the value of design.projects_id
     *
     * @mbg.generated
     */
    public Integer getProjectsId() {
        return projectsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design.projects_id
     *
     * @param projectsId the value for design.projects_id
     *
     * @mbg.generated
     */
    public void setProjectsId(Integer projectsId) {
        this.projectsId = projectsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design.designer_id
     *
     * @return the value of design.designer_id
     *
     * @mbg.generated
     */
    public Integer getDesignerId() {
        return designerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design.designer_id
     *
     * @param designerId the value for design.designer_id
     *
     * @mbg.generated
     */
    public void setDesignerId(Integer designerId) {
        this.designerId = designerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design.filepath
     *
     * @return the value of design.filepath
     *
     * @mbg.generated
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design.filepath
     *
     * @param filepath the value for design.filepath
     *
     * @mbg.generated
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design.design_time
     *
     * @return the value of design.design_time
     *
     * @mbg.generated
     */
    public Date getDesignTime() {
        return designTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design.design_time
     *
     * @param designTime the value for design.design_time
     *
     * @mbg.generated
     */
    public void setDesignTime(Date designTime) {
        this.designTime = designTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design.plan_start_time
     *
     * @return the value of design.plan_start_time
     *
     * @mbg.generated
     */
    public Date getPlanStartTime() {
        return planStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design.plan_start_time
     *
     * @param planStartTime the value for design.plan_start_time
     *
     * @mbg.generated
     */
    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design.plan_end_time
     *
     * @return the value of design.plan_end_time
     *
     * @mbg.generated
     */
    public Date getPlanEndTime() {
        return planEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design.plan_end_time
     *
     * @param planEndTime the value for design.plan_end_time
     *
     * @mbg.generated
     */
    public void setPlanEndTime(Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design.note_taker
     *
     * @return the value of design.note_taker
     *
     * @mbg.generated
     */
    public String getNoteTaker() {
        return noteTaker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design.note_taker
     *
     * @param noteTaker the value for design.note_taker
     *
     * @mbg.generated
     */
    public void setNoteTaker(String noteTaker) {
        this.noteTaker = noteTaker == null ? null : noteTaker.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design.record_time
     *
     * @return the value of design.record_time
     *
     * @mbg.generated
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design.record_time
     *
     * @param recordTime the value for design.record_time
     *
     * @mbg.generated
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}