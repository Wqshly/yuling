package van.dao;

import java.util.List;
import van.pojo.Design;

public interface DesignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design
     *
     * @mbg.generated
     */
    int insert(Design record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design
     *
     * @mbg.generated
     */
    Design selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design
     *
     * @mbg.generated
     */
    List<Design> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Design record);
}