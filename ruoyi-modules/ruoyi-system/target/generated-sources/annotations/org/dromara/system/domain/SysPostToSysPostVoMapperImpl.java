package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysPostVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysPostToSysPostVoMapperImpl implements SysPostToSysPostVoMapper {

    @Override
    public SysPostVo convert(SysPost arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPostVo sysPostVo = new SysPostVo();

        sysPostVo.setPostId( arg0.getPostId() );
        sysPostVo.setPostCode( arg0.getPostCode() );
        sysPostVo.setPostName( arg0.getPostName() );
        sysPostVo.setPostSort( arg0.getPostSort() );
        sysPostVo.setStatus( arg0.getStatus() );
        sysPostVo.setRemark( arg0.getRemark() );
        sysPostVo.setCreateTime( arg0.getCreateTime() );

        return sysPostVo;
    }

    @Override
    public SysPostVo convert(SysPost source, SysPostVo target) {
        if ( source == null ) {
            return target;
        }

        target.setPostId( source.getPostId() );
        target.setPostCode( source.getPostCode() );
        target.setPostName( source.getPostName() );
        target.setPostSort( source.getPostSort() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
