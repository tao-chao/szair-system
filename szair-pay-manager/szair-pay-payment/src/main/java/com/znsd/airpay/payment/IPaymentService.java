package com.znsd.airpay.payment;

import java.util.Map;

/**
 * @author Administrator
 * 提供了前台页面调用的第三方支付通道
 */
public interface IPaymentService {

	boolean payForTicket(Map<String,Object> params) throws Exception;


}
