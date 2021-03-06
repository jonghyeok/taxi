package com.taxi.vo.room;

import java.io.Serializable;

import com.taxi.vo.room.base.BaseRoomPath;


public class RoomPath extends BaseRoomPath implements Serializable {
	private static final long serialVersionUID = 1L;

	/* Base 변수
	 * 
	 * protected int 		roomNo;
	 * protected int		pathRank;
	 * protected String	pathName;
	 * protected double 	pathLat;
	 * protected double 	pathLng;
	 */
	
	// protected int 		추가되는 변수;
	
	public RoomPath setRoomNo(int roomNo) {
		return (RoomPath) super.setRoomNo(roomNo);
	}
	public RoomPath setPathRank(int pathRank) {
		return (RoomPath) super.setPathRank(pathRank);
	}
	public RoomPath setPathName(String pathName) {
		return (RoomPath) super.setPathName(pathName);
	}
	public RoomPath setPathLat(double pathLat) {
		return (RoomPath) super.setPathLat(pathLat);
	}
	public RoomPath setPathLng(double pathLng) {
		return (RoomPath) super.setPathLng(pathLng);
	}
	
	
/*	//====================== AS-IS =======================//
 	
	protected int 				roomNo;
	protected int				pathRank;
	protected String			pathName;
	protected double 			pathLat;
	protected double 			pathLng;
	
	public int getRoomNo() {
		return roomNo;
	}
	public RoomPath setRoomNo(int roomNo) {
		this.roomNo = roomNo;
		return this;
	}
	public int getPathRank() {
		return pathRank;
	}
	public RoomPath setPathRank(int pathRank) {
		this.pathRank = pathRank;
		return this;
	}
	public String getPathName() {
		return pathName;
	}
	public RoomPath setPathName(String pathName) {
		this.pathName = pathName;
		return this;
	}
	public double getPathLat() {
		return pathLat;
	}
	public RoomPath setPathLat(double pathLat) {
		this.pathLat = pathLat;
		return this;
	}
	public double getPathLng() {
		return pathLng;
	}
	public RoomPath setPathLng(double pathLng) {
		this.pathLng = pathLng;
		return this;
	}
*/	
		
}

