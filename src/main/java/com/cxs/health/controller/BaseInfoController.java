package com.cxs.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cxs.health.pojo.BaseInfo;
import com.cxs.health.pojo.QueryParams;

@Controller
public class BaseInfoController {

	@RequestMapping(value="/query")
	public BaseInfo queryBaseInfo(@ModelAttribute QueryParams queryParams){
		System.out.println(queryParams);
		return null;
	}
}
