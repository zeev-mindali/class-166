package simple_jave.oop_constructor.targil2_hw.cls;

public class Square {
    private int width;
    private int height;

    public Square(){
        this(10,10);
    }

    public Square(int width,int height){
        this.setWidth(width);
        this.setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<0){
            this.width=0;
            return;
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height<0){
            this.height=0;
            return;
        }
        this.height = height;
    }

    public int getArea(){
        return this.width*this.height;
    }

    public int getPerimeter(){
        return this.width*2+this.height*2;
    }

    private String getPrint(char sign){
        //with string (no good for us)
        /*
        String answer="";
        for (int counterRow=0;counterRow<this.height;counterRow++){
            for (int counterCol=0;counterCol<this.width;counterCol++){
                answer+=sign;
            }
            answer+="\n";
        }
        return answer;
        */

        StringBuilder sb = new StringBuilder();
        for (int counterRow=0;counterRow<this.height;counterRow++){
            for (int counterCol=0;counterCol<this.width;counterCol++){
                sb.append(sign);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getPrintRaz(char sign){
        //
        //  ****** method I
        //  *    * method II
        //  *    * method II
        //  ****** method I

        StringBuilder sb = new StringBuilder();
        for (int counterRow=0;counterRow<this.height;counterRow++){
            for (int counterCol=0;counterCol<this.width;counterCol++){
//                if((counterRow==0 || counterRow==(this.height-1)) ||
//                    counterCol==0 || counterCol==(this.width-1)) {
//                    sb.append(sign);
//                } else {
//                    sb.append(' ');
//                }
                boolean myCondition = (counterRow==0 || counterRow==(this.height-1)) || counterCol==0 || counterCol==(this.width-1);
                sb.append(myCondition?sign:" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public String print(){
        return this.getPrintRaz('*');
    }

    public String print(char sign){
        return this.getPrintRaz(sign);
    }

    public String spr() {
        return "========================================================";
    }
}
