package A1;

public class Comparacao_1 {

    public String name1, name2;
	public double idade1, idade2;
    
    public String toString() {
	
     if (idade2 > idade1) { 
	 return name2;
     }
     else if (idade1 > idade2){
     return name1;

     }else 
     return "mesma idade";
     
    }

		

	

}