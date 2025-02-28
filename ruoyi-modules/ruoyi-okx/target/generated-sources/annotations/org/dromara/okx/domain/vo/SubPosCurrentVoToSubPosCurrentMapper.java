package org.dromara.okx.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.SubPosCurrent;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SubPosCurrentVoToSubPosCurrentMapper extends BaseMapper<SubPosCurrentVo, SubPosCurrent> {
  SubPosCurrent convert(SubPosCurrentVo source, @MappingTarget SubPosCurrent target);
}
