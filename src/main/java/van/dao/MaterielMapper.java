package van.dao;

import java.util.List;
import van.pojo.Materiel;

public interface MaterielMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materiel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materiel
     *
     * @mbg.generated
     */
    int insert(Materiel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materiel
     *
     * @mbg.generated
     */
    Materiel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materiel
     *
     * @mbg.generated
     */
    List<Materiel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materiel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Materiel record);
}