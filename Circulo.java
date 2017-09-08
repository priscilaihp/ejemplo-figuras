/**
 * Esta clase representa objetos circulo con un radio.
 * @author Priscila Hernandez
 * @version 08.09.17
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
    {
        radio = unRadio;
    }
    
    /**
     * Override te corrige la sobreescritura.
     */
    @Override
    public void calcularArea()
    {
        area = 3.14f * radio * radio; // La f es como un cast.
    }
}