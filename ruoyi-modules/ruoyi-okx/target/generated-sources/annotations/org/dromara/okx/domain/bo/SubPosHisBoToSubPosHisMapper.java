package org.dromara.okx.domain.bo;

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
public interface SubPosHisBoToSubPosHisMapper extends BaseMapper<SubPosHisBo, SubPosHis> {
  SubPosHis convert(SubPosHisBo source, @MappingTarget SubPosHis target);
}
