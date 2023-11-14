public class Addition extends Operation {
	
	public Addition(Nombre Nb1,Nombre Nb2){
		super(Nb1,Nb2);
	}
	
	public int valeur(){

		
		return this.getOPerande1().getValeurNombre()+this.getOPerande2().getValeurNombre();
	}
	
	public String toString(){
		return "("+this.getOPerande1().getValeurNombre()+" + "+this.getOPerande2().getValeurNombre()+")";
	}
	
}