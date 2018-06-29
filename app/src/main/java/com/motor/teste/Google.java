package com.motor.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by 15dcc on 2018/5/9.
 */

public class Google {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) throws IOException {
        File fa = new File("/Users/15dcc/Desktop/A.txt");
        File fb = new File("/Users/15dcc/Desktop/B.txt");
        File fc = new File("/Users/15dcc/Desktop/C.txt");
        File fd = new File("/Users/15dcc/Desktop/D.txt");
        FileWriter fisa ;
        FileWriter fisb ;
        FileWriter fisc ;
        FileWriter fisd ;
        //new InputStreamReader(new FileInputStream(file),"UTF-8")
        fisa =new  FileWriter(fa);
        fisb = new FileWriter(fb);
        fisc = new FileWriter(fc);
        fisd = new FileWriter(fd);
        CyclicBarrier cb  = new CyclicBarrier(4);
        new Thread(new Taska(fisa,fisb,fisc,fisd,cb)).start();
        new Thread(new Taskb(fisa,fisb,fisc,fisd,cb)).start();
        new Thread(new Taskc(fisa,fisb,fisc,fisd,cb)).start();
        new Thread(new Taskd(fisa,fisb,fisc,fisd,cb)).start();
    }
}



class Taska implements Runnable{

    CyclicBarrier cb ;
    FileWriter fisa ;
    FileWriter fisb ;
    FileWriter fisc ;
    FileWriter fisd ;
    public Taska(
            FileWriter fisa ,
            FileWriter fisb ,
            FileWriter fisc ,
            FileWriter fisd ,
            CyclicBarrier cb){


        try {
            this.fisa = fisa;
            this.fisb = fisb;
            this.fisc = fisc;
            this.fisd = fisd;
            this.cb = cb;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {

            while(true){

                fisa.write("1");
                fisa.flush();
                cb.await();
                fisd.write("1");
                fisd.flush();
                cb.await();

                fisc.write("1");
                fisc.flush();

                cb.await();
                fisb.write("1");
                fisb.flush();

                cb.await();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}

class Taskb implements Runnable{

    CyclicBarrier cb ;
    FileWriter fisa ;
    FileWriter fisb ;
    FileWriter fisc ;
    FileWriter fisd ;
    public Taskb(
            FileWriter fisa ,
            FileWriter fisb ,
            FileWriter fisc ,
            FileWriter fisd ,
            CyclicBarrier cb){


        try {
            this.fisa = fisa;
            this.fisb = fisb;
            this.fisc = fisc;
            this.fisd = fisd;
            this.cb = cb;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while(true){

                fisb.write("2");
                fisb.flush();
                cb.await();
                fisa.write("2");
                fisa.flush();
                cb.await();
                fisd.write("2");
                fisd.flush();

                cb.await();
                fisc.write("2");
                fisc.flush();
                cb.await();

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}

class Taskc implements Runnable{

    CyclicBarrier cb ;
    FileWriter fisa ;
    FileWriter fisb ;
    FileWriter fisc ;
    FileWriter fisd ;
    public Taskc(
            FileWriter fisa ,
            FileWriter fisb ,
            FileWriter fisc ,
            FileWriter fisd ,
            CyclicBarrier cb){


        try {
            this.fisa = fisa;
            this.fisb = fisb;
            this.fisc = fisc;
            this.fisd = fisd;
            this.cb = cb;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while(true){

                fisc.write("3");
                fisc.flush();
                cb.await();
                fisb.write("3");
                fisb.flush();
                cb.await();
                fisa.write("3");

                fisa.flush();
                cb.await();
                fisd.write("3");
                fisd.flush();
                cb.await();

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}

class Taskd implements Runnable{

    CyclicBarrier cb ;
    FileWriter fisa ;
    FileWriter fisb ;
    FileWriter fisc ;
    FileWriter fisd ;
    public Taskd(
            FileWriter fisa ,
            FileWriter fisb ,
            FileWriter fisc ,
            FileWriter fisd ,
            CyclicBarrier cb){


        try {
            this.fisa = fisa;
            this.fisb = fisb;
            this.fisc = fisc;
            this.fisd = fisd;
            this.cb = cb;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while(true){

                fisd.write("4");
                fisd.flush();
                cb.await();
                fisc.write("4");
                fisc.flush();
                cb.await();
                fisb.write("4");
                fisb.flush();

                cb.await();
                fisa.write("4");
                fisa.flush();
                cb.await();

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}
