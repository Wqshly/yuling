package van.dao;

import java.util.List;
import van.pojo.DetailToolsOutIn;

public interface DetailToolsOutInMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table detail_tools_out_in
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table detail_tools_out_in
     *
     * @mbg.generated
     */
    int insert(DetailToolsOutIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table detail_tools_out_in
     *
     * @mbg.generated
     */
    DetailToolsOutIn selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table detail_tools_out_in
     *
     * @mbg.generated
     */
    List<DetailToolsOutIn> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table detail_tools_out_in
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DetailToolsOutIn record);
}