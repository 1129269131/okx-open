package org.dromara.system.domain.bo;

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
public interface SysNoticeBoToSysNoticeMapper extends BaseMapper<SysNoticeBo, SysNotice> {
  SysNotice convert(SysNoticeBo source, @MappingTarget SysNotice target);
}
