package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysPost;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysPostVoToSysPostMapperImpl implements SysPostVoToSysPostMapper {

    @Override
    public SysPost convert(SysPostVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPost sysPost = new SysPost();

        sysPost.setCreateTime( arg0.getCreateTime() );
        sysPost.setPostId( arg0.getPostId() );
        sysPost.setPostCode( arg0.getPostCode() );
        sysPost.setPostName( arg0.getPostName() );
        sysPost.setPostSort( arg0.getPostSort() );
        sysPost.setStatus( arg0.getStatus() );
        sysPost.setRemark( arg0.getRemark() );

        return sysPost;
    }

    @Override
    public SysPost convert(SysPostVo source, SysPost target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setPostId( source.getPostId() );
        target.setPostCode( source.getPostCode() );
        target.setPostName( source.getPostName() );
        target.setPostSort( source.getPostSort() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
