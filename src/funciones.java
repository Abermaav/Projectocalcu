public class funciones {
    private double var1 = 0;
    private double var2 = 0;
    private int opc=0;

    public double getVar1() {
        return var1;
    }

    public void setVar1(double var1) {
        this.var1=this.var1*10+var1;
    }
    public void changeVar1() {
        this.var1=this.var1*-1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2=this.var2*10+var2;
    }

    public void changeVar2() {
        this.var2=this.var2*-1;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    double resultados(){

        switch (opc){
            case 0:
                var1=var1;
                break;
            case 1:
                var1=var1+var2;
                break;
            case 2:
                var1=var1-var2;
                break;
            case 3:
                var1=var1*var2;
                break;
            case 4:
                var1=var1/var2;
                break;
        }

        var2=0;
        opc=0;
        return var1;}

    public void reset() {
        var1 = 0;
        var2 = 0;
        opc = 0;
    }
}
