package com.myp.service;

import java.util.List;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.myp.domain.BoardVO;
import com.myp.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	 @Inject
	  private BoardDAO dao;
	 
	@Override
	public void regist(BoardVO board) throws Exception {
		dao.create(board);
	}
	
	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}
}


