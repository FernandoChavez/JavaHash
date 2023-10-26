package com.fuerzadon.hash;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UsuarioDto usuarioDto1 = new UsuarioDto("Juan", "juan@hotmail.com");
        UsuarioDto usuarioDto2 = new UsuarioDto("Juan", "juan@hotmail.com");
        System.out.println(usuarioDto1.hashCode());
        if(usuarioDto1.equals(usuarioDto2)) {
        	System.out.println("Los objetos son iguales");
        }
    }
}
