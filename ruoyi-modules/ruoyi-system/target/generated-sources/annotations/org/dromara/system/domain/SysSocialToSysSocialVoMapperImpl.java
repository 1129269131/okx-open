package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysSocialVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysSocialToSysSocialVoMapperImpl implements SysSocialToSysSocialVoMapper {

    @Override
    public SysSocialVo convert(SysSocial arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysSocialVo sysSocialVo = new SysSocialVo();

        sysSocialVo.setId( arg0.getId() );
        sysSocialVo.setUserId( arg0.getUserId() );
        sysSocialVo.setTenantId( arg0.getTenantId() );
        sysSocialVo.setAuthId( arg0.getAuthId() );
        sysSocialVo.setSource( arg0.getSource() );
        sysSocialVo.setAccessToken( arg0.getAccessToken() );
        sysSocialVo.setExpireIn( arg0.getExpireIn() );
        sysSocialVo.setRefreshToken( arg0.getRefreshToken() );
        sysSocialVo.setOpenId( arg0.getOpenId() );
        sysSocialVo.setUserName( arg0.getUserName() );
        sysSocialVo.setNickName( arg0.getNickName() );
        sysSocialVo.setEmail( arg0.getEmail() );
        sysSocialVo.setAvatar( arg0.getAvatar() );
        sysSocialVo.setAccessCode( arg0.getAccessCode() );
        sysSocialVo.setUnionId( arg0.getUnionId() );
        sysSocialVo.setScope( arg0.getScope() );
        sysSocialVo.setTokenType( arg0.getTokenType() );
        sysSocialVo.setIdToken( arg0.getIdToken() );
        sysSocialVo.setMacAlgorithm( arg0.getMacAlgorithm() );
        sysSocialVo.setMacKey( arg0.getMacKey() );
        sysSocialVo.setCode( arg0.getCode() );
        sysSocialVo.setOauthToken( arg0.getOauthToken() );
        sysSocialVo.setOauthTokenSecret( arg0.getOauthTokenSecret() );
        sysSocialVo.setCreateTime( arg0.getCreateTime() );

        return sysSocialVo;
    }

    @Override
    public SysSocialVo convert(SysSocial source, SysSocialVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setUserId( source.getUserId() );
        target.setTenantId( source.getTenantId() );
        target.setAuthId( source.getAuthId() );
        target.setSource( source.getSource() );
        target.setAccessToken( source.getAccessToken() );
        target.setExpireIn( source.getExpireIn() );
        target.setRefreshToken( source.getRefreshToken() );
        target.setOpenId( source.getOpenId() );
        target.setUserName( source.getUserName() );
        target.setNickName( source.getNickName() );
        target.setEmail( source.getEmail() );
        target.setAvatar( source.getAvatar() );
        target.setAccessCode( source.getAccessCode() );
        target.setUnionId( source.getUnionId() );
        target.setScope( source.getScope() );
        target.setTokenType( source.getTokenType() );
        target.setIdToken( source.getIdToken() );
        target.setMacAlgorithm( source.getMacAlgorithm() );
        target.setMacKey( source.getMacKey() );
        target.setCode( source.getCode() );
        target.setOauthToken( source.getOauthToken() );
        target.setOauthTokenSecret( source.getOauthTokenSecret() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
