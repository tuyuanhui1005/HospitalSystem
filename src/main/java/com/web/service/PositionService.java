package com.web.service;

import java.util.List;

import com.web.entity.Position;
import com.web.entity.PositionExample;

public interface PositionService {

	/**
	 * 查询职位的全部信息
	 * @param example
	 * @return
	 */
	List<Position> queryAllPosition(PositionExample example);

	/**
	 * position表和department表的全查询
	 * @return
	 */
	List<Position> queryPositionDept();

	Integer updatePositionById(Position p);

}
