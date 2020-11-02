class RoadTaxCalculator{
public static void main(String args[]){
int vehiclePrice=100000;
String state="KA";
switch (state)

{
case "KA":
float kroadTax=vehiclePrice*0.18f;
float kaVehiclePrice=vehiclePrice+kroadTax;
System.out.println(kaVehiclePrice);
break;
case "AP":
float aroadTax=vehiclePrice*0.20f;
float apVehiclePrice=vehiclePrice+aroadTax;
System.out.println(apVehiclePrice);
break;
case "TS":
float sroadTax=vehiclePrice*0.15f;
float tsVehiclePrice=vehiclePrice+sroadTax;
System.out.println(tsVehiclePrice);
break;
case "MP":
float mroadTax=vehiclePrice*0.09f;
float mpVehiclePrice=vehiclePrice+mroadTax;
System.out.println(mpVehiclePrice);
break;
case "TN":
float troadTax=vehiclePrice*0.08f;
float tnVehiclePrice=vehiclePrice+troadTax;
System.out.println(tnVehiclePrice);
break;
case "UP":
float uroadTax=vehiclePrice*0.10f;
float upVehiclePrice=vehiclePrice+uroadTax;
System.out.println(upVehiclePrice);
break;
default:System.out.println("please choose KA,AP,TS,MP,TN,UP");
}
}
}