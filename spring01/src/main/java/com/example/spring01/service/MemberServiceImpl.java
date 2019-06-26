package com.example.spring01.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring01.model.dao.MemberDAO;
import com.example.spring01.model.dto.MemberDTO;

//현재 클래스를 스프링에서 관리하는  service bean으로 설정
//1개의 서비스가  1개 또는 여러개의 dao를 다룰 수 있음. (프로젝트마다 다름)
@Service
public class MemberServiceImpl implements MemberService {
	
	
	@Inject
	MemberDAO memberDao;
	//memberDAO memberDao=new MemberDAOImpl();
	@Override
	public List<MemberDTO> memberList() {
		return memberDao.memberList();
	}

	@Override
	public void insertMember(MemberDTO dto) {
		memberDao.insertMember(dto);//f4

	}

	@Override
	public MemberDTO viewMember(String userid) {
		return memberDao.viewMember(userid);                                                                                                                                                                                                                                                                     
	}
	

	@Override
	public void deleteMember(String userid) {
		memberDao.deleteMember(userid);

	}

	@Override
	public void updateMember(MemberDTO dto) {
		memberDao.updateMember(dto);

	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		return memberDao.checkPw(userid, passwd);
	}

}
