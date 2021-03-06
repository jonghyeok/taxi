package com.taxi.vo.room;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.taxi.util.CustomDateSerializer;
import com.taxi.vo.room.base.BaseRoom;


public class Room extends BaseRoom implements Serializable {
	private static final long serialVersionUID = 1L;

	
	/* Base 변수
	 * 
	 * protected int 		roomNo;
	 * protected Date		roomStartTime;
	 * protected int		roomMbrNumLimit;
	 * protected Date		roomRegDate;
	 * protected int		roomColor;
	 */
	protected int 				relationMbr;
	protected int 				relationCd;
	protected int 				roomMbrCount;
	protected List<RoomMbr>	roomMbrList;
	protected List<RoomPath> 	roomPathList;
	protected int				differenceTime;
	
	
	public int getDifferenceTime() {
		return differenceTime;
	}
	public Room setDifferenceTime(int differenceTime) {
		this.differenceTime = differenceTime;
		return this;
	}
	public Room setRoomNo(int roomNo) {
		return (Room) super.setRoomNo(roomNo);
	}
	public Room setRoomStartTime(Date roomStartTime) {
		return (Room) super.setRoomStartTime(roomStartTime);
	}
	public Room setRoomMbrNumLimit(int roomMbrNumLimit) {
		return (Room) super.setRoomMbrNumLimit(roomMbrNumLimit);
	}
	public Room setRoomRegDate(Date roomRegDate) {
		return (Room) super.setRoomRegDate(roomRegDate);
	}
	public Room setRoomColor(int roomColor) {
		return (Room) super.setRoomColor(roomColor);
	}
	
	
	public int getRelationMbr() {
		return relationMbr;
	}
	public Room setRelationMbr(int relationMbr) {
		this.relationMbr = relationMbr;
		return this;
	}
	public int getRelationCd() {
		return relationCd;
	}
	public Room setRelationCd(int relationCd) {
		this.relationCd = relationCd;
		return this;
	}
	public int getRoomMbrCount() {
		return roomMbrCount;
	}
	public Room setRoomMbrCount(int roomMbrCount) {
		this.roomMbrCount = roomMbrCount;
		return this;
	}
	public List<RoomMbr> getRoomMbrList() {
		return roomMbrList;
	}
	public Room setRoomMbrList(List<RoomMbr> roomMbrList) {
		this.roomMbrList = roomMbrList;
		return this;
	}
	public List<RoomPath> getRoomPathList() {
		return roomPathList;
	}
	public Room setRoomPathList(List<RoomPath> roomPathList) {
		this.roomPathList = roomPathList;
		return this;
	}
	
	
/*	//====================== AS-IS =======================//
 	
	protected int 				roomNo;
	protected Date				roomStartTime;
	protected int 				roomDistance;
	protected long 				roomFare;
	protected Date				roomRegDate;
	protected int				roomMbrCount;
	protected int				differenceTime;
	protected List<RoomMbr>		roomMbrList;
	protected List<RoomPath> 	roomPathList;


	public int getDifferenceTime() {
		return differenceTime;
	}
	public Room setDifferenceTime(int differenceTime) {
		this.differenceTime = differenceTime;
		return this;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public Room setRoomNo(int roomNo) {
		this.roomNo = roomNo;
		return this;
	}
	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getRoomStartTime() {
		return roomStartTime;
	}
	public Room setRoomStartTime(Date roomStartTime) {
		this.roomStartTime = roomStartTime;
		return this;
	}
	public int getRoomDistance() {
		return roomDistance;
	}
	public Room setRoomDistance(int roomDistance) {
		this.roomDistance = roomDistance;
		return this;
	}
	public long getRoomFare() {
		return roomFare;
	}
	public Room setRoomFare(long roomFare) {
		this.roomFare = roomFare;
		return this;
	}
	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getRoomRegDate() {
		return roomRegDate;
	}
	public Room setRoomRegDate(Date roomRegDate) {
		this.roomRegDate = roomRegDate;
		return this;
	}
	public int getRoomMbrCount() {
		return roomMbrCount;
	}
	public Room setRoomMbrCount(int roomMbrCount) {
		this.roomMbrCount = roomMbrCount;
		return this;
	}
	public List<RoomMbr> getRoomMbrList() {
		return roomMbrList;
	}
	public Room setRoomMbrList(List<RoomMbr> roomMbrList) {
		this.roomMbrList = roomMbrList;
		return this;
	}
	public List<RoomPath> getRoomPathList() {
		return roomPathList;
	}
	public Room setRoomPathList(List<RoomPath> roomPathList) {
		this.roomPathList = roomPathList;
		return this;
	}
*/

}

