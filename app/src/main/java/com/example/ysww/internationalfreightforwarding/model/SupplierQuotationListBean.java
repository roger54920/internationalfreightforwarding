package com.example.ysww.internationalfreightforwarding.model;

import java.util.List;

/**
 * 获取渠道商报价列表
 */

public class SupplierQuotationListBean {

    /**
     * msg : success
     * code : 0
     * page : {"totalCount":3,"pageSize":10,"totalPage":1,"currPage":1,"list":[{"id":"c83770f862eb46c0ae7b793ad785ebc9","orderId":"18050117484262484944","channelId":null,"channelUserId":28,"channelQuote":12,"fuelOilQuote":null,"additionalQuote":null,"createDate":"2018-05-02 01:14:46","createBy":null,"lastUpdateBy":null,"updateDate":null,"quoteStatus":"0","status":null,"companyCode":null,"companyName":"印度分公司","marketUserName":"小美","channelName":"空投渠道公司","channelUserName":"陈渠道","sumChannelQuote":54540,"sumChannelQuoteFrofit":"\u201d54540\u201d","forwardingUnit":"45"},{"id":null,"orderId":"18050117484262484944","channelId":null,"channelUserId":30,"channelQuote":null,"fuelOilQuote":null,"additionalQuote":null,"createDate":null,"createBy":null,"lastUpdateBy":null,"updateDate":null,"quoteStatus":null,"status":null,"companyCode":null,"companyName":"印度分公司","marketUserName":"小美","channelName":"航空渠道","channelUserName":"万渠道","sumChannelQuote":null,"forwardingUnit":"45"},{"id":"bb2491b1880b4514b01b3cd9e5e89f42","orderId":"18050117484262484944","channelId":null,"channelUserId":41,"channelQuote":45,"fuelOilQuote":null,"additionalQuote":null,"createDate":"2018-05-03 15:08:01","createBy":null,"lastUpdateBy":null,"updateDate":null,"quoteStatus":"10","status":null,"companyCode":null,"companyName":"印度分公司","marketUserName":"小美","channelName":"航空渠道","channelUserName":"钱渠道","sumChannelQuote":204525,"forwardingUnit":"45"}]}
     */

    private String msg;
    private int code;
    private PageBean page;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public static class PageBean {
        /**
         * totalCount : 3
         * pageSize : 10
         * totalPage : 1
         * currPage : 1
         * list : [{"id":"c83770f862eb46c0ae7b793ad785ebc9","orderId":"18050117484262484944","channelId":null,"channelUserId":28,"channelQuote":12,"fuelOilQuote":null,"additionalQuote":null,"createDate":"2018-05-02 01:14:46","createBy":null,"lastUpdateBy":null,"updateDate":null,"quoteStatus":"0","status":null,"companyCode":null,"companyName":"印度分公司","marketUserName":"小美","channelName":"空投渠道公司","channelUserName":"陈渠道","sumChannelQuote":54540,"sumChannelQuoteFrofit":"\u201d54540\u201d","forwardingUnit":"45"},{"id":null,"orderId":"18050117484262484944","channelId":null,"channelUserId":30,"channelQuote":null,"fuelOilQuote":null,"additionalQuote":null,"createDate":null,"createBy":null,"lastUpdateBy":null,"updateDate":null,"quoteStatus":null,"status":null,"companyCode":null,"companyName":"印度分公司","marketUserName":"小美","channelName":"航空渠道","channelUserName":"万渠道","sumChannelQuote":null,"forwardingUnit":"45"},{"id":"bb2491b1880b4514b01b3cd9e5e89f42","orderId":"18050117484262484944","channelId":null,"channelUserId":41,"channelQuote":45,"fuelOilQuote":null,"additionalQuote":null,"createDate":"2018-05-03 15:08:01","createBy":null,"lastUpdateBy":null,"updateDate":null,"quoteStatus":"10","status":null,"companyCode":null,"companyName":"印度分公司","marketUserName":"小美","channelName":"航空渠道","channelUserName":"钱渠道","sumChannelQuote":204525,"forwardingUnit":"45"}]
         */

        private int totalCount;
        private int pageSize;
        private int totalPage;
        private int currPage;
        private List<ListBean> list;

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getCurrPage() {
            return currPage;
        }

        public void setCurrPage(int currPage) {
            this.currPage = currPage;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : c83770f862eb46c0ae7b793ad785ebc9
             * orderId : 18050117484262484944
             * channelId : null
             * channelUserId : 28
             * channelQuote : 12
             * fuelOilQuote : null
             * additionalQuote : null
             * createDate : 2018-05-02 01:14:46
             * createBy : null
             * lastUpdateBy : null
             * updateDate : null
             * quoteStatus : 0
             * status : null
             * companyCode : null
             * companyName : 印度分公司
             * marketUserName : 小美
             * channelName : 空投渠道公司
             * channelUserName : 陈渠道
             * sumChannelQuote : 54540
             * sumChannelQuoteFrofit : ”54540”
             * forwardingUnit : 45
             */

            private String id;
            private String orderId;
            private String channelId;
            private int channelUserId;
            private int channelQuote;
            private String fuelOilQuote;
            private String additionalQuote;
            private String createDate;
            private String createBy;
            private String lastUpdateBy;
            private String updateDate;
            private String quoteStatus;
            private String status;
            private String companyCode;
            private String companyName;
            private String marketUserName;
            private String channelName;
            private String channelUserName;
            private int sumChannelQuote;
            private String sumChannelQuoteFrofit;
            private String forwardingUnit;
            private int isChecked;

            public int getIsChecked() {
                return isChecked;
            }

            public void setIsChecked(int isChecked) {
                this.isChecked = isChecked;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public String getChannelId() {
                return channelId;
            }

            public void setChannelId(String channelId) {
                this.channelId = channelId;
            }

            public int getChannelUserId() {
                return channelUserId;
            }

            public void setChannelUserId(int channelUserId) {
                this.channelUserId = channelUserId;
            }

            public int getChannelQuote() {
                return channelQuote;
            }

            public void setChannelQuote(int channelQuote) {
                this.channelQuote = channelQuote;
            }

            public String getFuelOilQuote() {
                return fuelOilQuote;
            }

            public void setFuelOilQuote(String fuelOilQuote) {
                this.fuelOilQuote = fuelOilQuote;
            }

            public String getAdditionalQuote() {
                return additionalQuote;
            }

            public void setAdditionalQuote(String additionalQuote) {
                this.additionalQuote = additionalQuote;
            }

            public String getCreateDate() {
                return createDate;
            }

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }

            public String getCreateBy() {
                return createBy;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public String getLastUpdateBy() {
                return lastUpdateBy;
            }

            public void setLastUpdateBy(String lastUpdateBy) {
                this.lastUpdateBy = lastUpdateBy;
            }

            public String getUpdateDate() {
                return updateDate;
            }

            public void setUpdateDate(String updateDate) {
                this.updateDate = updateDate;
            }

            public String getQuoteStatus() {
                return quoteStatus;
            }

            public void setQuoteStatus(String quoteStatus) {
                this.quoteStatus = quoteStatus;
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

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }

            public String getMarketUserName() {
                return marketUserName;
            }

            public void setMarketUserName(String marketUserName) {
                this.marketUserName = marketUserName;
            }

            public String getChannelName() {
                return channelName;
            }

            public void setChannelName(String channelName) {
                this.channelName = channelName;
            }

            public String getChannelUserName() {
                return channelUserName;
            }

            public void setChannelUserName(String channelUserName) {
                this.channelUserName = channelUserName;
            }

            public int getSumChannelQuote() {
                return sumChannelQuote;
            }

            public void setSumChannelQuote(int sumChannelQuote) {
                this.sumChannelQuote = sumChannelQuote;
            }

            public String getSumChannelQuoteFrofit() {
                return sumChannelQuoteFrofit;
            }

            public void setSumChannelQuoteFrofit(String sumChannelQuoteFrofit) {
                this.sumChannelQuoteFrofit = sumChannelQuoteFrofit;
            }

            public String getForwardingUnit() {
                return forwardingUnit;
            }

            public void setForwardingUnit(String forwardingUnit) {
                this.forwardingUnit = forwardingUnit;
            }
        }
    }
}
