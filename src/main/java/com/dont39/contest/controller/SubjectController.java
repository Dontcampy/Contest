package com.dont39.contest.controller;


import com.dont39.contest.entity.SubjectEntity;
import com.dont39.contest.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectMapper subjectMapper;

    @RequestMapping(value = "/subject", method = RequestMethod.GET)
    public List<SubjectEntity> subject(@RequestParam(value = "type") Integer type,
                                       @RequestParam(value = "isParty") Boolean isParty) {

        return subjectMapper.getByType(isParty, type);
    }


}
