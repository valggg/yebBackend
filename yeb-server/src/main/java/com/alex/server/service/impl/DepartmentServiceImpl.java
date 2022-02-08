package com.alex.server.service.impl;

import com.alex.server.mapper.DepartmentMapper;
import com.alex.server.pojo.Department;
import com.alex.server.service.IDepartmentService;
import com.alex.server.pojo.RespBean;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author alex
 * @since 2021-10-19
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 获取所有部门
     *
     * @return
     */
    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments(-1);
    }

    /**
     * 添加部门
     *
     * @param department
     * @return
     */
    @Override
    public RespBean addDepartment(Department department) {
        department.setEnabled(true);
        departmentMapper.addDepartment(department);
        if (1 == department.getResult()) {
            return RespBean.success("添加成功！", department);
        }
        return RespBean.error("添加失败，请稍后再试！");
    }

    /**
     * 删除部门
     *
     * @param id
     * @return
     */
    @Override
    public RespBean deleteDep(Integer id) {
        Department dep = new Department();
        dep.setId(id);
        departmentMapper.deleteDep(dep);
        if (dep.getResult() == -2) {
            return RespBean.error("该部门下存在子部门，删除失败！");
        }
        if (dep.getResult() == -1) {
            return RespBean.error("该部门下还有员工，删除失败！");
        }
        if (dep.getResult() == 1) {
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败，请稍后再试！");
    }
}
