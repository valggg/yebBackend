package com.alex.server.service.impl;

import com.alex.server.mapper.EmployeeTrainMapper;
import com.alex.server.pojo.EmployeeTrain;
import com.alex.server.service.IEmployeeTrainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 培训表 服务实现类
 * </p>
 *
 * @author alex
 * @since 2021-10-19
 */
@Service
public class EmployeeTrainServiceImpl extends ServiceImpl<EmployeeTrainMapper, EmployeeTrain> implements IEmployeeTrainService {

}
