package Calculate;

 class arabicCalc {
    static  String arabicCalc(String chisloArab1, String operator, String chisloArab2) throws Exception111 {


           if(Integer.parseInt(chisloArab1)>10|Integer.parseInt(chisloArab2)>10){
             throw new Exception111("Недопустимое значение операндов");}
           if(operator.charAt(0)!= '+'& operator.charAt(0)!= '-'& operator.charAt(0)!= '*'& operator.charAt(0)!= '/'){
               throw new Exception111("Недопустимое значение оператора");
          }


        String result = null;

        switch (operator) {
            case "+":
                String result1 = "" + (Integer.parseInt(chisloArab1)) + (Integer.parseInt(chisloArab2));
                System.out.println(Integer.parseInt(chisloArab1) + Integer.parseInt(chisloArab2));
                result = result1;
                break;
            case "-":
                String result2 = "" + (Integer.parseInt(chisloArab1) - Integer.parseInt(chisloArab2));
                System.out.println(Integer.parseInt(chisloArab1) - Integer.parseInt(chisloArab2));
                result = result2;
                break;
            case "*":
                String result3 = "" + (Integer.parseInt(chisloArab1)) * (Integer.parseInt(chisloArab2));
                System.out.println(Integer.parseInt(chisloArab1) * Integer.parseInt(chisloArab2));
                result = result3;
                break;
            case "/":
                String result4 = "" + (Integer.parseInt(chisloArab1)) / (Integer.parseInt(chisloArab2));
                System.out.println(Integer.parseInt(chisloArab1) / Integer.parseInt(chisloArab2));
                result = result4;
                break;
        }
        return result;
    } }




