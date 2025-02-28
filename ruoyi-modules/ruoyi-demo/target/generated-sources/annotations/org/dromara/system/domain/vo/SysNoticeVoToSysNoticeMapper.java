package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysNotice;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysNoticeVoToSysNoticeMapper extends BaseMapper<SysNoticeVo, SysNotice> {
  SysNotice convert(SysNoticeVo source, @MappingTarget SysNotice target);
}
