package van.pojo;

import java.util.Date;

public class ToolsOutIn {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_out_in.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_out_in.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_out_in.tools_out_incol
     *
     * @mbg.generated
     */
    private String toolsOutIncol;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_out_in.exe_user_id
     *
     * @mbg.generated
     */
    private Integer exeUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_out_in.approver_user_id
     *
     * @mbg.generated
     */
    private Integer approverUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_out_in.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tools_out_in.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_out_in.id
     *
     * @return the value of tools_out_in.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_out_in.id
     *
     * @param id the value for tools_out_in.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_out_in.name
     *
     * @return the value of tools_out_in.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_out_in.name
     *
     * @param name the value for tools_out_in.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_out_in.tools_out_incol
     *
     * @return the value of tools_out_in.tools_out_incol
     *
     * @mbg.generated
     */
    public String getToolsOutIncol() {
        return toolsOutIncol;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_out_in.tools_out_incol
     *
     * @param toolsOutIncol the value for tools_out_in.tools_out_incol
     *
     * @mbg.generated
     */
    public void setToolsOutIncol(String toolsOutIncol) {
        this.toolsOutIncol = toolsOutIncol == null ? null : toolsOutIncol.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_out_in.exe_user_id
     *
     * @return the value of tools_out_in.exe_user_id
     *
     * @mbg.generated
     */
    public Integer getExeUserId() {
        return exeUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_out_in.exe_user_id
     *
     * @param exeUserId the value for tools_out_in.exe_user_id
     *
     * @mbg.generated
     */
    public void setExeUserId(Integer exeUserId) {
        this.exeUserId = exeUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_out_in.approver_user_id
     *
     * @return the value of tools_out_in.approver_user_id
     *
     * @mbg.generated
     */
    public Integer getApproverUserId() {
        return approverUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_out_in.approver_user_id
     *
     * @param approverUserId the value for tools_out_in.approver_user_id
     *
     * @mbg.generated
     */
    public void setApproverUserId(Integer approverUserId) {
        this.approverUserId = approverUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_out_in.start_time
     *
     * @return the value of tools_out_in.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_out_in.start_time
     *
     * @param startTime the value for tools_out_in.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tools_out_in.end_time
     *
     * @return the value of tools_out_in.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tools_out_in.end_time
     *
     * @param endTime the value for tools_out_in.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}