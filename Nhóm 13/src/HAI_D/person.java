/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HAI_D;

/**
 *
 * @author Ken
 */
public class person {

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getThanx1() {
        return thanx1;
    }

    public void setThanx1(int thanx1) {
        this.thanx1 = thanx1;
    }

    public int getThany1() {
        return thany1;
    }

    public void setThany1(int thany1) {
        this.thany1 = thany1;
    }

    public int getThanx2() {
        return thanx2;
    }

    public void setThanx2(int thanx2) {
        this.thanx2 = thanx2;
    }

    public int getThany2() {
        return thany2;
    }

    public void setThany2(int thany2) {
        this.thany2 = thany2;
    }

    public int getChanx1() {
        return chanx1;
    }

    public void setChanx1(int chanx1) {
        this.chanx1 = chanx1;
    }

    public int getChany1() {
        return chany1;
    }

    public void setChany1(int chany1) {
        this.chany1 = chany1;
    }

    public int getChanx2() {
        return chanx2;
    }

    public void setChanx2(int chanx2) {
        this.chanx2 = chanx2;
    }

    public int getChany2() {
        return chany2;
    }

    public void setChany2(int chany2) {
        this.chany2 = chany2;
    }

    public int getChan2x1() {
        return chan2x1;
    }

    public void setChan2x1(int chan2x1) {
        this.chan2x1 = chan2x1;
    }

    public int getChan2y1() {
        return chan2y1;
    }

    public void setChan2y1(int chan2y1) {
        this.chan2y1 = chan2y1;
    }

    public int getChan2x2() {
        return chan2x2;
    }

    public void setChan2x2(int chan2x2) {
        this.chan2x2 = chan2x2;
    }

    public int getChan2y2() {
        return chan2y2;
    }

    public void setChan2y2(int chan2y2) {
        this.chan2y2 = chan2y2;
    }

    public int getTay1x1() {
        return tay1x1;
    }

    public void setTay1x1(int tay1x1) {
        this.tay1x1 = tay1x1;
    }

    public int getTay1y1() {
        return tay1y1;
    }

    public void setTay1y1(int tay1y1) {
        this.tay1y1 = tay1y1;
    }

    public int getTay1x2() {
        return tay1x2;
    }

    public void setTay1x2(int tay1x2) {
        this.tay1x2 = tay1x2;
    }

    public int getTay1y2() {
        return tay1y2;
    }

    public void setTay1y2(int tay1y2) {
        this.tay1y2 = tay1y2;
    }

    public int getTay2x1() {
        return tay2x1;
    }

    public void setTay2x1(int tay2x1) {
        this.tay2x1 = tay2x1;
    }

    public int getTay2y1() {
        return tay2y1;
    }

    public void setTay2y1(int tay2y1) {
        this.tay2y1 = tay2y1;
    }

    public int getTay2x2() {
        return tay2x2;
    }

    public void setTay2x2(int tay2x2) {
        this.tay2x2 = tay2x2;
    }

    public int getTay2y2() {
        return tay2y2;
    }

    public void setTay2y2(int tay2y2) {
        this.tay2y2 = tay2y2;
    }
    
    int x1;
    int y1;
    int r;
    int thanx1;
    int thany1;
    int thanx2;
    int thany2;
    
    int chanx1;
    int chany1;
    int chanx2;
    int chany2;
    int chan2x1;
    int chan2y1;
    int chan2x2;
    int chan2y2;
    
    int tay1x1;
    int tay1y1;
    int tay1x2;
    int tay1y2;
    int tay2x1;
    int tay2y1;
    int tay2x2;
    int tay2y2;
    
    void dau(int x,int y,int rr){
        this.x1 =x;
        this.y1=y;
        this.r=rr;
    }
    void than(){
        this.thanx1=this.x1;
        this.thany1=this.y1-r;
        this.thanx2=this.x1;
        this.thany2=this.thany1-50;
    }
    
    void chan(){
    this.chanx1=this.x1;
    this.chany1=this.thany2;
    this.chanx2=this.x1+30;
    this.chany2 = this.thany2-50;
    
    this.chan2x1=this.x1;
    this.chan2y1=this.thany2;
  //  if(x1-((this.chanx2 - x1))>0){
      //  this.chan2x2=this.chanx2 - x1;
    //}else{this.chan2x2= (this.chanx2 - x1);}
    this.chan2x2= x1-(this.chanx2 - x1);
    this.chan2y2=this.chany2;
    }
    void tay(){
        this.tay1x1=this.x1;
        this.tay1y1=this.thany1-15;
        this.tay1x2 = this.chanx2;
        this.tay1y2=this.tay1y1 - 25;
        
        this.tay2x1=this.tay1x1;
        this.tay2y1=this.tay1y1;
        this.tay2x2=x1-( this.tay1x2-x1);
        this.tay2y2 = this.tay1y2;
    }
    
}
