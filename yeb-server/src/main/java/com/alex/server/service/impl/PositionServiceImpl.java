package com.alex.server.service.impl;

import com.alex.server.mapper.PositionMapper;
import com.alex.server.pojo.Position;
import com.alex.server.service.IPositionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 职位 服务实现类
 * </p>
 *
 * @author alex
 * @since 2021-10-19
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
