package com.taxi.dao.member;

import com.taxi.vo.auth.MyInfo;
import com.taxi.vo.member.Mbr;




public interface MbrDao {

	/**
	 * 설  명: myInfo 조회하기( 'mbrNo'로 조회 또는 'mbrPhoneNo','mbrUuid'로 조회 )
	 * 작성자: 이용준 
	 */
	MyInfo getMyInfo(Mbr mbr) throws Exception;
	
	/**
	 * 설  명: 회원추가
	 * 작성자: 이용준 
	 */
	int addMbr(Mbr mbr) throws Exception;
	
	void deleteMbr(int mbrNo);
	
	int updateMbrPhotoUrl(Mbr mbr)throws Exception;
	
	/**
	 *  설  명 : 회원 번호로 이름 가져오기
	 *  작성자 : 장종혁
	 */
	String getUserName(int mbrNo);

}
