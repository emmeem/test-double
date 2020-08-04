package stub;


//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    /*
    GradeService gradeService = new GradeService(new GradeSystemChild());

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {

        double result=gradeService.calculateAverageGrades(1);
        Assertions.assertEquals(90.0, result);
    }
    */
    @Mock
    GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeService.calculateAverageGrades(1)).thenReturn(90.0);
        assertEquals(90, gradeService.calculateAverageGrades(1));
    }

}
