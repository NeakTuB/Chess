package game;

public class InputHelper {

    /*public static boolean CheckInput(String str) {
        boolean checkInput = false;
        if (str.length() == 5) {
            try {
                Integer.parseInt(str.substring(1, 2));
                Integer.parseInt(str.substring(4, 5));

                ChessService.GetMap().get(str.charAt(0));
                ChessService.GetMap().get(str.charAt(3));

                if (Integer.parseInt(str.substring(1, 2)) > 0 && Integer.parseInt(str.substring(1, 2)) < 9
                        && Integer.parseInt(str.substring(4, 5)) > 0 && Integer.parseInt(str.substring(4, 5)) < 9
                        && ChessService.GetMap().get(str.charAt(0)) > 0 && ChessService.GetMap().get(str.charAt(0)) < 9
                        && ChessService.GetMap().get(str.charAt(3)) > 0 && ChessService.GetMap().get(str.charAt(3)) < 9) {
                    checkInput = true;
                }
            } catch (NumberFormatException e) {
                checkInput = false;
            }
        }
        if(!checkInput){
            System.out.println("Неверный ввод!");
        }
        return checkInput;
    }*/
}
