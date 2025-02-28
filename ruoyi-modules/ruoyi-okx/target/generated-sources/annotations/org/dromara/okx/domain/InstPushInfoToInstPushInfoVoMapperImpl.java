package org.dromara.okx.domain;

import javax.annotation.processing.Generated;
import org.dromara.okx.domain.vo.InstPushInfoVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class InstPushInfoToInstPushInfoVoMapperImpl implements InstPushInfoToInstPushInfoVoMapper {

    @Override
    public InstPushInfoVo convert(InstPushInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        InstPushInfoVo instPushInfoVo = new InstPushInfoVo();

        instPushInfoVo.setId( arg0.getId() );
        instPushInfoVo.setName( arg0.getName() );
        instPushInfoVo.setInstId( arg0.getInstId() );
        instPushInfoVo.setInstType( arg0.getInstType() );

        return instPushInfoVo;
    }

    @Override
    public InstPushInfoVo convert(InstPushInfo source, InstPushInfoVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setName( source.getName() );
        target.setInstId( source.getInstId() );
        target.setInstType( source.getInstType() );

        return target;
    }
}
