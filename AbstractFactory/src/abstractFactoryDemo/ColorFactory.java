package abstractFactoryDemo;

public class ColorFactory extends AbstractFactory{
	   @Override
	   public IShape getShape(String shapeType){
	      return null;
	   }
	   //so based on the info passed in the correct object is created
	   @Override
	   IColor getColor(String color) {
	      if(color == null){
	         return null;
	      }		
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	      } else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	      } else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      return null;
	   }
}

//Factory classes extending AbstractFactory to generate object of concrete 
//class based on given information.