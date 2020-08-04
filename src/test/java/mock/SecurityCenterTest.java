package mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    /*
    SecurityCenter securityCenter ;
    @BeforeEach
    public void setUp() {
        securityCenter = new SecurityCenter(new mockDoorPanel());
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
    }
    */
    @Mock
    DoorPanel mkdoorpanel;

    @InjectMocks
    SecurityCenter securityCenter;

    @Test
    public void shouldVerifyDoorIsClosed() {
        assertEquals(0, securityCenter.switchOn());
        //Mockito.times表示：close方法调用了1次
        Mockito.verify(mkdoorpanel,Mockito.times(1)).close();
    }
}
