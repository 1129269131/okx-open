package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysPost;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysPostBoToSysPostMapperImpl implements SysPostBoToSysPostMapper {

    @Override
    public SysPost convert(SysPostBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPost sysPost = new SysPost();

        sysPost.setSearchValue( arg0.getSearchValue() );
        sysPost.setCreateDept( arg0.getCreateDept() );
        sysPost.setCreateBy( arg0.getCreateBy() );
        sysPost.setCreateTime( arg0.getCreateTime() );
        sysPost.setUpdateBy( arg0.getUpdateBy() );
        sysPost.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysPost.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysPost.setPostId( arg0.getPostId() );
        sysPost.setPostCode( arg0.getPostCode() );
        sysPost.setPostName( arg0.getPostName() );
        sysPost.setPostSort( arg0.getPostSort() );
        sysPost.setStatus( arg0.getStatus() );
        sysPost.setRemark( arg0.getRemark() );

        return sysPost;
    }

    @Override
    public SysPost convert(SysPostBo source, SysPost target) {
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
        target.setPostId( source.getPostId() );
        target.setPostCode( source.getPostCode() );
        target.setPostName( source.getPostName() );
        target.setPostSort( source.getPostSort() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
