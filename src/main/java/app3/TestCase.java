/* paquetes y librerias necesarias */
package tarea3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Clase que genera los diferentes casos de pruebas solicitados en el programa 3 */
public class TestCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
      // TODO code application logic here           
      //Test0();
      Test1();
      Test2();
      Test3();
      Test4();
      
    }
    
    public static void Test0() throws FileNotFoundException, IOException 
    {        
        File f = null;  
        FileReader fr =null;  
        BufferedReader br = null;
        
        String linea;        
        int i = 0;         
        double sumatoria1 = 0;
        double arrnum1[] = new double [10];
        double arrnum2[] = new double [10];
        
        f = new File ("TestCase/Test0/Test0_01.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum1[i]=Double.valueOf(linea);     
            sumatoria1 +=Double.valueOf(linea);
            i=i+1;  
        }        
        
         f = null;  
         fr =null;  
         br = null;
        
        linea = "";        
        i = 0;         
        
        f = new File ("TestCase/Test0/Test0_02.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum2[i]=Double.valueOf(linea);    
            i=i+1;  
        }    
        
        Regresion regresion=new Regresion(arrnum1, arrnum2);
        regresion.lineal();
        System.out.println("Valores Actuales Caso de Prueba 0:");
        System.out.println("B0="+ (regresion.b - (regresion.a * (sumatoria1/10))) );
        System.out.println("B1="+regresion.a);
        System.out.println("Rx,y="+regresion.correlacion());
        System.out.println("R^2="+ Math.pow(regresion.correlacion(),2));
        //System.out.println("Yavg="+regresion.b);
        //System.out.println("B1Xavg="+(regresion.a * (sumatoria1/10)));
        System.out.println("Yk="+ ((regresion.b - (regresion.a * (sumatoria1/10))) + (regresion.a) * (386) ));
    }  
       
    public static void Test1() throws FileNotFoundException, IOException 
    {        
        File f = null;  
        FileReader fr =null;  
        BufferedReader br = null;
        
        String linea;        
        int i = 0;         
        double sumatoria1 = 0;
        double arrnum1[] = new double [10];
        double arrnum2[] = new double [10];
        
        f = new File ("TestCase/Test1/Test1_ProxySize.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum1[i]=Double.valueOf(linea);     
            sumatoria1 +=Double.valueOf(linea);
            i=i+1;  
        }    
        
         f = null;  
         fr =null;  
         br = null;
        
        linea = "";        
        i = 0;         
        
        f = new File ("TestCase/Test1/Test1_ActualAddedModifiedSize.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum2[i]=Double.valueOf(linea);    
            i=i+1;  
        }    
        
        Regresion regresion=new Regresion(arrnum1, arrnum2);
        regresion.lineal();
        System.out.println("Valores Actuales Caso de Prueba 1:");
        System.out.println("B0="+ (regresion.b - (regresion.a * (sumatoria1/10))) );
        System.out.println("B1="+regresion.a);
        System.out.println("Rx,y="+regresion.correlacion());
        System.out.println("R^2="+ Math.pow(regresion.correlacion(),2));
        //System.out.println("Yavg="+regresion.b);
        //System.out.println("B1Xavg="+(regresion.a * (sumatoria1/10)));
        System.out.println("Yk="+ ((regresion.b - (regresion.a * (sumatoria1/10))) + (regresion.a) * (386) ));
        System.out.println("");
    }
    
    public static void Test2() throws FileNotFoundException, IOException 
    {        
        File f = null;  
        FileReader fr =null;  
        BufferedReader br = null;
        
       String linea;        
        int i = 0;         
        double sumatoria1 = 0;
        double arrnum1[] = new double [10];
        double arrnum2[] = new double [10];
        
        f = new File ("TestCase/Test2/Test2_ProxySize.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum1[i]=Double.valueOf(linea);     
            sumatoria1 +=Double.valueOf(linea);
            i=i+1;  
        }      
        
         f = null;  
         fr =null;  
         br = null;
        
        linea = "";        
        i = 0;         
        
        f = new File ("TestCase/Test2/Test2_ActualDevelopmentHours.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum2[i]=Double.valueOf(linea);    
            i=i+1;  
        }    
        
        Regresion regresion=new Regresion(arrnum1, arrnum2);
        regresion.lineal();
        System.out.println("Valores Actuales Caso de Prueba 2:");
        System.out.println("B0="+ (regresion.b - (regresion.a * (sumatoria1/10))) );
        System.out.println("B1="+regresion.a);
        System.out.println("Rx,y="+regresion.correlacion());
        System.out.println("R^2="+ Math.pow(regresion.correlacion(),2));
        //System.out.println("Yavg="+regresion.b);
        //System.out.println("B1Xavg="+(regresion.a * (sumatoria1/10)));
        System.out.println("Yk="+ ((regresion.b - (regresion.a * (sumatoria1/10))) + (regresion.a) * (386) ));
        System.out.println("");
    }
    
    public static void Test3() throws FileNotFoundException, IOException 
    {        
        File f = null;  
        FileReader fr =null;  
        BufferedReader br = null;
        
        String linea;        
        int i = 0;         
        double sumatoria1 = 0;
        double arrnum1[] = new double [10];
        double arrnum2[] = new double [10];
        
        f = new File ("TestCase/Test3/Test3_PlanAddedModifiedSize.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum1[i]=Double.valueOf(linea);     
            sumatoria1 +=Double.valueOf(linea);
            i=i+1;  
        }    
        
         f = null;  
         fr =null;  
         br = null;
        
        linea = "";        
        i = 0;         
        
        f = new File ("TestCase/Test3/Test3_ActualAddedModifiedSize.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum2[i]=Double.valueOf(linea);    
            i=i+1;  
        }    
        
        Regresion regresion=new Regresion(arrnum1, arrnum2);
        regresion.lineal();
        System.out.println("Valores Actuales Caso de Prueba 3:");
        System.out.println("B0="+ (regresion.b - (regresion.a * (sumatoria1/10))) );
        System.out.println("B1="+regresion.a);
        System.out.println("Rx,y="+regresion.correlacion());
        System.out.println("R^2="+ Math.pow(regresion.correlacion(),2));
        //System.out.println("Yavg="+regresion.b);
        //System.out.println("B1Xavg="+(regresion.a * (sumatoria1/10)));
        System.out.println("Yk="+ ((regresion.b - (regresion.a * (sumatoria1/10))) + (regresion.a) * (386) ));
        System.out.println("");
    }
   
    public static void Test4() throws FileNotFoundException, IOException 
    {        
        File f = null;  
        FileReader fr =null;  
        BufferedReader br = null;
        
       String linea;        
        int i = 0;         
        double sumatoria1 = 0;
        double arrnum1[] = new double [10];
        double arrnum2[] = new double [10];
        
        f = new File ("TestCase/Test4/Test4_PlanAddedModifiedSize.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum1[i]=Double.valueOf(linea);     
            sumatoria1 +=Double.valueOf(linea);
            i=i+1;  
        }  
        
         f = null;  
         fr =null;  
         br = null;
        
        linea = "";        
        i = 0;         
        
        f = new File ("TestCase/Test4/Test4_ActualDevelopmentHours.txt");        
        fr = new FileReader (f);        
        br = new BufferedReader (fr);  
        
        while ( (linea = br.readLine()) != null ) 
        {       
            arrnum2[i]=Double.valueOf(linea);    
            i=i+1;  
        }    
        
        Regresion regresion=new Regresion(arrnum1, arrnum2);
        regresion.lineal();
        System.out.println("Valores Actuales Caso de Prueba 4:");
        System.out.println("B0="+ (regresion.b - (regresion.a * (sumatoria1/10))) );
        System.out.println("B1="+regresion.a);
        System.out.println("Rx,y="+regresion.correlacion());
        System.out.println("R^2="+ Math.pow(regresion.correlacion(),2));
        //System.out.println("Yavg="+regresion.b);
        //System.out.println("B1Xavg="+(regresion.a * (sumatoria1/10)));
        System.out.println("Yk="+ ((regresion.b - (regresion.a * (sumatoria1/10))) + (regresion.a) * (386) ));
        System.out.println("");
    }
    
}
