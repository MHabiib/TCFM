package com.future.tcfm.service.impl;

import com.future.tcfm.model.Dashboard;
import com.future.tcfm.model.Group;
import com.future.tcfm.model.User;
import com.future.tcfm.repository.GroupRepository;
import com.future.tcfm.repository.UserRepository;
import com.future.tcfm.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.stereotype.Service;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.io.Console;

@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
    GroupRepository groupRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public Dashboard getData(String email) {
        User dUser = userRepository.findByEmail(email);
        Group dGroup = groupRepository.findByName(dUser.getGroupName());

        Dashboard d = new Dashboard();


        d.setGroupBalance(dGroup.getGroupBalance());

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(where("name").is(dUser.getGroupName())),
                Aggregation.project().and("member").project("size").as("count"));
        d.setTotalMembers(dGroup.getMember().size());

        return d;
    }
}