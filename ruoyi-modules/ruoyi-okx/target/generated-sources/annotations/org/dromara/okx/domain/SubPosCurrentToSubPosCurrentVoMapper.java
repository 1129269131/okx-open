package org.dromara.okx.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.vo.SubPosCurrentVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SubPosCurrentToSubPosCurrentVoMapper extends BaseMapper<SubPosCurrent, SubPosCurrentVo> {
  SubPosCurrentVo convert(SubPosCurrent source, @MappingTarget SubPosCurrentVo target);
}
