package com.alex.server.service.impl;

import com.alex.server.mapper.MailLogMapper;
import com.alex.server.pojo.MailLog;
import com.alex.server.service.IMailLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件日志 服务实现类
 * </p>
 *
 * @author alex
 * @since 2021-10-19
 */
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
