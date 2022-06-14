import manager.*;
import goods.*;

public class Main {

        BreadBins bins1 = new BreadBins("Gold", 5, "Red");
        Thermoses thermoses1 = new Thermoses("Aurum", 1, "Blue");
        FoodContainers food1 = new FoodContainers("Steel", 2, "Aqua");
        GoodsInfo[] arrOfInfo = {bins1, thermoses1, food1};
        Manager manager = new Manager(arrOfInfo);
        int a = 0;

        public static void main(String[] args){
            Main main1 = new Main();
            main1.manager.outSortedArrByWeight(main1.arrOfInfo, false);
            main1.manager.outSortedArrByWeight(main1.arrOfInfo, true);

            System.out.println(main1.manager.findByMaterial("Gold").getMaterialType());
        }

    }

