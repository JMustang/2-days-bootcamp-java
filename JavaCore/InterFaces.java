package JavaCore;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run... ");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : Fast ");
    }
}

class Developer {
    public void devAp(Computer lap) {
        lap.code();
        ;
    }
}

public class InterFaces {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.devAp(lap);
        dev.devAp(desk);
    }
}
