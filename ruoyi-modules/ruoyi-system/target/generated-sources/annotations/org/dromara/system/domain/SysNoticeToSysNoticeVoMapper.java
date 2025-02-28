package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysNoticeVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysNoticeToSysNoticeVoMapper extends BaseMapper<SysNotice, SysNoticeVo> {
  SysNoticeVo convert(SysNotice source, @MappingTarget SysNoticeVo target);
}
