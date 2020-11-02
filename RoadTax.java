class RoadTax{
public static void main(String args[]){
int vehiclePrice=10000;
String state="AP";
switch (state)

{
case "KA":
float kroadTax=vehiclePrice*0.18f;
System.out.println(kroadTax);
break;
case "AP":
float aroadTax=vehiclePrice*0.20f;
System.out.println(aroadTax);
break;
case "TS":
float sroadTax=vehiclePrice*0.15f;
System.out.println(sroadTax);
break;
case "MP":
float mroadTax=vehiclePrice*0.09f;
System.out.println(mroadTax);
break;
case "TN":
float troadTax=vehiclePrice*0.08f;
System.out.println(troadTax);
break;
case "UP":
float uroadTax=vehiclePrice*0.10f;
System.out.println(uroadTax);
break;
default:System.out.println("please choose KA,AP,TS,MP,TN,UP");
}
}
}