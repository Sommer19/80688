package mx.uv;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        get("/",
            (request, response) -> "Bienvenido!"
        );
        get("/hola",
            (request, response) -> "Hola, ¿Cómo estás?"
        );
        get("/adios",
            (request, response) -> "Hola mundo!"
        );
        get("/fin",
            (request, response) -> "Hola mundo!"
        );
    }
}
