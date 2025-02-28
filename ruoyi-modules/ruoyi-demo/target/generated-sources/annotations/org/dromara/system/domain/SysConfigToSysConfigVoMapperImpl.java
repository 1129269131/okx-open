package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysConfigToSysConfigVoMapperImpl implements SysConfigToSysConfigVoMapper {

    @Override
    public SysConfigVo convert(SysConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysConfigVo sysConfigVo = new SysConfigVo();

        sysConfigVo.setConfigId( arg0.getConfigId() );
        sysConfigVo.setConfigName( arg0.getConfigName() );
        sysConfigVo.setConfigKey( arg0.getConfigKey() );
        sysConfigVo.setConfigValue( arg0.getConfigValue() );
        sysConfigVo.setConfigType( arg0.getConfigType() );
        sysConfigVo.setRemark( arg0.getRemark() );
        sysConfigVo.setCreateTime( arg0.getCreateTime() );

        return sysConfigVo;
    }

    @Override
    public SysConfigVo convert(SysConfig source, SysConfigVo target) {
        if ( source == null ) {
            return target;
        }

        target.setConfigId( source.getConfigId() );
        target.setConfigName( source.getConfigName() );
        target.setConfigKey( source.getConfigKey() );
        target.setConfigValue( source.getConfigValue() );
        target.setConfigType( source.getConfigType() );
        target.setRemark( source.getRemark() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
