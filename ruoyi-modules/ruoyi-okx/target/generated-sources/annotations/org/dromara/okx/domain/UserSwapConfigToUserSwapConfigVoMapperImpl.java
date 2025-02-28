package org.dromara.okx.domain;

import javax.annotation.processing.Generated;
import org.dromara.okx.domain.vo.UserSwapConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class UserSwapConfigToUserSwapConfigVoMapperImpl implements UserSwapConfigToUserSwapConfigVoMapper {

    @Override
    public UserSwapConfigVo convert(UserSwapConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        UserSwapConfigVo userSwapConfigVo = new UserSwapConfigVo();

        userSwapConfigVo.setId( arg0.getId() );
        userSwapConfigVo.setUserId( arg0.getUserId() );
        userSwapConfigVo.setUniqueCode( arg0.getUniqueCode() );
        userSwapConfigVo.setInstId( arg0.getInstId() );
        userSwapConfigVo.setMgnMode( arg0.getMgnMode() );
        userSwapConfigVo.setInstType( arg0.getInstType() );
        userSwapConfigVo.setLever( arg0.getLever() );
        userSwapConfigVo.setNum( arg0.getNum() );

        return userSwapConfigVo;
    }

    @Override
    public UserSwapConfigVo convert(UserSwapConfig source, UserSwapConfigVo target) {
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
