package org.dromara.okx.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.ClientUser;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ClientUserVoToClientUserMapper extends BaseMapper<ClientUserVo, ClientUser> {
  ClientUser convert(ClientUserVo source, @MappingTarget ClientUser target);
}
