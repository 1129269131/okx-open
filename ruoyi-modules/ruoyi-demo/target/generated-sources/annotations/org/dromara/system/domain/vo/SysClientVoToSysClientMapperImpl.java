package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysClient;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysClientVoToSysClientMapperImpl implements SysClientVoToSysClientMapper {

    @Override
    public SysClient convert(SysClientVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysClient sysClient = new SysClient();

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
    public SysClient convert(SysClientVo source, SysClient target) {
        if ( source == null ) {
            return target;
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
