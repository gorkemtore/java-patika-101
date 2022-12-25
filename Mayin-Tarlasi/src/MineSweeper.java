import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int mineNumber;
    int rndRowNumber;
    int rndColNumber;
    int row;
    int col;
    String [][] gameMap = new String[rowNumber][colNumber];
    String [][] keyMap= new String[rowNumber][colNumber];
    MineSweeper( int rowNumber, int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        this.gameMap = new String [rowNumber][colNumber];
        this.keyMap = new String [rowNumber][colNumber];
        this.mineNumber = (rowNumber * colNumber) / 4;

    }
    public void map(){
        for (int i=0; i<rowNumber; i++){
            for (int j=0; j<colNumber; j++){
                System.out.print(this.gameMap[i][j]="-");
            }System.out.println();
        }

    }

    public void produceMine(){
        Random rnd = new Random();
        for (int i =0; i<mineNumber; i++){
            rndRowNumber=rnd.nextInt(rowNumber);
            rndColNumber=rnd.nextInt(colNumber);
            if (!Objects.equals(this.keyMap[rndRowNumber][rndColNumber], "*")){
                this.keyMap[rndRowNumber][rndColNumber] ="*";
            }else{
                i--;
            }
        }
        for (int i=0; i<rowNumber; i++){
            for (int j=0; j<colNumber; j++){
                if (!Objects.equals(keyMap[i][j], "*")){
                    this.keyMap[i][j]=("-");
                }

            }
        }
    }
    void printKeyMap(){
        produceMine();
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < colNumber; j++){
                System.out.print(this.keyMap[i][j]);
            }
            System.out.println();
        }
    }

    void run(){
        System.out.println("Mayınların Konumu : ");
        printKeyMap();
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        map();
        Scanner input=new Scanner(System.in);
        int right=(this.rowNumber*this.colNumber)-this.mineNumber;
    while (right>0){
            System.out.print("Satır Giriniz : ");
            row=input.nextInt();
            System.out.print("Sütun Giriniz : ");
            col=input.nextInt();
            if((row<0 || row>=this.rowNumber) || (col<0 || col>=this.colNumber)){
                System.out.println("Hatalı giriş yaptınız indis numarasını tekrar giriniz ! ");
                continue;
            }
            if(keyMap[row][col].equals("*")){
                System.out.println("Game Over !!");
                break;
            }else{
                if(!this.keyMap[row][col].equals("-") ){
                    System.out.println("Bu hamleyi zaten yaptınız !");
                }else {
                    int point=0;
                    int lowRow = (row - 1), heighRow = (row + 1);
                    int lowCol = (col - 1), heighCol = (col + 1);

                    if ( (lowRow < 0) ){
                        lowRow = 0;
                    }
                    if (lowCol < 0){
                        lowCol = 0;
                    }
                    if(heighRow >= rowNumber){
                        heighRow = row;
                    }
                    if (heighCol >= colNumber){
                        heighCol = col;
                    }
                    for(int i = lowRow; i <= heighRow; i++){
                        for (int j = lowCol; j<= heighCol; j++){
                            if(this.keyMap[i][j].equals("*")){
                                point++;

                            }
                        }
                    }
                    String pointCounter =Integer.toString(point);
                    this.gameMap[row][col]=pointCounter;
                    right--;

                    for (int i=0; i< gameMap.length; i++){
                        for (int j=0; j<gameMap[i].length; j++){
                            System.out.print(this.gameMap[i][j]);
                        }System.out.println();
                    }
                    System.out.println("============================================");

                }
            }
        }
        if (right==0){
            System.out.println("OYUNU KAZANDINIZ !");
        }

    }
}