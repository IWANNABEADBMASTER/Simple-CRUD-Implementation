package com.myp.persistence;

import java.util.List;

import com.myp.domain.BoardVO;

public interface BoardDAO {

	public void create(BoardVO vo) throws Exception;

	public BoardVO read(Integer bno) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(Integer bno) throws Exception;

	public List<BoardVO> listAll() throws Exception;
}