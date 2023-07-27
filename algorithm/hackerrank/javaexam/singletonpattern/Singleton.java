package javaexam.singletonpattern;

class Singleton {
    private Singleton() {

    }

    public String str;
    private volatile static Singleton instance;

    static Singleton getSingleInstance(){
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
