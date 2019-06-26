package com.test.service.impl;

import com.test.model.TestTable;
import com.test.model.TestTableMapper;
import com.test.service.InsertUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertUserImpl implements InsertUser {

    @Autowired
    private TestTableMapper tableMapper;

    @Override
    public void insertUser(TestTable tt) {

        int insert = tableMapper.insert(tt);

        System.out.println(insert);
    }
}
