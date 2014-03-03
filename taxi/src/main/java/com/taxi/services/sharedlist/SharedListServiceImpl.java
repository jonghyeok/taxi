package com.taxi.services.sharedlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxi.dao.sharedlist.SharedDao;
import com.taxi.vo.room.Room;


@Service
public class SharedListServiceImpl implements SharedListService {
	@Autowired SharedDao sharedDao;

	
	/**
	 * 설  명: 동승자 추가
	 * 작성자: 김상헌
	 */
	@Override
	public void registerSharedlist(List<Room> pastRoomList) throws Exception {
		if(pastRoomList.size() > 0){
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("room", pastRoomList);

			sharedDao.insertSharedList(paramMap);
		}
	}
	
}
