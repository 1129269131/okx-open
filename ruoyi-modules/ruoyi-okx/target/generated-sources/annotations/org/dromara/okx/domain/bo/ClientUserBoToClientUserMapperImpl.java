package org.dromara.okx.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.okx.domain.ClientUser;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class ClientUserBoToClientUserMapperImpl implements ClientUserBoToClientUserMapper {

    @Override
    public ClientUser convert(ClientUserBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ClientUser clientUser = new ClientUser();

        clientUser.setSearchValue( arg0.getSearchValue() );
        clientUser.setCreateDept( arg0.getCreateDept() );
        clientUser.setCreateBy( arg0.getCreateBy() );
        clientUser.setCreateTime( arg0.getCreateTime() );
        clientUser.setUpdateBy( arg0.getUpdateBy() );
        clientUser.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            clientUser.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        clientUser.setId( arg0.getId() );
        clientUser.setUsername( arg0.getUsername() );
        clientUser.setPassword( arg0.getPassword() );
        clientUser.setNickName( arg0.getNickName() );
        clientUser.setAvatar( arg0.getAvatar() );
        clientUser.setTel( arg0.getTel() );
        clientUser.setDingTel( arg0.getDingTel() );
        clientUser.setQq( arg0.getQq() );
        clientUser.setSex( arg0.getSex() );
        clientUser.setIntroduction( arg0.getIntroduction() );
        clientUser.setLastLoginTime( arg0.getLastLoginTime() );

        return clientUser;
    }

    @Override
    public ClientUser convert(ClientUserBo source, ClientUser target) {
        if ( source == null ) {
            return target;
        }

        target.setSearchValue( source.getSearchValue() );
        target.setCreateDept( source.getCreateDept() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        target.setId( source.getId() );
        target.setUsername( source.getUsername() );
        target.setPassword( source.getPassword() );
        target.setNickName( source.getNickName() );
        target.setAvatar( source.getAvatar() );
        target.setTel( source.getTel() );
        target.setDingTel( source.getDingTel() );
        target.setQq( source.getQq() );
        target.setSex( source.getSex() );
        target.setIntroduction( source.getIntroduction() );
        target.setLastLoginTime( source.getLastLoginTime() );

        return target;
    }
}
