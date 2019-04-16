package com.friends.itour.controller;


import com.friends.itour.model.RequirementEditEmpty;
import com.friends.itour.model.User;
import com.friends.itour.service.AddrequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "/getrequirement.json", method = {RequestMethod.GET, RequestMethod.POST})
    public RequirementEditEmpty getrequirementclassdocumentation(@RequestParam("id") Integer id){
        return addrequirementService.selectOneRequirement(id);
    }

    @RequestMapping(value = "/setrequirement.json", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public RequirementEditEmpty setrequirementclassdocumentation(@RequestBody Map<String,Object> map, HttpServletRequest request){
        RequirementEditEmpty requirementEditEmpty = new RequirementEditEmpty();
       System.err.println(map);
        return requirementEditEmpty;
    }
}
