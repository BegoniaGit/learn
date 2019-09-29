package site.yanyan.learn.service;

import site.yanyan.learn.pojo.Answer;
import site.yanyan.learn.vo.AnswerQuery;
import java.util.List;
import site.yanyan.learn.pojo.PageTableData;
import org.springframework.transaction.annotation.Transactional;
public interface AnswerService {


   /**
    *根据id删除Answer
    */
	Long delById(Long id);

   /**
    *根据新增Answer，id自增
    */
    Long save(Answer record);

   /**
    *根据id查询Answer
    */
    Answer getById(Long id);
    
   /**
    *根据id更新Answer
    */ 
    Long editById(Answer record);

   /**
    *查询所有Answer
    */ 
    PageTableData<Answer> list(int pagenum, int pagesize,AnswerQuery param);

    List<Answer> listAll(AnswerQuery param);
}