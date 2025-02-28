package org.dromara.okx.domain.bo;

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
public interface ClientUserBoToClientUserMapper extends BaseMapper<ClientUserBo, ClientUser> {
  ClientUser convert(ClientUserBo source, @MappingTarget ClientUser target);
}
