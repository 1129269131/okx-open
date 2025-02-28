package org.dromara.okx.domain.bo;

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
public interface SubPosCurrentBoToSubPosCurrentMapper extends BaseMapper<SubPosCurrentBo, SubPosCurrent> {
  SubPosCurrent convert(SubPosCurrentBo source, @MappingTarget SubPosCurrent target);
}
