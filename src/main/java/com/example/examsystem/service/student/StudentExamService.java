package com.example.examsystem.service.student;

import com.example.examsystem.bean.Question;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface StudentExamService
{
	public List<Question> examQuestion(String examnum, HttpSession session);
}
