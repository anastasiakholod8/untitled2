public class five {
    public static void main(String[] args) {
         int count=0;

         for (int hour=0; hour<24; hour++){
             for (int minute=0; minute<60; minute++){

                 String hourStr=(hour<10)? "0" + hour : String.valueOf(hour);
                 String  minuteStr=( minute<10)? "0" +  minute : String.valueOf( minute);

                 if (hourStr.charAt(0)==minuteStr.charAt(1) && hourStr.charAt(1)== minuteStr.charAt(0)){
                     count++;
                     System.out.println(hourStr + ":" +minuteStr);
                 }
             }
        }
         System.out.println("Кількість співпадінь симетричних кмбінацій:" + count);
    }
}
