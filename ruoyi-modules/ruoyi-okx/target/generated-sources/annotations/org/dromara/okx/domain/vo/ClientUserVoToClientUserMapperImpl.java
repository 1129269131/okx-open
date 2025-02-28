package org.dromara.okx.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.okx.domain.ClientUser;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class ClientUserVoToClientUserMapperImpl implements ClientUserVoToClientUserMapper {

    @Override
    public ClientUser convert(ClientUserVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ClientUser clientUser = new ClientUser();

        clientUser.setId( arg0.getId() );
        clientUser.setUsername( arg0.getUsername() );
        clientUser.setNickName( arg0.getNickName() );
        clientUser.setAvatar( arg0.getAvatar() );
        clientUser.setTel( arg0.getTel() );
        clientUser.setDingTel( arg0.getDingTel() );
        clientUser.setQq( arg0.getQq() );
        clientUser.setSex( arg0.getSex() );
        clientUser.setLastLoginTime( arg0.getLastLoginTime() );

        return clientUser;
    }

    @Override
    public ClientUser convert(ClientUserVo source, ClientUser target) {
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
