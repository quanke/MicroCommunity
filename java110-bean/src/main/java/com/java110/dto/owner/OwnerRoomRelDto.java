package com.java110.dto.owner;

import com.java110.dto.PageDto;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName FloorDto
 * @Description 业主房屋数据层封装
 * @Author wuxw
 * @Date 2019/4/24 8:52
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/
public class OwnerRoomRelDto extends PageDto implements Serializable {

    private String relId;
    private String remark;
    private String state;
    private String ownerId;
    private String userId;
    private String roomId;
    private String bId;


    private Date createTime;

    private String statusCd = "0";


    public String getRelId() {
        return relId;
    }

    public void setRelId(String relId) {
        this.relId = relId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }
}
