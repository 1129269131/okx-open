package org.dromara.okx.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.vo.ClientUserVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ClientUserToClientUserVoMapper extends BaseMapper<ClientUser, ClientUserVo> {
  ClientUserVo convert(ClientUser source, @MappingTarget ClientUserVo target);
}
