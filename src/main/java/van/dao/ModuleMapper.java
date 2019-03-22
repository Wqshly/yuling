package van.dao;

import java.util.List;
import van.pojo.Module;

public interface ModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated
     */
    int insert(Module record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated
     */
    Module selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated
     */
    List<Module> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Module record);
}