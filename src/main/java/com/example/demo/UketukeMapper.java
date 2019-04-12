package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;

public class UketukeMapper implements RowMapper<List<Uketuke>> {
    public List<Uketuke> mapRow(ResultSet rs, int rowNum)
    		throws SQLException {
        List<Uketuke> List = new ArrayList<>();
        do {
            Uketuke uketuke = new Uketuke();
            uketuke.setUkeNo(rs.getInt("uke_no"));
            uketuke.setSeiName(rs.getString("sei_name"));
			uketuke.setMeiName(rs.getString("mei_name"));
			uketuke.setNkAdd(rs.getString("nk_add"));
			uketuke.setNmAdd1(rs.getString("nm_add1"));
			uketuke.setNmAdd2(rs.getString("nm_add2"));
            uketuke.setNmAdd3(rs.getString("nm_add3"));
            uketuke.setNkTel(rs.getString("nk_tel"));
			uketuke.setGenderNo(rs.getString("gender_no"));
			uketuke.setBirthdayDt(rs.getString("birthday_dt"));
			uketuke.setNkMail(rs.getString("nk_mail"));
            uketuke.setNkPass(rs.getString("nk_pass"));
            List.add(uketuke);
        } while (rs.next());
        return List;
    }
}
