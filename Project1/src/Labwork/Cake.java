package Labwork;

public class Cake {
	 String Shape;
	 java.lang.String Flavour;
	 int Qty;
	 float Price;
	protected Cake() {
		this.Shape=Shape;
		this.Flavour=Flavour;
		this.Qty=Qty;
	}
	
	public String getShape() {
		return Shape;}
	public void setShape(String shape2) {
		this.Shape = Shape;
	}
	public java.lang.String getFlavour() {
		return Flavour;
	}
	public void setFlavour(java.lang.String flavour2) {
		this.Flavour = flavour2;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		this.Qty = Qty;
	}
	public float getPrice(){
		return Qty*400;
	}
	public float setPrice(float Price) {
		return this.Price=Price;
	}
	protected void showCake(String Shape,String Flavour,int Qty) {
		System.out.println("a"+Shape+Flavour+"Cake of"+Qty+"kg/kg's Ready@Rs+price"+"/-");
	}
	
	
}
class OrderCake extends Cake{
	private java.lang.String Message;
	OrderCake(){
		super();
		setShape(Shape);
		setFlavour(Flavour);
		setQty(Qty);
		setPrice(Price);
	}
	OrderCake(String Shape,String Flavour,int Qty){
		super();
		setShape(Shape);
		setFlavour(Flavour);
		setPrice(Qty*(400.00f));
		showCake(Shape,Flavour,Qty);
	}
	private void setFlavour(String flavour) {
		// TODO Auto-generated method stub
		
	}
	OrderCake(String shape,java.lang.String flavour,int Qty,java.lang.String message2){
		super();
		setShape(shape);
		setFlavour(flavour);
		setQty(Qty);
		setPrice(Qty*(400.00f));
		this.Message=message2;
		showCake();
		//showCake(Message, Message, Qty);
	}
	public void showCake() {
		System.out.println("a"+getShape()+""+getFlavour()+"cake of"+getQty()+"kg/kg's"+Message+"@ Rs"+getPrice()+"/-");
	}
}
