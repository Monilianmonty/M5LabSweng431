import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Human

{

            public int height;

            public Human()

        {  height=12;  }

            public Human(int a)

        {  height=a;  }

            public void Year1()

        {  height= height+2;  }

            public void Year2()

        {  height= height+5;  }

            public void Year3()

        {  height= height+8;  }

            public void Output()

        {  System.out.println("Height= "+ height);

        }

}