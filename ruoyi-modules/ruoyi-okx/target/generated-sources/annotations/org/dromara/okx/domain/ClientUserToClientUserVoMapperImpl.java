package org.dromara.okx.domain;

import javax.annotation.processing.Generated;
import org.dromara.okx.domain.vo.ClientUserVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class ClientUserToClientUserVoMapperImpl implements ClientUserToClientUserVoMapper {

    @Override
    public ClientUserVo convert(ClientUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ClientUserVo clientUserVo = new ClientUserVo();

        clientUserVo.setId( arg0.getId() );
        clientUserVo.setUsername( arg0.getUsername() );
        clientUserVo.setNickName( arg0.getNickName() );
        clientUserVo.setAvatar( arg0.getAvatar() );
        clientUserVo.setTel( arg0.getTel() );
        clientUserVo.setDingTel( arg0.getDingTel() );
        clientUserVo.setQq( arg0.getQq() );
        clientUserVo.setSex( arg0.getSex() );
        clientUserVo.setLastLoginTime( arg0.getLastLoginTime() );

        return clientUserVo;
    }

    @Override
    public ClientUserVo convert(ClientUser source, ClientUserVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setUsername( source.getUsername() );
        target.setNickName( source.getNickName() );
        target.setAvatar( source.getAvatar() );
        target.setTel( source.getTel() );
        target.setDingTel( source.getDingTel() );
        target.setQq( source.getQq() );
        target.setSex( source.getSex() );
        target.setLastLoginTime( source.getLastLoginTime() );

        return target;
    }
}
