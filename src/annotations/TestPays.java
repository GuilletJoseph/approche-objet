package annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestPays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Pays pays=new Pays("france",60000,600);
try {
    
    Field field = Pays.class.getDeclaredField("nom");
    field.setAccessible(true);
    
    
    ToString annotations = field.getAnnotation(ToString.class);
    System.out.println(pays.getNom()+" "+annotations.separator());

    
} catch (NoSuchFieldException | SecurityException e) {
    System.out.println("NoSuchMethodException");
    return;
}





    }

}
