package manager;

import goods.GoodsInfo;
import java.util.*;

    public class Manager{
    private GoodsInfo[] arrOfInfo;

    public GoodsInfo[] sortByWeight(GoodsInfo[] setArrOfinfo, boolean direction){
        GoodsInfo[] arrOfInfoType = setArrOfinfo;
        Comparator sortByDate = Comparator.comparing(GoodsInfo::getWeight);
        if (direction == true){
            Arrays.sort(arrOfInfoType, sortByDate);
        }
        else {
            Arrays.sort(arrOfInfoType, sortByDate.reversed());
        }
        return arrOfInfoType;
    }

    public GoodsInfo[] sortByColour(GoodsInfo[] serArrOfInfo, boolean direction){
        GoodsInfo[] arrOfInfoType = serArrOfInfo;
        Comparator sortByDate = Comparator.comparing(GoodsInfo::getColour);
        if(direction == true){
            Arrays.sort(arrOfInfoType, sortByDate);
        }
        else {
            Arrays.sort(arrOfInfoType, sortByDate.reversed());
        }
        return arrOfInfoType;
    }

    public GoodsInfo findByMaterial(String materialFind){
        for (GoodsInfo goodsInfo : arrOfInfo){
            if (goodsInfo.getMaterialType() == materialFind){
                return goodsInfo;
            }
        }
        return null;
    }

    public void outSortedArrByWeight(GoodsInfo[] setArrOfInfo, boolean direction){
        for (GoodsInfo goodsInfo : sortByWeight(arrOfInfo, direction)){
            System.out.println(goodsInfo.getWeight());
        }
    }

    public void outSortedByColour(GoodsInfo[] setArrOfInfo, boolean direction){
        for (GoodsInfo goodsInfo : sortByColour(arrOfInfo, direction)){
            System.out.println(goodsInfo.getColour());
        }
    }
    public Manager(GoodsInfo[] setArrOfInfo){
        arrOfInfo = setArrOfInfo;
    }
}