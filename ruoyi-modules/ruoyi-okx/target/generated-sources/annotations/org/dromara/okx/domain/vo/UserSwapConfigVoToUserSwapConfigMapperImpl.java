package org.dromara.okx.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.okx.domain.UserSwapConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class UserSwapConfigVoToUserSwapConfigMapperImpl implements UserSwapConfigVoToUserSwapConfigMapper {

    @Override
    public UserSwapConfig convert(UserSwapConfigVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        UserSwapConfig userSwapConfig = new UserSwapConfig();

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
    public UserSwapConfig convert(UserSwapConfigVo source, UserSwapConfig target) {
        if ( source == null ) {
            return target;
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
