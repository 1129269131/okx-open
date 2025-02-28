package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysOss;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysOssVoToSysOssMapperImpl implements SysOssVoToSysOssMapper {

    @Override
    public SysOss convert(SysOssVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOss sysOss = new SysOss();

        sysOss.setCreateBy( arg0.getCreateBy() );
        sysOss.setCreateTime( arg0.getCreateTime() );
        sysOss.setOssId( arg0.getOssId() );
        sysOss.setFileName( arg0.getFileName() );
        sysOss.setOriginalName( arg0.getOriginalName() );
        sysOss.setFileSuffix( arg0.getFileSuffix() );
        sysOss.setUrl( arg0.getUrl() );
        sysOss.setService( arg0.getService() );

        return sysOss;
    }

    @Override
    public SysOss convert(SysOssVo source, SysOss target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setOssId( source.getOssId() );
        target.setFileName( source.getFileName() );
        target.setOriginalName( source.getOriginalName() );
        target.setFileSuffix( source.getFileSuffix() );
        target.setUrl( source.getUrl() );
        target.setService( source.getService() );

        return target;
    }
}
