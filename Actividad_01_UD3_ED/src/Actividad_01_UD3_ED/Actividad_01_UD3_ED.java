/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_01_UD3_ED;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ana
 */
public class Actividad_01_UD3_ED 
{
    private static byte[] buffer = new byte[1000];
    private static String NombreArchivo = "fichero.dat";
    private static FileInputStream FlujoEntrada = null;
    private static BufferedInputStream EntradaBuffer = null;

    public static void InicializarArchivos() throws FileNotFoundException
    {
        FlujoEntrada = new FileInputStream(NombreArchivo);
        EntradaBuffer = new BufferedInputStream(FlujoEntrada);
    }
    
    public static int MostrarTextoArchivo()
    {
        int total = 0;
        int nRead = 0;
        while(true)
        {
            try {
                if (!((nRead = FlujoEntrada.read(buffer)) != -1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(new String(buffer));
            total += nRead;
        }
        
        return total;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        try 
        {
            InicializarArchivos();
            
            int total = MostrarTextoArchivo();

            System.out.println("\nLeídos " + total + " bytes");
        }
        catch(IOException ex) 
        {
            System.out.println("Error -> " + ex.toString());                
        }
        finally 
        {
            try 
            {
                if( EntradaBuffer != null && FlujoEntrada != null )
                {
                    FlujoEntrada.close();
                    EntradaBuffer.close();
                }                
            } 
            catch (IOException ex) 
            {
                System.out.println("Error al cerrar el fichero -> " + ex.toString());
            }
        }
    }
    
}
