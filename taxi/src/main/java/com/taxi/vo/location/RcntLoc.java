package com.taxi.vo.location;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.taxi.util.CustomDateSerializer;
import com.taxi.vo.location.base.BaseRcntLoc;


public class RcntLoc extends BaseRcntLoc implements Serializable {
	private static final long serialVersionUID = 1L;

	/* Base 변수
	 * 
	 * protected int 		rcntLocNo;
	 * protected int 		mbrNo;
	 * protected String 	rcntLocName;
	 * protected String 	rcntLocSt;
	 * protected double 	rcntLocLat;
	 * protected double 	rcntLocLng;
	 * protected Date 		rcntLocRegDate;
	 */
	
	// protected int 		추가되는 변수;
	
	public RcntLoc setRcntlocNo(int rcntLocNo) {
		return (RcntLoc) super.setRcntLocNo(rcntLocNo);
	}
	public RcntLoc setMbrNo(int mbrNo) {
		return (RcntLoc) super.setMbrNo(mbrNo);
	}
	public RcntLoc setRcntLocName(String rcntLocName) {
		return (RcntLoc) super.setRcntLocName(rcntLocName);
	}
	public RcntLoc setRcntLocSt(String rcntLocSt) {
		return (RcntLoc) super.setRcntLocSt(rcntLocSt);
	}
	public RcntLoc setRcntLocLat(double rcntLocLat) {
		return (RcntLoc) super.setRcntLocLat(rcntLocLat);
	}
	public RcntLoc setRcntLocLng(double rcntLocLng) {
		return (RcntLoc) super.setRcntLocLng(rcntLocLng);
	}
	public RcntLoc setRcntLocRegDate(Date rcntLocRegDate) {
		return (RcntLoc) super.setRcntLocRegDate(rcntLocRegDate);
	}
	
	
/*	//====================== AS-IS =======================//
 	
	protected int 			fvrtLocNo;
	protected String 		mbrId;
	protected  String		fvrtLocName;
	protected double 		fvrtLocLat;
	protected double 		fvrtLocLng;
	protected Date 			fvrtLocRegDate;
	protected int 			fvrtLocRank;
	protected String			fvrtLocStatus;
	
	public int getFvrtLocNo() {
		return fvrtLocNo;
	}
	public FvrtLoc setFvrtLocNo(int fvrtLocNo) {
		this.fvrtLocNo = fvrtLocNo;
		return this;
	}
	public String getMbrId() {
		return mbrId;
	}
	public FvrtLoc setMbrId(String mbrId) {
		this.mbrId = mbrId;
		return this;
	}
	public String getFvrtLocName() {
		return fvrtLocName;
	}
	public FvrtLoc setFvrtLocName(String fvrtLocName) {
		this.fvrtLocName = fvrtLocName;
		return this;
	}
	public double getFvrtLocLat() {
		return fvrtLocLat;
	}
	public FvrtLoc setFvrtLocLat(double fvrtLocLat) {
		this.fvrtLocLat = fvrtLocLat;
		return this;
	}
	public double getFvrtLocLng() {
		return fvrtLocLng;
	}
	public FvrtLoc setFvrtLocLng(double fvrtLocLng) {
		this.fvrtLocLng = fvrtLocLng;
		return this;
	}
	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFvrtLocRegDate() {
		return fvrtLocRegDate;
	}
	public FvrtLoc setFvrtLocRegDate(Date fvrtLocRegDate) {
		this.fvrtLocRegDate = fvrtLocRegDate;
		return this;
	}
	public int getFvrtLocRank() {
		return fvrtLocRank;
	}
	public FvrtLoc setFvrtLocRank(int fvrtLocRank) {
		this.fvrtLocRank = fvrtLocRank;
		return this;
	}
	public String getFvrtLocStatus() {
		return fvrtLocStatus;
	}
	public FvrtLoc setFvrtLocStatus(String fvrtLocStatus) {
		this.fvrtLocStatus = fvrtLocStatus;
		return this;
	}
*/	
	
}
