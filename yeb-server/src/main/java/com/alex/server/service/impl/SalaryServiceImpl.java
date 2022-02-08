package com.alex.server.service.impl;

import com.alex.server.mapper.SalaryMapper;
import com.alex.server.pojo.Salary;
import com.alex.server.service.ISalaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工资表 服务实现类
 * </p>
 *
 * @author alex
 * @since 2021-10-19
 */
@Service
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
