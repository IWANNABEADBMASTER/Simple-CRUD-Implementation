package com.myp.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myp.domain.BoardVO;
import com.myp.service.BoardService;

@Controller // ��Ʈ�ѷ����� ���
@RequestMapping(value = "/") // �ּ� ����
public class BoardController {

	@Inject   // ����(�ɺθ���) ���
	private BoardService service; // Service ȣ���� ���� ��ü����

	@RequestMapping(value= "/listAll", method = RequestMethod.GET) // �ּ� ȣ�� ��� . ȣ���Ϸ��� �ּ� �� REST ��ļ��� (GET)
	public void listAll(Model model)throws Exception { // �޼ҵ� ���ڰ��� model �������̽�(jsp���� �ɺθ���)

			model.addAttribute("list",service.listAll()); // jsp�� �ɺθ��� ����(���� ȣ��)
		
	}

	@RequestMapping(value = "/regist", method = RequestMethod.GET) // GET ������� ������ ȣ��
	  public void registerGET(BoardVO board, Model model) throws Exception {

	}

	@RequestMapping(value = "/regist", method = RequestMethod.POST) // POST������� ���� ����
	  public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception { // ���ڰ����� REDIRECT ��� 
		  service.regist(board); // ���ۼ� ���� ȣ��
	    	    
	    return "redirect:/listAll"; // �ۼ��� �Ϸ�� ��, ����������� ����
	}
	
}