package test3_wdhl;





import org.mockito.*;
import static org.mockito.Mockito.*;

public class MockitoTest {

	fFiles f = new fFiles(); 
		
		public void mock() {
			Mockito.when(f.get(10)).thenThrow(new Exception());
			
		}
}
