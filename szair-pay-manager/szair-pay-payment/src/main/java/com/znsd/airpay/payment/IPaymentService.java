package com.znsd.airpay.payment;

import java.util.Map;

/**
 * @author Administrator
 * �ṩ��ǰ̨ҳ����õĵ�����֧��ͨ��
 */
public interface IPaymentService {

	boolean payForTicket(Map<String,Object> params) throws Exception;


}
