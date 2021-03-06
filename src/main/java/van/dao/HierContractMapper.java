package van.dao;

import java.util.List;
import van.pojo.HierContract;

public interface HierContractMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hier_contract
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hier_contract
     *
     * @mbg.generated
     */
    int insert(HierContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hier_contract
     *
     * @mbg.generated
     */
    HierContract selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hier_contract
     *
     * @mbg.generated
     */
    List<HierContract> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hier_contract
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HierContract record);
}