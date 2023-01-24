package ru.itmo.lab4.Transport;

public class Transport {
    private String mode;
    public Transport(String mode){
        this.mode=mode;
    }
    private class AirTransport {
        private String typeOfMovement;
        private String kindTransport;

        private AirTransport(String TypeOfMovement, String kindTransport) {
            this.typeOfMovement = TypeOfMovement;
            this.kindTransport = kindTransport;
        }

        public void crashed() {
            System.out.print("разбились ");
        }
    }
        private class WaterTransport{
            private String typeOfMovement;
            private String kindTransport;
            private WaterTransport(String TypeOfMovement, String kindTransport){
                this.typeOfMovement=TypeOfMovement;
                this.kindTransport=kindTransport;
            }
            public void getDrowned(){
                System.out.print("потонули ");
            }
        }

    public void travelByTransport(){
        if (this.mode == "воздушный"){
            AirTransport Balloon = new AirTransport("летели ", "шаре");
            System.out.print(Balloon.typeOfMovement+"на "+"воздушном "+Balloon.kindTransport+" и ");
            Balloon.crashed();
        } else if (this.mode == "морской") {
            WaterTransport Steamship = new WaterTransport("плыли ","пароходе ");
            System.out.print(Steamship.typeOfMovement+"на "+Steamship.kindTransport+" и ");
            Steamship.getDrowned();

        }

    }
}
