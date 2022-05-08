package EJ52RepasoRecorridos;

import java.util.Comparator;

public class Comparador implements Comparator<Alumno>

{
    @Override
    public int compare(Alumno a1, Alumno a2)
    {  if(a1.getDni()> a2.getDni()){
        return 0;

    }else {

        return -1;
    }
    }
}
