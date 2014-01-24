package com.taxi.controls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/feed")
public class FeedControl {
	
	
/*  ====================== AS-IS =======================
 	
	@Autowired ServletContext sc;
	@Autowired FeedService feedService;
	
	@RequestMapping("/feedList")
	@ResponseBody
	public Object getFeedList( int roomNo ) throws Exception {
		
		System.out.println("roomNo: " + roomNo);
		JsonResult jsonResult = new JsonResult();
	
		try {
			jsonResult.setStatus("success")
					   .setData(feedService.getFeedList(roomNo));
				
		} catch (Throwable e) {
			e.printStackTrace();
			StringWriter out = new StringWriter();
			e.printStackTrace(new PrintWriter(out));
			
			jsonResult.setStatus("fail");
			jsonResult.setData(out.toString());
		}
	
	return jsonResult;
}
	

	@RequestMapping(value="/addFeed", method=RequestMethod.POST)
	@ResponseBody
	public Object addFeed(Feed feed) throws Exception {
		System.out.println("피드 :" + feed.getMbrId());
		
		JsonResult jsonResult = new JsonResult();
		
		try {
			jsonResult.setStatus("success")
					   .setData(feedService.addFeed(feed));
			
		} catch (Throwable e) {
			e.printStackTrace();
			StringWriter out = new StringWriter();
			e.printStackTrace(new PrintWriter(out));
			
			jsonResult.setStatus("fail");
			jsonResult.setData(out.toString());
		}
	
	return jsonResult;
	}

	
	@RequestMapping("/deleteFeed")
	@ResponseBody
	public Object delete(Feed feed) throws Exception {
		
		feedService.deleteFeed(feed);

		JsonResult jsonResult = new JsonResult();
		
		try {
			jsonResult.setStatus("success");
			
		} catch (Throwable e) {
			e.printStackTrace();
			StringWriter out = new StringWriter();
			e.printStackTrace(new PrintWriter(out));
			
			jsonResult.setStatus("fail");
			jsonResult.setData(out.toString());
		}
	
	return jsonResult;
	}
*/
}