package org.dromara.okx.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.CopytradingInfo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface CopytradingInfoVoToCopytradingInfoMapper extends BaseMapper<CopytradingInfoVo, CopytradingInfo> {
  CopytradingInfo convert(CopytradingInfoVo source, @MappingTarget CopytradingInfo target);
}
