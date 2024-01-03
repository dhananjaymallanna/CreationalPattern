package org.example.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class ApparelStore implements Cloneable {
  private String storeName;
  List<Clothes> cloth = new ArrayList<>();
  public String getStoreName() {
    return storeName;
  }
  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }
  public List<Clothes> getCloth() {
    return cloth;
  }
  public void setcloth(List<Clothes> cloth) {
    this.cloth = cloth;
  }
  public void fetchData() {
    for (int i = 0; i < 15; i++) {
      Clothes cloth = new Clothes();
      cloth.setClothsku(i);
      cloth.setClothtype("Type is  " + i);
      getCloth().add(cloth);
    }
  }
  @Override
  public String toString() {
    return "Apparelstore [storename=" + storeName + ", cloth=" + cloth + "]";
  }
  public ApparelStore cloneStore() {
    ApparelStore appstore = new ApparelStore();
    for (Clothes cl : this.getCloth()) {
      appstore.getCloth().add(cl);
    }
    return appstore;
  }
}