package Calculate;
import java.util.Scanner;
import Calculate.arabicCalc;
import Calculate.RomeCalc;
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Привет!!!");
        System.out.println("Калькулятор");
        System.out.println("Введите данные:  ");
        Scanner vvodDannih=new Scanner(System.in);
        String s1=vvodDannih.nextLine();
        calc(s1);

    }


    public static String calc(String input) throws Exception111{
        String[]konsol=input.split(" ");
        String result=null;

        if(konsol.length>3){
            throw new Exception111("вы ввели слишком много знаков");
        }

        switch(konsol[0]){

            case "1":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            case "2":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            case "3":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            case "4":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            case "5":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            case "6":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            case "7":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            case "8":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            case "9":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            case "10":
                result=arabicCalc.arabicCalc(konsol[0],konsol[1],konsol[2]);
                break;
            default:
                result = RomeCalc.romeCalc(RomeCalc.Rome.valueOf(konsol[0]), konsol[1], RomeCalc.Rome.valueOf(konsol[2]));
        }
        return result;
    }
}






