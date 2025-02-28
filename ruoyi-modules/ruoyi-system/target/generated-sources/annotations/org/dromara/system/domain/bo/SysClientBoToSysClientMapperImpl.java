package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysClient;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysClientBoToSysClientMapperImpl implements SysClientBoToSysClientMapper {

    @Override
    public SysClient convert(SysClientBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysClient sysClient = new SysClient();

        sysClient.setSearchValue( arg0.getSearchValue() );
        sysClient.setCreateDept( arg0.getCreateDept() );
        sysClient.setCreateBy( arg0.getCreateBy() );
        sysClient.setCreateTime( arg0.getCreateTime() );
        sysClient.setUpdateBy( arg0.getUpdateBy() );
        sysClient.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysClient.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysClient.setId( arg0.getId() );
        sysClient.setClientId( arg0.getClientId() );
        sysClient.setClientKey( arg0.getClientKey() );
        sysClient.setClientSecret( arg0.getClientSecret() );
        sysClient.setGrantType( arg0.getGrantType() );
        sysClient.setDeviceType( arg0.getDeviceType() );
        sysClient.setActiveTimeout( arg0.getActiveTimeout() );
        sysClient.setTimeout( arg0.getTimeout() );
        sysClient.setStatus( arg0.getStatus() );

        return sysClient;
    }

    @Override
    public SysClient convert(SysClientBo source, SysClient target) {
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
        target.setClientId( source.getClientId() );
        target.setClientKey( source.getClientKey() );
        target.setClientSecret( source.getClientSecret() );
        target.setGrantType( source.getGrantType() );
        target.setDeviceType( source.getDeviceType() );
        target.setActiveTimeout( source.getActiveTimeout() );
        target.setTimeout( source.getTimeout() );
        target.setStatus( source.getStatus() );

        return target;
    }
}
