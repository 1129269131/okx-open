package org.dromara.okx.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.vo.SubPosHisVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SubPosHisToSubPosHisVoMapper extends BaseMapper<SubPosHis, SubPosHisVo> {
  SubPosHisVo convert(SubPosHis source, @MappingTarget SubPosHisVo target);
}
