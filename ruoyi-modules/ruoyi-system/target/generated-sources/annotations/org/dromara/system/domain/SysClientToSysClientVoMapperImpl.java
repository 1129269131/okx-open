package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysClientVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysClientToSysClientVoMapperImpl implements SysClientToSysClientVoMapper {

    @Override
    public SysClientVo convert(SysClient arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysClientVo sysClientVo = new SysClientVo();

        sysClientVo.setId( arg0.getId() );
        sysClientVo.setClientId( arg0.getClientId() );
        sysClientVo.setClientKey( arg0.getClientKey() );
        sysClientVo.setClientSecret( arg0.getClientSecret() );
        sysClientVo.setGrantType( arg0.getGrantType() );
        sysClientVo.setDeviceType( arg0.getDeviceType() );
        sysClientVo.setActiveTimeout( arg0.getActiveTimeout() );
        sysClientVo.setTimeout( arg0.getTimeout() );
        sysClientVo.setStatus( arg0.getStatus() );

        return sysClientVo;
    }

    @Override
    public SysClientVo convert(SysClient source, SysClientVo target) {
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
