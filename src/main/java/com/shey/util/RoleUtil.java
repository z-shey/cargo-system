package com.shey.util;

import com.shey.entity.RoleEnum;
import com.shey.entity.Staff;
import com.shey.service.impl.RoleService;

public class RoleUtil {
    public static boolean display(Staff staff, RoleEnum... roleEnum) {
        for (RoleEnum role : roleEnum) {
            if (staff.getRole_id().equals(role.getRole())) {
                return true;
            }
        }
        return false;
    }

    public static String displayRoleName(Staff staff) {
        return new RoleService().getById(staff.getRole_id()).getRole_name();
    }
}
