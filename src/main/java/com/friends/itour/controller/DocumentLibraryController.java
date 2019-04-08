package com.friends.itour.controller;


import com.friends.itour.model.RequirementEditEmpty;
import com.friends.itour.service.AddrequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/documentLibrary")
public class DocumentLibraryController {

    @Autowired
    private AddrequirementService addrequirementService;

    @RequestMapping(value = "/requirementclassdocumentation.json", method = {RequestMethod.GET, RequestMethod.POST})
    public void addrequirementclassdocumentation(@RequestBody RequirementEditEmpty requirementEditEmpty){
        System.err.println(requirementEditEmpty);
        requirementEditEmpty.setCreateBy("");
        requirementEditEmpty.setCreateTime(new Date());
        addrequirementService.insert(requirementEditEmpty);
    }
}
