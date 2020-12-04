package com.example.adminangkut;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.adminangkut.databinding.ActivityCariDriverBindingImpl;
import com.example.adminangkut.databinding.ActivityDetailBindingImpl;
import com.example.adminangkut.databinding.ActivityMainBindingImpl;
import com.example.adminangkut.databinding.ActivityUpdateDriverBindingImpl;
import com.example.adminangkut.databinding.FragmentBiayaBindingImpl;
import com.example.adminangkut.databinding.FragmentDriverBindingImpl;
import com.example.adminangkut.databinding.FragmentHomeBindingImpl;
import com.example.adminangkut.databinding.FragmentPesananSekarangBindingImpl;
import com.example.adminangkut.databinding.FragmentPesananTerjadwalBindingImpl;
import com.example.adminangkut.databinding.ItemDriverBindingImpl;
import com.example.adminangkut.databinding.ItemPesananBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCARIDRIVER = 1;

  private static final int LAYOUT_ACTIVITYDETAIL = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYUPDATEDRIVER = 4;

  private static final int LAYOUT_FRAGMENTBIAYA = 5;

  private static final int LAYOUT_FRAGMENTDRIVER = 6;

  private static final int LAYOUT_FRAGMENTHOME = 7;

  private static final int LAYOUT_FRAGMENTPESANANSEKARANG = 8;

  private static final int LAYOUT_FRAGMENTPESANANTERJADWAL = 9;

  private static final int LAYOUT_ITEMDRIVER = 10;

  private static final int LAYOUT_ITEMPESANAN = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.activity_cari_driver, LAYOUT_ACTIVITYCARIDRIVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.activity_detail, LAYOUT_ACTIVITYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.activity_update_driver, LAYOUT_ACTIVITYUPDATEDRIVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.fragment_biaya, LAYOUT_FRAGMENTBIAYA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.fragment_driver, LAYOUT_FRAGMENTDRIVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.fragment_pesanan_sekarang, LAYOUT_FRAGMENTPESANANSEKARANG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.fragment_pesanan_terjadwal, LAYOUT_FRAGMENTPESANANTERJADWAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.item_driver, LAYOUT_ITEMDRIVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.adminangkut.R.layout.item_pesanan, LAYOUT_ITEMPESANAN);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCARIDRIVER: {
          if ("layout/activity_cari_driver_0".equals(tag)) {
            return new ActivityCariDriverBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_cari_driver is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDETAIL: {
          if ("layout/activity_detail_0".equals(tag)) {
            return new ActivityDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUPDATEDRIVER: {
          if ("layout/activity_update_driver_0".equals(tag)) {
            return new ActivityUpdateDriverBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_update_driver is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBIAYA: {
          if ("layout/fragment_biaya_0".equals(tag)) {
            return new FragmentBiayaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_biaya is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDRIVER: {
          if ("layout/fragment_driver_0".equals(tag)) {
            return new FragmentDriverBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_driver is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPESANANSEKARANG: {
          if ("layout/fragment_pesanan_sekarang_0".equals(tag)) {
            return new FragmentPesananSekarangBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_pesanan_sekarang is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPESANANTERJADWAL: {
          if ("layout/fragment_pesanan_terjadwal_0".equals(tag)) {
            return new FragmentPesananTerjadwalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_pesanan_terjadwal is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDRIVER: {
          if ("layout/item_driver_0".equals(tag)) {
            return new ItemDriverBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_driver is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPESANAN: {
          if ("layout/item_pesanan_0".equals(tag)) {
            return new ItemPesananBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_pesanan is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "driver");
      sKeys.put(2, "pesanan");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_cari_driver_0", com.example.adminangkut.R.layout.activity_cari_driver);
      sKeys.put("layout/activity_detail_0", com.example.adminangkut.R.layout.activity_detail);
      sKeys.put("layout/activity_main_0", com.example.adminangkut.R.layout.activity_main);
      sKeys.put("layout/activity_update_driver_0", com.example.adminangkut.R.layout.activity_update_driver);
      sKeys.put("layout/fragment_biaya_0", com.example.adminangkut.R.layout.fragment_biaya);
      sKeys.put("layout/fragment_driver_0", com.example.adminangkut.R.layout.fragment_driver);
      sKeys.put("layout/fragment_home_0", com.example.adminangkut.R.layout.fragment_home);
      sKeys.put("layout/fragment_pesanan_sekarang_0", com.example.adminangkut.R.layout.fragment_pesanan_sekarang);
      sKeys.put("layout/fragment_pesanan_terjadwal_0", com.example.adminangkut.R.layout.fragment_pesanan_terjadwal);
      sKeys.put("layout/item_driver_0", com.example.adminangkut.R.layout.item_driver);
      sKeys.put("layout/item_pesanan_0", com.example.adminangkut.R.layout.item_pesanan);
    }
  }
}
