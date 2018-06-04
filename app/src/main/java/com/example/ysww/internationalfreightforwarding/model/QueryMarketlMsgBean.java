package com.example.ysww.internationalfreightforwarding.model;

import java.util.List;

/**
 * 获取订单消息接口
 */

public class QueryMarketlMsgBean extends BaseBean{


    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : null
         * chanelQuoteId : null
         * orderNo : 18051111284422439838
         * msgType : 1
         * content : 455

         * userId : 30
         * userName : 万渠道
         * createBy : null
         * readeStatus : null
         * createDate : 2018-05-16 16:08:05
         * status : null
         * companyCode : null
         * addrss : right
         */

        private String id;
        private String chanelQuoteId;
        private String orderNo;
        private String msgType;
        private String content;
        private int userId;
        private String userName;
        private String createBy;
        private String readeStatus;
        private String createDate;
        private String status;
        private String companyCode;
        private String addrss;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getChanelQuoteId() {
            return chanelQuoteId;
        }

        public void setChanelQuoteId(String chanelQuoteId) {
            this.chanelQuoteId = chanelQuoteId;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getMsgType() {
            return msgType;
        }

        public void setMsgType(String msgType) {
            this.msgType = msgType;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy;
        }

        public String getReadeStatus() {
            return readeStatus;
        }

        public void setReadeStatus(String readeStatus) {
            this.readeStatus = readeStatus;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCompanyCode() {
            return companyCode;
        }

        public void setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
        }

        public String getAddrss() {
            return addrss;
        }

        public void setAddrss(String addrss) {
            this.addrss = addrss;
        }
    }
}
