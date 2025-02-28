package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysSocial;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysSocialBoToSysSocialMapperImpl implements SysSocialBoToSysSocialMapper {

    @Override
    public SysSocial convert(SysSocialBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysSocial sysSocial = new SysSocial();

        sysSocial.setSearchValue( arg0.getSearchValue() );
        sysSocial.setCreateDept( arg0.getCreateDept() );
        sysSocial.setCreateBy( arg0.getCreateBy() );
        sysSocial.setCreateTime( arg0.getCreateTime() );
        sysSocial.setUpdateBy( arg0.getUpdateBy() );
        sysSocial.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysSocial.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysSocial.setTenantId( arg0.getTenantId() );
        sysSocial.setId( arg0.getId() );
        sysSocial.setUserId( arg0.getUserId() );
        sysSocial.setAuthId( arg0.getAuthId() );
        sysSocial.setSource( arg0.getSource() );
        sysSocial.setAccessToken( arg0.getAccessToken() );
        sysSocial.setExpireIn( arg0.getExpireIn() );
        sysSocial.setRefreshToken( arg0.getRefreshToken() );
        sysSocial.setOpenId( arg0.getOpenId() );
        sysSocial.setUserName( arg0.getUserName() );
        sysSocial.setNickName( arg0.getNickName() );
        sysSocial.setEmail( arg0.getEmail() );
        sysSocial.setAvatar( arg0.getAvatar() );
        sysSocial.setAccessCode( arg0.getAccessCode() );
        sysSocial.setUnionId( arg0.getUnionId() );
        sysSocial.setScope( arg0.getScope() );
        sysSocial.setTokenType( arg0.getTokenType() );
        sysSocial.setIdToken( arg0.getIdToken() );
        sysSocial.setMacAlgorithm( arg0.getMacAlgorithm() );
        sysSocial.setMacKey( arg0.getMacKey() );
        sysSocial.setCode( arg0.getCode() );
        sysSocial.setOauthToken( arg0.getOauthToken() );
        sysSocial.setOauthTokenSecret( arg0.getOauthTokenSecret() );

        return sysSocial;
    }

    @Override
    public SysSocial convert(SysSocialBo source, SysSocial target) {
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
        target.setTenantId( source.getTenantId() );
        target.setId( source.getId() );
        target.setUserId( source.getUserId() );
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

        return target;
    }
}
