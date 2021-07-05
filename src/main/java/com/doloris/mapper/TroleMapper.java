package com.doloris.mapper;

import com.doloris.entity.Trole;
import com.doloris.util.MyMapper;

import java.util.List;

public interface TroleMapper extends MyMapper<Trole> {

    List<Trole> selectRolesByUserId(Integer userid);

}