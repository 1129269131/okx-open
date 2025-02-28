package org.dromara.okx.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.okx.domain.UserSwapConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class UserSwapConfigBoToUserSwapConfigMapperImpl implements UserSwapConfigBoToUserSwapConfigMapper {

    @Override
    public UserSwapConfig convert(UserSwapConfigBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        UserSwapConfig userSwapConfig = new UserSwapConfig();

        userSwapConfig.setSearchValue( arg0.getSearchValue() );
        userSwapConfig.setCreateDept( arg0.getCreateDept() );
        userSwapConfig.setCreateBy( arg0.getCreateBy() );
        userSwapConfig.setCreateTime( arg0.getCreateTime() );
        userSwapConfig.setUpdateBy( arg0.getUpdateBy() );
        userSwapConfig.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            userSwapConfig.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        userSwapConfig.setId( arg0.getId() );
        userSwapConfig.setUserId( arg0.getUserId() );
        userSwapConfig.setUniqueCode( arg0.getUniqueCode() );
        userSwapConfig.setInstId( arg0.getInstId() );
        userSwapConfig.setMgnMode( arg0.getMgnMode() );
        userSwapConfig.setInstType( arg0.getInstType() );
        userSwapConfig.setLever( arg0.getLever() );
        userSwapConfig.setNum( arg0.getNum() );

        return userSwapConfig;
    }

    @Override
    public UserSwapConfig convert(UserSwapConfigBo source, UserSwapConfig target) {
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
        target.setUserId( source.getUserId() );
        target.setUniqueCode( source.getUniqueCode() );
        target.setInstId( source.getInstId() );
        target.setMgnMode( source.getMgnMode() );
        target.setInstType( source.getInstType() );
        target.setLever( source.getLever() );
        target.setNum( source.getNum() );

        return target;
    }
}
