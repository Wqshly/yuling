package van.dao;

import java.util.List;
import van.pojo.OutInWarehousing;

public interface OutInWarehousingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_in_warehousing
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_in_warehousing
     *
     * @mbg.generated
     */
    int insert(OutInWarehousing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_in_warehousing
     *
     * @mbg.generated
     */
    OutInWarehousing selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_in_warehousing
     *
     * @mbg.generated
     */
    List<OutInWarehousing> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_in_warehousing
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OutInWarehousing record);
}