package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysUserVoToSysUserExportVoMapperImpl implements SysUserVoToSysUserExportVoMapper {

    @Override
    public SysUserExportVo convert(SysUserVo source) {
        if ( source == null ) {
            return null;
        }

        SysUserExportVo sysUserExportVo = new SysUserExportVo();

        sysUserExportVo.setDeptName( sourceDeptDeptName( source ) );
        sysUserExportVo.setLeaderName( sourceDeptLeaderName( source ) );
        sysUserExportVo.setUserId( source.getUserId() );
        sysUserExportVo.setUserName( source.getUserName() );
        sysUserExportVo.setNickName( source.getNickName() );
        sysUserExportVo.setEmail( source.getEmail() );
        sysUserExportVo.setPhonenumber( source.getPhonenumber() );
        sysUserExportVo.setSex( source.getSex() );
        sysUserExportVo.setStatus( source.getStatus() );
        sysUserExportVo.setLoginIp( source.getLoginIp() );
        sysUserExportVo.setLoginDate( source.getLoginDate() );

        return sysUserExportVo;
    }

    @Override
    public SysUserExportVo convert(SysUserVo source, SysUserExportVo target) {
        if ( source == null ) {
            return target;
        }

        target.setDeptName( sourceDeptDeptName( source ) );
        target.setLeaderName( sourceDeptLeaderName( source ) );
        target.setUserId( source.getUserId() );
        target.setUserName( source.getUserName() );
        target.setNickName( source.getNickName() );
        target.setEmail( source.getEmail() );
        target.setPhonenumber( source.getPhonenumber() );
        target.setSex( source.getSex() );
        target.setStatus( source.getStatus() );
        target.setLoginIp( source.getLoginIp() );
        target.setLoginDate( source.getLoginDate() );

        return target;
    }

    private String sourceDeptDeptName(SysUserVo sysUserVo) {
        if ( sysUserVo == null ) {
            return null;
        }
        SysDeptVo dept = sysUserVo.getDept();
        if ( dept == null ) {
            return null;
        }
        String deptName = dept.getDeptName();
        if ( deptName == null ) {
            return null;
        }
        return deptName;
    }

    private String sourceDeptLeaderName(SysUserVo sysUserVo) {
        if ( sysUserVo == null ) {
            return null;
        }
        SysDeptVo dept = sysUserVo.getDept();
        if ( dept == null ) {
            return null;
        }
        String leaderName = dept.getLeaderName();
        if ( leaderName == null ) {
            return null;
        }
        return leaderName;
    }
}
