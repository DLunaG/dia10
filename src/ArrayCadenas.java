public class ArrayCadenas {
    //crear una array de strings e iterar de arriba a abajo y viceversa.

    public static void main(String[] args) {

        String[] stringArray = new String[] { "hola", "mundo", " ", "desde", "java"};

        for(int i = 0; i < stringArray.length; i++){
            if(stringArray[i].equals(" ")){
                //System.out.print(stringArray[i]);
            }else {
                System.out.print(stringArray[i] + " ");
            }
            //con la funcion .equals() voy a obviar cuando la string a sacar es un espacio, ya que añado un espacio en cada palabra
        }
        System.out.println();
        for(int i = stringArray.length-1; i >= 0; i--){
            if(stringArray[i].equals(" ")){
                //System.out.print(stringArray[i]);
            }else {
                System.out.print(stringArray[i] + " ");
            }
        }
    }
}
