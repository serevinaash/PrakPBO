class Engine {
    public int cc;
    public String merek;

    public void On() {
        System.out.println("Mesin ON");
    }

    public void Off() {
        System.out.println("Mesin OFF");
    }
}

class Mobil {
    private Engine mesin;
    public int status;

    public Mobil() {
        mesin = new Engine();
    }

    public void Start() {
        mesin.On();
    }

    public void Run() {
        System.out.println("Run...!");
    }

    public void Stop() {
        mesin.Off();
    }
}

class Program {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.Start();
        mobil.Run();
        mobil.Stop();
    }
}
