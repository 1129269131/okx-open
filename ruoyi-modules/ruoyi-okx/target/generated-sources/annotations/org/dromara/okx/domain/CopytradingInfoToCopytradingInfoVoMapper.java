package org.dromara.okx.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.vo.CopytradingInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface CopytradingInfoToCopytradingInfoVoMapper extends BaseMapper<CopytradingInfo, CopytradingInfoVo> {
  CopytradingInfoVo convert(CopytradingInfo source, @MappingTarget CopytradingInfoVo target);
}
