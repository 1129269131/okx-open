package org.dromara.okx.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.SubPosHis;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SubPosHisVoToSubPosHisMapper extends BaseMapper<SubPosHisVo, SubPosHis> {
  SubPosHis convert(SubPosHisVo source, @MappingTarget SubPosHis target);
}
