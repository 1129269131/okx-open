package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysOssVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysOssToSysOssVoMapperImpl implements SysOssToSysOssVoMapper {

    @Override
    public SysOssVo convert(SysOss arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssVo sysOssVo = new SysOssVo();

        sysOssVo.setOssId( arg0.getOssId() );
        sysOssVo.setFileName( arg0.getFileName() );
        sysOssVo.setOriginalName( arg0.getOriginalName() );
        sysOssVo.setFileSuffix( arg0.getFileSuffix() );
        sysOssVo.setUrl( arg0.getUrl() );
        sysOssVo.setCreateTime( arg0.getCreateTime() );
        sysOssVo.setCreateBy( arg0.getCreateBy() );
        sysOssVo.setService( arg0.getService() );

        return sysOssVo;
    }

    @Override
    public SysOssVo convert(SysOss source, SysOssVo target) {
        if ( source == null ) {
            return target;
        }

        target.setOssId( source.getOssId() );
        target.setFileName( source.getFileName() );
        target.setOriginalName( source.getOriginalName() );
        target.setFileSuffix( source.getFileSuffix() );
        target.setUrl( source.getUrl() );
        target.setCreateTime( source.getCreateTime() );
        target.setCreateBy( source.getCreateBy() );
        target.setService( source.getService() );

        return target;
    }
}
