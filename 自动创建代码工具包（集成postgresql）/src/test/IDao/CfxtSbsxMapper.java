package test.IDao;

import test.domain.CfxtSbsx;

public interface CfxtSbsxMapper {
    int deleteByPrimaryKey(String cSbid);

    int insert(CfxtSbsx record);

    int insertSelective(CfxtSbsx record);

    CfxtSbsx selectByPrimaryKey(String cSbid);

    int updateByPrimaryKeySelective(CfxtSbsx record);

    int updateByPrimaryKey(CfxtSbsx record);
}